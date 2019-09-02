package dao;

import java.awt.List;
import entities.Login;

public class LoginDao extends DAO<Login> {

	public LoginDao() {
		super(Login.class);
	}

	public List findBy(Login filtro) {
		return null;
	}
}
