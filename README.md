#maven-site-docs-example
This is a very simple Java project, intended to illustrate the use of a number of Maven plugins related to site documentation.

To use, simply check out and run:

``mvn clean verify site
``

If you only run mvn clean site, you will generate most of the reports, but not the code coverage data.  Code coverage
requires the test suite to run.

## Requirements
- [Maven 3.1.0](http://maven.apache.org/)
- Java 1.7+

