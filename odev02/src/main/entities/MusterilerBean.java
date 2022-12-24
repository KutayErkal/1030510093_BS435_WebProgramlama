package org.webp.intro.jee.jpa.entity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class MusterilerBean {
    @PersistenceContext
    private EntityManager em;

    public MusterilerBean(){}

    public void AddMusteriler(String name,String surname){

        Musteriler musteriler = new Musteriler();
        musteriler.setName(name);
        musteriler.setSurname(surname);
        em.persist(musteriler);
    }

    public long getNumberOfMusteriler(){
        TypedQuery<Long> query = em.createQuery("select count(u) from ProjectManager u", Long.class);
        long n = query.getSingleResult();
        return n;
    }
    public List<Musteriler> getMusteriler() {
        TypedQuery<Musteriler> query = em.createQuery("select u from ProjectManager u", Musteriler.class);
        return query.getResultList();
    }
    public Musteriler getMusterilerById(long musterilerId) {
        Musteriler musteriler = em.find(Musteriler.class,musterilerId);
        return musteriler;
    }

}
