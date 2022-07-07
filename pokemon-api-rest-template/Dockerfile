FROM gradle:7.2-jdk17 as gradle
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew clean build --no-daemon

ENTRYPOINT ["java", "-jar", "/home/gradle/src/build/libs/pokemon-api-rest-template-0.0.1-SNAPSHOT.jar"]