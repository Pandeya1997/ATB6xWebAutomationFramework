### Selenium Automation Framework(with Java)
Author - Abhishek Pandey

1. Tech Stack of Web Automation
2. Programming - Java ( JDK > 22, IntelliJ)
3. User Interactions, browser Automation Selenium
4. Test Framework -> TestNG
5. Build Management -> Maven
6. Reporting - Allure Report, Extent Report.
7. Data Driven - DDT Apache POI.
8. CI / CD -> GIT, Jenkins
9. Coding Best Practice- SonarLint
10. Logs - Log4j
11. Remote Selenium Grid - Cloud Grid, Selenoid





<img width="1024" alt="279284439-02b0ef3b-1165-46cf-8c9d-89e41b17032f" src="https://github.com/user-attachments/assets/76139af6-d933-41e2-9983-6e68e15306e9">

<img width="1215" alt="279284486-b0905741-d88d-4559-93c2-65433e668170" src="https://github.com/user-attachments/assets/5d18ad54-9a11-4740-a8a1-0763463675eb">

### **Seleniod - Docker Grid Running**

Selenoid is a powerful tool for running Selenium tests in Docker containers.
which can help you manage and scale your test automation infrastructure more efficiently.


### **Seleniod - Docker Grid Running**

Selenoid is a powerful tool for running Selenium tests in Docker containers.
which can help you manage and scale your test automation infrastructure more efficiently.
 
## How to Add Loog4j in the Project ?
````
<dependency>     
 <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-core</artifactId>
      <version>3.0.0-beta2</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-api</artifactId>
      <version>3.0.0-beta2</version>
    </dependency> 
````

- Add log4j2.xml in main Folder --> resource 
- https://gist.github.com/PramodDutta/36ec0a2460e0ec796b7fe6b186a008b5
- To your code 
- ``
  private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF_DM.class);

file
logger.info("Starting Test");

``
