package fr.camelia.cda.cinema.dao;

import fr.camelia.cda.cinema.model.Play;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface RoleDao extends CrudRepository<Play, Long> {
    public Set<Play> findAllByOrderByIdAsc();
  public List<Play> findByFilmIdOrderByRank(long id);
}
