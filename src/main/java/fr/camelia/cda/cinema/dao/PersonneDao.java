package fr.camelia.cda.cinema.dao;

import fr.camelia.cda.cinema.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonneDao extends CrudRepository<Person, Long> {



}
