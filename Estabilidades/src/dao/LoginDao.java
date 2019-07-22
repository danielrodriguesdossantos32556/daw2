package dao;

import java.awt.List;

import javax.persistence.metamodel.IdentifiableType;

import entities.Login;

@SuppressWarnings("rawtypes")
public class LoginDAO extends DAO<IdentifiableType> {

	public LoginDAO() {
		super();
	}

	public List findBy(Login filtro) {
		return null;
	}

	public Login getByID(long loginId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}