FROM debian
RUN apt update && apt install wget -y && apt install default-jre -y
COPY target/jackson-databind-cves-*.jar /jackson-databind-cves.jar
ENTRYPOINT ["java", "-jar", "/jackson-databind-cves.jar"]