package com.restaurant.repository;

import com.restaurant.model.Person;
import com.restaurant.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findPersonByEmail(String email);

}
