package fr.camelia.cda.cinema.web;

import fr.camelia.cda.cinema.dao.FilmDao;
import fr.camelia.cda.cinema.dao.PersonneDao;
import fr.camelia.cda.cinema.dao.RoleDao;
import fr.camelia.cda.cinema.model.Film;
import fr.camelia.cda.cinema.model.Person;
import fr.camelia.cda.cinema.model.Play;
import fr.camelia.cda.cinema.service.ImageManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.management.relation.RoleResult;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/film")
public class FilmController {
    @Autowired
    FilmDao filmDao;
    @Autowired
    PersonneDao personneDao;


    @Autowired
    ImageManager imm;

    @Autowired
    RoleDao roleDao;

//    @Value("${cinema.img.path}")
    String path = "static/images/affiches/";

    @GetMapping("/list")
    public String list(Model model){
        Iterable<Film> films = filmDao.findAll();
        model.addAttribute("films", films);
        model.addAttribute("title","Liste des films : " + ((Collection<?>)films).size());
        return "film/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id")long id, Model model){
        Film film;

        film = filmDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid request"));
Person person;
        person=personneDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid request"));

        List<Play> roles;
        roles= roleDao.findByFilmIdOrderByRank(id);

model.addAttribute("roles",roles);

        model.addAttribute("film", film);


model.addAttribute("persons",person);


        model.addAttribute("title","Film : " + film.getTitle());
        return "film/detail";
    }

    @GetMapping("/mod/{id}")
    public String mod(@PathVariable("id")long id, Model model){
        model.addAttribute("film", filmDao.findById(id).get());
        model.addAttribute("title","modification");
        return "film/form";
    }

    @GetMapping("/add")
    public String add(Model model){
        Iterable<Film> films = filmDao.findAll();
        model.addAttribute("films", films);
        model.addAttribute("film", new Film());
        model.addAttribute("title","ajouter un film ");//dans fragment header partie hieder-css j'ai definir un cle  <title th:text="${title ?: 'Cinema'}"></title> et le cle c'est title ici je donne une valeur a ma cle
        return "film/form";
    }

    @GetMapping("/delete/{id}")
    public String filmDelete(@PathVariable("id") Long id){
        filmDao.deleteById(id);
        return "redirect:/film/list";
    }

    @PostMapping("/add")
    public String submit(@RequestParam("photo")MultipartFile file, @ModelAttribute Film film){
        if(file.getContentType().equalsIgnoreCase("image/jpeg")){
            try {
                imm.savePoster(film, file.getInputStream());
            } catch (IOException ioe){
                System.out.println("Erreur lecture : "+ioe.getMessage());
            }
        }
        filmDao.save(film);

        return "redirect:/film/list";
    }

    @GetMapping(value = "/images/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public void afficheimages(HttpServletResponse response, @PathVariable("id")long id) throws IOException {

        String imgPath = filmDao.findById(id).get().getImagePath();

        ClassPathResource imgFile;

        imgFile = new ClassPathResource(path + imgPath );

        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());

    }

}

