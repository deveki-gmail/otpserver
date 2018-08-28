FROM openjdk:8
ADD otpserver.jar otpserver.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","otpserver.jar"]