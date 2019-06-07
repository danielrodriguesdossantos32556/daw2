import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
	public class UsuarioService implements Serializable, Service<Usuario> {
		private static final long serialVersionUID = -7803325791425670859L;		
		@Inject
		private Usuario usuarioDAO;
		@TransacionalCdi
		public void save(Usuario user) {
			Usuario.save(Usuario);
		}
		public void update(Usuario user)  {
				userDAO.update(user);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
		 */
		@Override
		@TransacionalCdi
		public void remove(Usuario user) {
			userDAO.remove(user);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
		 */
		@Override
		public Usuario getByID(long userId)  {
				return userDAO.getByID(userId);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
		 */
		@Override
		public List<Usuario> getAll() {
				return userDAO.getAll();
		}
			
	}

}
