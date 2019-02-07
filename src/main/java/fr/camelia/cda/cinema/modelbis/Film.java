//package fr.camelia.cda.cinema.modelbis;
//
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//@Entity(name = "films")
//public class Film {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private long id;
//
//    @Basic
//    @Column(name = "title", nullable = false, length = 210)
//    private String titre;
//
//    @Basic
//    @Column(name = "rating", nullable = true)
//    private Double notation;
//
//    @Basic
//    @Column(name = "image_path", nullable = true, length = 80)
//    private String imagePath;
//
//    @Basic
//    @Column(name = "summary", nullable = true)
//    private String resume;
//
//    @ManyToOne
//    @JoinColumn(name = "film_director")
//    private Person director;
//
//    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Role> roles = new ArrayList<>();
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getTitre() {
//        return titre;
//    }
//
//    public void setTitre(String titre) {
//        this.titre = titre;
//    }
//
//    public Double getNotation() {
//        return notation;
//    }
//
//    public void setNotation(Double notation) {
//        this.notation = notation;
//    }
//
//    public String getImagePath() {
//        return imagePath;
//    }
//
//    public void setImagePath(String imagePath) {
//        this.imagePath = imagePath;
//    }
//
//    public String getResume() {
//        return resume;
//    }
//
//    public void setResume(String resume) {
//        this.resume = resume;
//    }
//
//    public Person getDirector() {
//        return director;
//    }
//
//    public void setDirector(Person director) {
//        this.director = director;
//    }
//
//    public List<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<Role> roles) {
//        this.roles = roles;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Film)) return false;
//        Film film = (Film) o;
//        return getId() == film.getId() &&
//                Objects.equals(getTitre(), film.getTitre()) &&
//                Objects.equals(getNotation(), film.getNotation()) &&
//                Objects.equals(getImagePath(), film.getImagePath()) &&
//                Objects.equals(getResume(), film.getResume()) &&
//                Objects.equals(getDirector(), film.getDirector()) &&
//                Objects.equals(getRoles(), film.getRoles());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getTitre(), getNotation(), getImagePath(), getResume(), getDirector(), getRoles());
//    }
//
//    @Override
//    public String toString() {
//        return "Film{" +
//                "id=" + id +
//                ", titre='" + titre + '\'' +
//                ", notation=" + notation +
//                ", affiche='" + imagePath + '\'' +
//                ", resume='" + resume + '\'' +
//                ", realisateur=" + director +
//                '}';
//    }
//}
