#!/bin/bash
cp ../target/jboss-wildfly-demo-1.0.0-SNAPSHOT.war .
docker build -t wildfly-springboot-app .
read -rsp $'Press enter to continue...\n'