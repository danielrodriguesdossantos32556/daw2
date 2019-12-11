package services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import dao.ComentariosDAO;
import entities.Comentarios;
import util.TransacionalCdi;

@ApplicationScoped
public class ComentarioService implements Serializable, Service<Comentarios> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;

	@Inject
	private ComentariosDAO comentáriosDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.
	 * ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Comentarios comentarios) {
		comentariosDAO.save(comentarios);
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
	public void update(Comentarios comentários) {
		comentáriosDAO.update(comentários);
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
	public void remove(Comentarios comentários) {
		comentáriosDAO.remove(comentários);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario)
	 */
	@Override
	public Comentarios getByID(long comentários) {
		return comentáriosDAO.getByID(comentários);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Comentarios> getAll() {
		return comentáriosDAO.getAll();
	}
}