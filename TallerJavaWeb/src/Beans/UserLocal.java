package Beans;

import javax.ejb.Local;

@Local
public interface UserLocal {

	public String login();
    public String logout();
    public String registry();
}
