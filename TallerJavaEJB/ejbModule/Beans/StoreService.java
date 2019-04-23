package Beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class StoreService
 */
@Stateless
@LocalBean
public class StoreService {
	 @PersistenceContext( unitName = "DummyContext" )
	 EntityManager em;
	 
    /**
     * Default constructor. 
     */
    public StoreService() {
        // TODO Auto-generated constructor stub
    }

}
