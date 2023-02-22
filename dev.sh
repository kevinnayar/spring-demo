#!/bin/bash

# set env vars
export $(grep -v '^#' .env | xargs)

# build
mvn -Dmaven.javadoc.skip=true -Dmaven.test.skip=true clean install

# run
java -jar ./target/demo-0.0.1-SNAPSHOT.jar

# run
# ./mvnw spring-boot:run