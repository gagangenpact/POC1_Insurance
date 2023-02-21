FROM openjdk:8
ADD target/poc_insurance.jar poc_insurance.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","poc_insurance.jar"]
