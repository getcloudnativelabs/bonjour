.PHONY: all
all: test build

.PHONY: build
build:
	./gradlew build

.PHONY: test
test:
	./gradlew test
