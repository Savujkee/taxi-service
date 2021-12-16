# Taxi service

This basic web application simulates structure of a taxi service. It allows an
authenticated user to view and change contents of a taxi service database.

### Capabilities:

- authenticate existing *drivers*;
- add/register *driver*;
- display *drivers* and delete them;
- add new *car manufacturer*;
- display *car manufacturers* and delete them;
- add new *car*;
- display *cars* and delete them;
- assign *driver* to *car*;
- display list of *cars* that current authenticated *driver* is assigned to.

-----------------------------------  

### Implementation details:

- 3-tier architecture:
  - DAO
  - services 
  - controllers

#### DB schema 

![schema](Https://i.imgur.com/gw1qj0C.png)

________________

### Technologies used:

- JDBC
- JSTL
- JSP
- Maven
- MySQL
- Log4j
- Tomcat
- Servlet API

--------------

### How to run the app:

1. Configure Apache Tomcat for your IDE
2. Configure MySQL
3. Create a *taxi_service* DB schema. Script can be found in *resources/init_db.sql* 
4. Specify USERNAME, PASSWORD and URL in */util/ConnectionUtil.java*
5. To use logger, enter LOG FILE PATH in *resources/log4j2.xml*
6. Start Tomcat
