#!/bin/bash
./mvnw clean package
docker build -t wildfly-springboot-app:1.0 .
docker build -t tomcat-app:1.0 -f ./Dockerfile-tomcat .
read -rsp $'Press enter to continue...\n'
