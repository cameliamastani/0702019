package fr.camelia.cda.cinema.dao;




import fr.camelia.cda.cinema.model.Film;
import org.springframework.data.repository.CrudRepository;




public interface FilmDao extends CrudRepository<Film, Long> {

}
