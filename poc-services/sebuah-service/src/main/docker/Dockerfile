FROM openjdk:8-jre-alpine 
WORKDIR application
ADD maven/${project.build.finalName}.jar ./
ENTRYPOINT [ "java", "-Xmx128m", "-Djava.security.egd=file:/dev/./urandom", "-jar", "${project.build.finalName}.jar" ]