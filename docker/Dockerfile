# You can use the official wildfly image if you're planning to run Java 8 web apps
FROM mechero/wildfly:13.0.0-openjdk-10

# Expose the default's application port
EXPOSE 8080

# Copy the war file to the deployments folder
COPY jboss-wildfly-demo-1.0.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/jboss-wildfly-demo.war
