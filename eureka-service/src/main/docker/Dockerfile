FROM openjdk:8-jre-alpine 
WORKDIR application
ADD maven/${project.build.finalName}.jar ./
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "${project.build.finalName}.jar"]