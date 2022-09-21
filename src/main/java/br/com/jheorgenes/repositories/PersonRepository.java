package br.com.jheorgenes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jheorgenes.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}
