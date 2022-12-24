package org.webp.intro.jee.jpa.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
@Entity
public class urunler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2 , max = 128)
    private String UrunlerName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long price;
    @OneToMany(mappedBy = "urunler")
    private List<Siparisler> siparisler = new ArrayList<>();

    public urunler(){}

    public Long getId() {
        return id;
    }


    public String getUrunlerName() {
        return urunlerName;
    }

    public void setUrunlerName(String urunlerName) {
        this.urunlerName = urunlerName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public List<Siparisler> getSiparisler() {
        return siparisler;
    }

    public void setSiparisler(List<Siparisler> siparisler) {
        this.siparisler = siparisler;
    }
}
