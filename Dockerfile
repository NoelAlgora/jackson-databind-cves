FROM debian

RUN apt update && apt install wget -y && apt install default-jre -y
RUN echo "*****\n*****\n" | passwd
	
COPY target/jackson-databind-cves-*.jar /jackson-databind-cves.jar

ENTRYPOINT ["java", "-jar", "/jackson-databind-cves.jar"]
