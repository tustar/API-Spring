#!/bin/bash

appName=api
appDir=/root/code/API-Spring

deploy() {
  cd appDir
  mvn clean
  mvn package
  java -jar "target/$appName-*.jar"
}