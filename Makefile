PROJECT := bonjour

.PHONY: all
all: build deploy test release

.PHONY: build
build:
	@echo Building repository ${PROJECT}
	./gradlew build

.PHONY: deploy
deploy:
	@echo Deploying repository ${PROJECT}

.PHONY: test
test:
	@echo Testing repository ${PROJECT}
	./gradlew test

.PHONY: release
release:
	@echo Releasing repository ${PROJECT}
