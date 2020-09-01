## RESTFUL-WEB-services

Goal Design and implement a RESTful API to retrieve user information. 

#have used Spring Web  / Spring Data JPA  / H2 Database in memory database


##  Features 
1. The API must have the ability for a client to retrieve users matching a requested surname 

#have added api endpoints:

default is http://localhost:8080

User Resource Controller implemented following 

## getmapping endPoints

/users

/users/search/surname/{surname}

/users/search/firstname/{firstname}

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
