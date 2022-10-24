FROM openjdk:11

VOLUME /tmp

# We use maven dir here because the fabric8 plugin is used to build docker images
COPY maven/spring-docker-test-0.0.1-SNAPSHOT.jar myapp.jar

RUN sh -c 'touch /myapp.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/myapp.jar"]
