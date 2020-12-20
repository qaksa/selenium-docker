FROM openjdk:8u275-jre

RUN apt update
RUN apt --assume-yes install jq

WORKDIR /usr/share/ksa

ADD target/selenium-docker.jar selenium-docker.jar
ADD target/selenium-docker-tests.jar selenium-docker-tests.jar
ADD target/libs libs

ADD testNG.xml testNG.xml

ADD healthcheck.sh healthcheck.sh

ENTRYPOINT sh healthcheck.sh