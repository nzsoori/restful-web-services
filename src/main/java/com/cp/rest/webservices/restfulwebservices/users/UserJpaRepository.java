package com.cp.rest.webservices.restfulwebservices.users;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserJpaRepository extends JpaRepository<User , Long> {
    List<User> findBySurname(String surname);
    List<User> findByFirstname(String firstname);
    List<User> findByEmailaddress(String emailaddress);
}
