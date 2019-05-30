package bonjour;

import org.jooby.Jooby;

/**
 * Hello world gradle project.
 */
public class App extends Jooby {

  {
    get(req -> {
      String name = req.param("name").value("");
      if (name != "") {
        return "Bonjour " + name + "!";
      } else {
        return "Bonjour!";
      }
    });
  }

  public static void main(String[] args) {
    run(App::new, args);
  }
}
