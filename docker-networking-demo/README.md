# Docker Networking Demo Project #

This is the docker networking project.

### What is this repository for? ###

* Docker networking
* Version 1.0
* [Docker repo](https://aarfiahmed@bitbucket.org/aarfi/docker-repo.git)

### Project Details ###

#### emp-producer ####
This microservice will return the emp details. this is the producer application.
* GET localhost:8080/emp


#### emp-consumer ####
This is the consumer application, and it will call emp-producer to generate the result.
consumer application will call the producer by container name.   Here we are using the docker network to interaction between these two services.
* GET localhost:9191/getAllEmp

### Docker commands which will be used ###

* first create docker network by using the command  
    - docker network create emp-service-network
* build and run the emp-producer by command  
     - docker build -t emp-producer:latest .  
     - docker run --name producer -p 8080:8080 --network emp-service-network emp-producer
* build and run the emp-consumer application by command  
     - docker build -t emp-consumer:latest .  
     - docker run --name consumer -p 9191:9191 --network emp-service-network emp-consumer:latest

### Author ###

* Aarfi Ahmed Siddique
 