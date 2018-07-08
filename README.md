# Spring Boot - JBoss Wildfly demo app

## Description

This is a sample project that shows how to deploy a `war` file with a Spring Boot 2 application on a Wildfly server, included in a post at [The Practical Developer site](https://thepracticaldeveloper.com/2017/09/02/how-to-deploy-a-spring-boot-war-in-wildfly-jboss/)

## Instructions

First, you need to generate the package using Maven:

`mvn clean package`

Then, copy the generated `war` file in the `target` directory to the `docker` folder, build the docker image using the included `Dockerfile` and run it. You should be able to reach the endpoint via `http://localhost:8080/hola`.

The complete instructions [are here](https://thepracticaldeveloper.com/2017/09/02/how-to-deploy-a-spring-boot-war-in-wildfly-jboss/).