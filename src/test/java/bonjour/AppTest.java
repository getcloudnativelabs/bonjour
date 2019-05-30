package bonjour;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import org.jooby.test.JoobyRule;
import org.junit.ClassRule;
import org.junit.Test;

public class AppTest {

  /**
   * One app/server for all the test of this class. If you want to start/stop a new server per test,
   * remove the static modifier and replace the {@link ClassRule} annotation with {@link Rule}.
   */
  @ClassRule
  public static JoobyRule app = new JoobyRule(new App());

  @Test
  public void integrationTest() {
    when().
      get("/").
    then().
      body(equalTo("Bonjour!")).
      statusCode(200);
  }

  @Test
  public void nameParamIntegrationTest() {
    given().
      queryParam("name", "Pierre").
    when().
      get("/").
    then().
      body(equalTo("Bonjour Pierre!")).
      statusCode(200);
  }
}
