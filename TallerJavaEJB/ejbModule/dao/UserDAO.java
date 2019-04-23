package dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.persistence.TypedQuery;

import model.User;
 
public class UserDAO {
	protected EntityManager entityManager;
    
    public EntityManager getEntityManager() {
        return entityManager;
    }
    
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
 
    @Transactional
    public List<User> getUser() {
        Query query = getEntityManager().createQuery("select c from Car c");
        List<User> resultList = query.getResultList();
        return resultList;
    }
    
    @Transactional
    public boolean login(String name, String password) {
   		TypedQuery<User> consulta = getEntityManager().createNamedQuery("User.login", User.class);
    	consulta.setParameter("name", name);
    	consulta.setParameter("pass", password);
    	List<User> lista = consulta.getResultList();
    	return lista.size() == 1;
    }
    
}
