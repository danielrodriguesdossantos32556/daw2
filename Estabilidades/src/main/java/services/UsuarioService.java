package services;
import java.util.Base64;
import java.util.List;
import java.io.Serializable;
import java.security.MessageDigest;

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
		usuario.setNova_senha(hash(usuario.getNova_senha()));
		usuarioDAO.save(usuario);
	}
	private String hash(String password) {
		try {
			MessageDigest md;
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes("UTF-8"));
			byte[] digest = md.digest();
			String output = Base64.getEncoder().encodeToString(digest);
			return output;
		} catch (Exception e) {
			return password;
		}
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