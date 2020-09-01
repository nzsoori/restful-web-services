## Springboot - RESTFUL-WEB-services

Goal Design and implement a RESTful API to retrieve user information. 

#have developed in Intellij Idea and   start.Spring.io using make sure java 8, Maven, springboot 2.3.3
 used Spring Web  / Spring Data JPA  / H2 Database in memory database


##  Features 
1. The API must have the ability for a client to retrieve users matching a requested surname 

#have added api endpoints:

default is http://localhost:8080/users

User Resource Controller implemented following 

## getmapping endPoints

# all users
/users

# user by surname
/users/search/surname/{surname}

# user by firstname
/users/search/firstname/{firstname}

# user by emailaddress
/users/search/emailaddress/{emailaddress}




2. Each user’s details are to contain the following information: a. Surname b. First name c. Email address 



## Technical Requirements 


1. The service is  implemented using Spring Boot. Other Java dependencies/libraries can be included for required functionality 


used https://start.spring.io/ to initialize project , dependencies added Spring Web,Spring Data JPA H2 Database


2. User data can be pre-populated, 

it is pre-populated in h2 addded data.sql for sample data   also

or 

a RESTful endpoint exposed to add users to the system

## post mapping userinfo RESTful  implemented to add users using post

/users

use any rest client : postman/apitester
method: post, url  http://localhost:8080/users

headers: Content-type: application/json  

 in body: 
 
 example : {
  "surname":"lastname",
  "firstname":"firstname",
  "emailaddress":"test@test.com"
}

## How to Build

Get a Project with code

#Clone/Download the repo 
** Make sure you have Maven and JDK Version >= 1.8 **
git clone https://github.com/nzsoori/restful-web-services.git

# change directory to repo
 restful-web-services

# install the repo with mvn
mvn install

# start the application
In terminal 
 from project folder 
restful-web-services>     mvnw clean spring-boot:run



## from Zip file  in Intellij Idea
# download https://github.com/nzsoori/restful-web-services/archive/master.zip
unzip to a folder  from intellij import a project pick pom.xml  will dowload all dependencies

 Run the Application :  run Main class  RestfulWebServicesApplication 
 
 able to access from http://localhost:8080/users and other endpoints as mentioned
 
 




