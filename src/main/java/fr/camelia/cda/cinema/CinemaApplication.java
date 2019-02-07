package fr.camelia.cda.cinema;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
    }
/*
    @Bean

    public CommandLineRunner runner(FilmDao dao){
        return new CommandLineRunner() {
            @Override
            @Transactional
            public void run(String... args) throws Exception {
                Iterable<Film> films = dao.findAll();
                for (Film film: films
                ) {
                    System.out.println(film.getTitle()+ " réalisé par "+film.getRealisateur().getSurname());
                }
                Optional<Film> film = dao.findById(1L);
                System.out.println(film.get().getTitle());
            }
        };
    }
*/
}


