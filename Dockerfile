FROM openjdk:17
COPY build/libs/ms22-task-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java"]
CMD ["-jar", "/app/ms22-task-0.0.1-SNAPSHOT.jar"]