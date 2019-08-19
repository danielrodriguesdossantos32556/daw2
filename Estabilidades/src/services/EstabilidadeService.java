package services;

import java.awt.List;
import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import dao.EstabilidadeDAO;
import entities.Estabilidade;
import util.TransacionalCdi;

@ApplicationScoped
public class EstabilidadeService implements Serializable, Service<Estabilidade> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;

	@Inject
	private EstabilidadeDAO estabilidadeDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.
	 * ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Estabilidade estabilidade) {
		estabilidadeDAO.save(estabilidade);
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
	public void update(Estabilidade estabilidade) {
		estabilidadeDAO.update(estabilidade);
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
	public void remove(Estabilidade estabilidade) {
		EstabilidadeDAO.remove(estabilidade);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario)
	 */
	@Override
	public Estabilidade getByID(long estabilidadeId) {
		return estabilidadeDAO.getByID(estabilidadeId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Estabilidade> getAll() {
		return estabilidadeDAO.getAll();
	}

	@Override
	public java.util.List<Estabilidade> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}

