package services;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.inject.Inject;
//
//import dao.LocalidadeDAO;
//import entities.Localidade;
//import util.TransacionalCdi;
//
	public class LocalidadeService {//implements Serializable, Service<Localidade> {
//
//		/**
//		 * 
//		 */
//		private static final long serialVersionUID = -7803325791425670859L;
//
//		@Inject
//		private LocalidadeDAO localidadeDAO;
//
//		/*
//		 * (non-Javadoc)
//		 * 
//		 * @see
//		 * br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.
//		 * ifoto.entities.Usuario)
//		 */
//		@Override
//		@TransacionalCdi
//		public void save(Localidade localidade) {
//			localidadeDAO.save(localidade);
//		}
//
//		/*
//		 * (non-Javadoc)
//		 * 
//		 * @see
//		 * br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2
//		 * .ifoto.entities.Usuario, boolean)
//		 */
//		@Override
//		@TransacionalCdi
//		public void update(Localidade localidade) {
//			localidadeDAO.update(localidade);
//		}
//
//		/*
//		 * (non-Javadoc)
//		 * 
//		 * @see
//		 * br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2
//		 * .ifoto.entities.Usuario)
//		 */
//		@Override
//		@TransacionalCdi
//		public void remove(Localidade localidade) {
//			localidadeDAO.update(localidade);
//		}
//
//		/*
//		 * (non-Javadoc)
//		 * 
//		 * @see
//		 * br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2
//		 * .ifoto.entities.Usuario)
//		 */
//		@Override
//		public Localidade getByID(long denuncias) {
//			return localidadeDAO.getByID(denuncias);
//		}
//
//		/*
//		 * (non-Javadoc)
//		 * 
//		 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
//		 */
//		@Override
//		public List<Localidade> getAll() {
//			return localidadeDAO.getAll();
//		}
//
}
