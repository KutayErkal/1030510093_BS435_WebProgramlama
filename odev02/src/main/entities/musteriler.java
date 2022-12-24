package org.webp.intro.jee.jpa.entity;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class musteriler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Size(min = 2 , max = 128)
    private String name;
    @Size(min = 2 , max = 128)
    private String surname;

    @OneToMany(mappedBy = "musteriler")
    private Siparisler siparisler;



    public Musteriler(){}

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Siparisler getSiparisler() {
        return siparisler;
    }

    public void setSiparisler(Siparisler siparisler) {
        this.siparisler = siparisler;
    }
}
