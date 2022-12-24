package org.webp.intro.jee.jpa.entity;
import javax.ejb.Stateless;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Stateless
public class SiparislerBean {
    @PersistenceContext
    private EntityManager em;

    public SiparislerBean(){}

    public void AddSiparis(Long urunlerId ,Long musterilerId ,String urunlerName, Long price){
        UrunlerBean urunlerBean = new UrunlerBean();
        Urunler urunler = urunlerBean.getUrunlerById(urunlerId);

        MusterilerBean musterilerBean = new MusterilerBean();
        Musteriler musteriler = musterilerBean.getMusterilerById(musterilerId);
        Siparisler siparisler = new Siparisler();

        siparisler.setAddress(address);
        siparisler.setMusteriler(musteriler);
        siparisler.setUrunler(urunler);
        em.persist(siparisler);
    }

    public List<Siparisler> getSiparislers() {
        TypedQuery<Siparisler> query = em.createQuery("select u from Project u", Siparisler.class);
        return query.getResultList();
    }
}
