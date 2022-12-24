package org.webp.intro.jee.jpa.entity;
import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

@Stateless
public class UrunlerBean {
    @PersistenceContext
    private EntityManager em;

    public UrunlerBean(){}

    public void AddUrunler(String urunlerName){

        Urunler urunler = new Urunler();
        urunler.setUrunlerName(urunlerName);
        em.persist(urunler);
    }
    public void AddUrunler(Long urunlerPrice){

        Urunler urunler = new Urunler();
        urunler.setUrunlerPrice(urunlerPrice);
        em.persist(urunler);
    }

    public long getNumberOfUrunlers(){
        TypedQuery<Long> query = em.createQuery("select count(u) from Category u", Long.class);
        long n = query.getSingleResult();
        return n;
    }
    public List<Urunler> getUrunlers() {
        TypedQuery<Urunler> query = em.createQuery("select u from Category u", Urunler.class);
        return query.getResultList();
    }
    public Urunler getUrunlerById(long urunlerId) {
        Urunler urunler = em.find(Urunler.class,urunlerId);
        return urunler;
    }

}
