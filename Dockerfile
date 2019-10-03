FROM debian
RUN apt update && apt install wget -y && apt install default-jre -y
COPY target/jackson-databind-cves-0.0.1-SNAPSHOT.jar /jackson-databind-cves-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/jackson-databind-cves-0.0.1-SNAPSHOT.jar"]