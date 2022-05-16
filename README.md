Technologies/Tools used in building the framework
=================================================

- IntelliJ - IDE
- Appium - Mobile Automation library
- Maven - Build automation tool
- Java - Programming language
- Cucumber - BDD
- Gherkin - DSL
- JUnit - Unit testing framework
- Log4J - Logging framework
- Extent Reports - Reporting framework
- JSON - Test Data
- XML - Static text
- GitHub - Version control

Framework implements below best practices
=========================================

- Code reusability
- Code readability
- Scalable automation (demonstrated using multiple test classes)
- Uses explicit waits
- Abstraction layer for UI commands like click, sendkeys, etc.
-  config.properties
- Supports iOS and Android
- How to recover from test failure/ how to write fail safe test cases
- Scrolling for both Android and iOS (using touchaction, uiScrollable)
- Demonstrates how to effectively capture Screenshots/Videos
- Supports parallel execution using JUnit
- Supports parallel execution on multiple real Android and iOS devices
- Start Appium server programmatically
- Supports Cucumber-HTML-Reporter plugin
- Integrated with Log4J2 Logging framework

Framework implementation flow
=========================================

1. src/main/java/utils - All utility functions & driver manager intialization and teardown, capabilities, reading
   properties
2. src/main/resources - Configuration property file, Log4j configuration file
3. src/test/java/hooks - Enable recording video of execution locally, Taking screen shot if any test fails
   6.src/test/java/pages - All POM design pattern page classes
4. src/test/java/runners - Runner class that run with tag name, cucumber report and options
5. src/test/Stepdef - All the step definitions
6. src/test/resources/apps - Apps[.apk or .app file] location to install on emulator/simulator devices
7. src/test/resources/features - Feature files where we write all scenarios

Assumptions
=========================================
1.All the elements accessbility ids/xpath or locators are hard coded values as of now
2. .app or .apk files are present in src/test/resources/apps directory

So, due to that this project will not run successfully with created test cases. Mainly concentrated on design
framework, implementation and reusable code.