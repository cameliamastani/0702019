package fr.camelia.cda.cinema.dao;

import fr.camelia.cda.cinema.model.Film;
import fr.camelia.cda.cinema.model.Genre;
import org.springframework.data.repository.CrudRepository;




public interface GenreDao extends CrudRepository<Genre, Long> {

}
