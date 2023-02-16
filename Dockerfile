FROM maven:3.6.0
WORKDIR /TestToolsQA
COPY . .
CMD["mvn" ,"TestRegisterPage", "TestBasePage"]