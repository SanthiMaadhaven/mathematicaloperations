FROM openjdk:11
EXPOSE 8084
ADD target/mathematicaloperations.jar mathematicaloperations.jar
ENTRYPOINT ["java", "-jar", "/mathematicaloperations.jar"]