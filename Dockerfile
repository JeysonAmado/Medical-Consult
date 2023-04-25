# Imagen base
FROM openjdk:17

# Metadata
LABEL maintainer="Jeyson Amado & Duvan Salcedo"
LABEL version="1.0"
LABEL description="Medical Consult IA"

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 5000

ENTRYPOINT ["java","-jar","/app.jar"]

#docker build -t jeysonamado/medical_consult_ia:azure .