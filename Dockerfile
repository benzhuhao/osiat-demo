FROM openjdk:8-jdk-alpine
COPY build/libs/evs-demo.jar /opt/deployment/evs-demo.jar
WORKDIR /opt/deployment
#USER 1001
ENTRYPOINT ["java","-jar","evs-demo.jar","-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap"]
EXPOSE 8080