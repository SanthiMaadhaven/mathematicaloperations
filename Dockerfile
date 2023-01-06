FROM openjdk:17
VOLUME /tmp
EXPOSE 8084
ADD target/mathematicaloperations.jar mathematicaloperations.jar
ENTRYPOINT ["java", "-jar", "/mathematicaloperations.jar"]