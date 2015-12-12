This is the example application of my blog post:

* [Generating HTML Documentation From RAML Documents With Maven](http://www.petrikainulainen.net/programming/maven/generating-html-documentation-from-raml-documents-with-maven/) 

Prerequisites
=============

You need to install the following tools if you want to run this application:

Java Tools
---------

* [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven](http://maven.apache.org/) (this application is tested with Maven 3.3.3)

Other Tools
----------

* [Node.js](http://nodejs.org/)
* [NPM](https://www.npmjs.com/)
* [raml2html](https://github.com/raml2html/raml2html)

Don't know how to install these tools? [Read my blog post](http://www.petrikainulainen.net/programming/maven/generating-html-documentation-from-raml-documents-with-maven/).

Creating the HTML API Documentation
===================================

You can create the HTML API documentation by running the following command at the command prompt:

	mvn clean package

This creates the _api.html_ file to the _target_ directory.