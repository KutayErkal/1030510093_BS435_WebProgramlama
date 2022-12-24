package org.webp.intro.jee.jpa.entity;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class siparisler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 2 , max = 128)
    private String siparisAddress;


    @ManyToOne
    private Urunler urunler;

    @ManyToOne
    @JoinColumn(name ="musteriId")
    private Musteriler musteriler;

    public Siparisler(){}

    public Long getId() {
        return id;
    }


    public String getSiparisAddress() {
        return siparisAddress;
    }

    public void setSiparisAddress(String siparisAddress) {
        this.siparisAddress = siparisAddress;
    }

    public Urunler getUrunler() {
        return urunler;
    }

    public void setUrunler(Urunler Urunler) {
        this.urunler = urunler;
    }

    public Musteriler getMusteriler() {
        return musteriler;
    }

    public void setMusteriler(Musteriler musteriler) {
        this.musteriler = musteriler;
    }
}
