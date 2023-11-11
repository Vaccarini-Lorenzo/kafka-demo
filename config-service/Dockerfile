FROM openjdk:21-jdk
VOLUME /tmp
ADD target/config-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8888
ENV JAVA_OPTS="-XX:+UseContainerSupport -XshowSettings:vm "
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]