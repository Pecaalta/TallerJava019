package Beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Session Bean implementation class User
 */
@Stateless
@LocalBean
public class User implements UserLocal {
	
	@Inject
	private UserService _UserService = new UserService();
	private String name = "";
	private String password = "";
	private String repassword = "";
	private String token = "";
	private String email = "";
	private boolean is_active = true;
	
	
    /**
     * Default constructor. 
     */
    public User() {
        // TODO Auto-generated constructor stub
    }

    public String login() {
    	boolean login = this._UserService.login(this.name, this.password);
    	return login ? "Home" : "Error"; 
	}

    public String logout() {
    	boolean login = this._UserService.logout();
    	return login ? "Home" : "Error"; 
	}
    
    public String registry() {

    	return true ? "Done" : "Error"; 
	}
    
    
}
