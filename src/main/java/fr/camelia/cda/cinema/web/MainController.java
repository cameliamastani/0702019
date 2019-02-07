//package fr.camelia.cda.cinema.web;
//
//
//import fr.camelia.cda.cinema.dao.DataModel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//
//@Controller
//public class MainController {
//
//    // L'annotation @Autowired permet d'effectuer une injection
//    @Autowired
//
//    DataModel datamodel;
//
//
//
//    // L'annotation @GetMapping permet d'effectuer le mapping
//    // càd d'envoyer
//    @GetMapping("/")
//    public String main(Model model) {
//
//
//        model.addAttribute("nom", "camelia ");
//        model.addAttribute("films", datamodel.getFilms());
//
//        return "index";
//    }
//
//    @GetMapping("/film/{id}")//nom_mapping (chemin) différent du nom_template
//    public String detail(Model model, @PathVariable("id") String id){
//        Integer idFilm = Integer.parseInt(id);
//        model.addAttribute("film", datamodel.getById(idFilm));
//        model.addAttribute("role", datamodel.getRoles());
//        model.addAttribute("acteur", datamodel.getPersonnes());
//        model.addAttribute("nom", "camelia ");
//        model.addAttribute("films", datamodel.getFilms());
//        model.addAttribute("url", "file:///C:/Users/CDI/Desktop/affiches/ben-hur.jpg");
//        return "detail"; //template
//    }
//    //@GetMapping("/acteur/{lname}")
//   // public String detailacteur (Model model, @PathVariable("lname") String lname){
//        //model.addAttribute("acteur", datamodel.getByLastName(lname) );
//
//
//
//
//        //return "detailacteur" ;
//    //}
//
//    @GetMapping("/acteur/{id}")
//    public String detailacteur (Model model, @PathVariable("id") String id){
//        Integer idPersonne = Integer.parseInt(id);
//        model.addAttribute("acteur", datamodel.getByIdp(idPersonne));
//
//        return "detailacteur" ;
//    }
//
//
//}
//
//
