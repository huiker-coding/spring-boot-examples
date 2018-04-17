FROM java:latest
COPY target/*.jar app.jar
RUN bash -c 'touch ./app.jar'
EXPOSE 8080
CMD ["java","-jar","app.jar"]