Hi Subhadeep Mitra Here....! Patient Registration through a mobile or web portal using SpringBoot, Log4j.

I have created a Patient Registration through a mobile or web portal using SpringBoot, Log4j, JUnit, MySql, Swagger.

Technology Used: -SpringBoot Framework: Spring Boot provides a platform for Java developers to develop a stand-alone and production-grade spring application that you can just run. You can get started with minimum configurations without the need for an entire Spring configuration setup. -Log4j: log4j is a reliable, fast and flexible logging framework (APIs) written in Java, which is distributed under the Apache Software License. for using Log4j we need to add the log4j dependency in pom.xml. -JUnit: JUnit is an open-source, Java-based unit testing framework that plays a crucial role in achieving the culture of TDD (Test Driven Development). It helps to increase the software stability. -Maven: When the project has a large number of dependencies. Then, using Maven, you can easily manage those dependencies. When the version of a dependency changes frequently. Maven makes it simple to handle continuous builds, integration, and testing. It helps in compiling source code, and then packaging it into JAR or ZIP files.

Patient record is a plateform Where doctors can register their patients through mobile or web portal. For this I have created backend API to get the task like:

Adding a patient record
Updating an existing patient record
Deleting a patient record
Fetching all the patient records in order.

Patient records is containing the following fields with validation at the backend:

Name
Address
Email
Phone number
Password
Database: I used MySQL database and database name is hospital and added mysql dependencies in pom.xml file and configure mysql in application.properties file

Extra Functionality I used like: -Swagger: Swagger is an open source project used to generate the REST API documents for RESTful web services. -JUnit: JUnit is an open-source, Java-based unit testing framework that plays a crucial role in achieving the culture of TDD (Test Driven Development). It helps to increase the software stability. -Log4j: log4j is a reliable, fast and flexible logging framework (APIs) written in Java, which is distributed under the Apache Software License. for using Log4j we need to add the log4j dependency in pom.xml.