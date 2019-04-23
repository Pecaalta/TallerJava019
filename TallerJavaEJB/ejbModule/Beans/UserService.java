package Beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


import dao.UserDAO;
import model.User;

/**
 * Session Bean implementation class UserService
 */
@Stateless
@LocalBean
public class UserService implements UserServiceLocal {

	private User mUser;
	
	
    public UserService() {
        // TODO Auto-generated constructor stub
    }
    
    public boolean login(String name, String password) {
    	UserDAO handler = new UserDAO();
    	return handler.login(name, password);
	}
    
    
    public boolean logout() {
    	return true;

	}

	public User getmUser() {
		return mUser;
	}

	public void setmUser(User mUser) {
		this.mUser = mUser;
	}

}
