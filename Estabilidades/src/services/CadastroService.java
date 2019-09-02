package services;

import java.awt.List;
import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import dao.CadastroDAO;
import entities.Cadastro;
import entities.Identificavel;
import util.TransacionalCdi;

@ApplicationScoped
public class CadastroService implements Serializable, Service<Identificavel> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;;

	@Inject
	private CadastroDAO cadastroDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.
	 * ifoto.entities.Usuario)
	 */
	@TransacionalCdi
	public void save(Cadastro cadastro) {
		cadastroDAO.save(cadastro);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario, boolean)
	 */
	@TransacionalCdi
	public void update(Cadastro cadastro) {
		cadastroDAO.update(cadastro);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario)
	 */
	
	@TransacionalCdi
	public void remove(Cadastro cadastro) {
		cadastroDAO.remove(cadastro);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario)
	 */
	@Override
	public Cadastro getByID(long cadastro) {
		return cadastroDAO.getByID(cadastro);
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */


}
