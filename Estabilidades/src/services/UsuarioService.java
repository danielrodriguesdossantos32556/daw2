package services;
import java.awt.List;
import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import dao.UsuarioDAO;
import entities.Usuario;
import util.TransacionalCdi;

@ApplicationScoped
	public class UsuarioService implements Serializable, Service<Usuario>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public  void  save ( Usuario usuario) {
		usuarioDAO.save(usuario);
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public  void  update (Usuario usuario) {
		usuarioDAO.update(usuario);
	}  
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Usuario usuario) {
		usuarioDAO.remove(usuario);
	}
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	public Usuario getByID(long usuarioId)  {
			return usuarioDAO.getByID(usuarioId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Usuario> getAll() {
			return usuarioDAO.getAll();
	}
}	