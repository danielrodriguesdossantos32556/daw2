package idenuncia;

	
	import java.io.Serializable;
	import java.util.Collection;

	import javax.annotation.PostConstruct;
	import javax.faces.view.ViewScoped;
	import javax.inject.Inject;
	import javax.inject.Named;
	import entities.Comentarios;
	import services.ComentarioService;

	@ViewScoped
	@Named
	public class ComentariosBean implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private Comentarios comentarios = new Comentarios();
		protected Collection<Comentarios> entidades;

		@Inject
		private ComentarioService service;

		protected Comentarios comentario;


		public ComentariosBean() {
		}

		@PostConstruct
		public void init() {
			comentarios = getEntidade();

		}

		public void remove(Comentarios entidade) {
			getService().remove(entidade);
			limpar();
		}

		public Comentarios getEntidade() {
			return comentarios;
		}

		public void setEntidade(Comentarios entidade) {
			this.comentarios = entidade;
		}

		public Collection<Comentarios> getEntidades() {
			return entidades;
		}

		public void setEntidades(Collection<Comentarios> entidades) {
			this.entidades = entidades;
		}

		public void save() {
			getService().save(comentarios);
			limpar();
		}

		public void editar(Long id) {
			this.getEntidade().setId(id);
			save();
		}

		public void limpar() {

			comentarios = getEntidade();
		}

		public ComentarioService getService() {
			return service;
		}

		public Comentarios getComentários() {
			return comentarios;
		}

		public void setDenuncia(Comentarios comentario) {
			this.comentario = comentario;
		}

	}
