package services;

import java.awt.List; 
import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import dao.LoginDAO;
import entities.Login;
import util.TransacionalCdi;

@ApplicationScoped
public class LoginService implements Serializable, Service<Login> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;

	@Inject
	private LoginDAO loginDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.
	 * ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Login login) {
		loginDAO.save(login);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Login login) {
		loginDAO.update(login);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Login login) {
		LoginDAO.remove(login);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario)
	 */
	@Override
	public Login getByID(long loginId) {
		return loginDAO.getByID(loginId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Login> getAll() {
		return loginDAO.getAll();
	}
}
