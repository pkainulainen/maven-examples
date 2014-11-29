This an example application of my blog post:

* [Integration Testing with Maven](http://www.petrikainulainen.net/programming/maven/integration-testing-with-maven/)

You can run unit tests by running the following command at the command prompt:

    mvn clean test

You can run integration tests by running the following command at the command prompt:

    mvn clean verify -P integration-test
    