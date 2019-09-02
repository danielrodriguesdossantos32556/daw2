package services;

import java.util.List; 
import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import dao.RuasDAO; 
import entities.Ruas;
import util.TransacionalCdi;

@ApplicationScoped
	public class RuasService implements Serializable, Service<Ruas>{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = -7803325791425670859L;
		
		@Inject
		private RuasDAO ruasDAO;
		
		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
		 */
		@Override
		@TransacionalCdi
		public  void  save ( Ruas ruas) {
			ruasDAO.save(ruas);
		}
		
		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
		 */
		@Override
		@TransacionalCdi
		public  void  update (Ruas ruas) {
			ruasDAO.update(ruas);
		}
		
		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
		 */
		@Override
		@TransacionalCdi
		public void remove(Ruas ruas) {
			ruasDAO.remove(ruas);
		}
		
		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
		 */
		@Override
		public Ruas getByID(long ruasId)  {
				return ruasDAO.getByID(ruasId);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
		 */
		@Override
		public List<Ruas> getAll() {
				return ruasDAO.getAll();
		}
	}	

