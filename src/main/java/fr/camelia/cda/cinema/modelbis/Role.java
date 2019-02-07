//package fr.camelia.cda.cinema.modelbis;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "play")
//public class Role {
//
//    // Composite key, for Person id + Film id (see RoleId)
//    @EmbeddedId
//    private RoleId id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("filmId")
//    private Film film;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("personId")
//    private Person person;
//
//    @Basic
//    @Column(name = "rank")
//    private Integer rank;
//
//    @Basic
//    @Column(name = "name")
//    private String name;
//
//    public Role(Film film, Person person) {
//        this.film = film;
//        this.person = person;
//        this.id = new RoleId(film.getId(), person.getId());
//    }
//
//    public Role() {
//    }
//
//    public RoleId getId() {
//        return id;
//    }
//
//    public void setId(RoleId id) {
//        this.id = id;
//    }
//
//    public Film getFilm() {
//        return film;
//    }
//
//    public void setFilm(Film film) {
//        this.film = film;
//    }
//
//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
//
//    public Integer getRank() {
//        return rank;
//    }
//
//    public void setRank(Integer rank) {
//        this.rank = rank;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Role)) return false;
//        Role role = (Role) o;
//        return Objects.equals(getId(), role.getId()) &&
//                Objects.equals(getFilm(), role.getFilm()) &&
//                Objects.equals(getPerson(), role.getPerson()) &&
//                Objects.equals(getRank(), role.getRank()) &&
//                Objects.equals(getName(), role.getName());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getFilm(), getPerson(), getRank(), getName());
//    }
//}
