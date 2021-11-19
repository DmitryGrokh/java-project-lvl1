install:
	./gradlew clean install

make lint-check:
	./gradlew checkstyleMain

run-dist:
	./build/install/app/bin/app

check-updates:
	./gradlew dependencyUpdates

build:
	./gradlew clean build