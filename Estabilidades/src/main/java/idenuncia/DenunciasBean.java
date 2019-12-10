package idenuncia;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Denuncias;
import services.DenunciasService;

@ViewScoped
@Named
public class DenunciasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Denuncias denuncia = new Denuncias();
	protected Collection<Denuncias> entidades;

	@Inject
	private DenunciasService service;

	protected Denuncias denuncias;


	public DenunciasBean() {
	}

	@PostConstruct
	public void init() {
		denuncias = getEntidade();

	}

	public void remove(Denuncias entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Denuncias getEntidade() {
		return denuncias;
	}

	public void setEntidade(Denuncias entidade) {
		this.denuncias = entidade;
	}

	public Collection<Denuncias> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Denuncias> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(denuncias);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {

		denuncias = getEntidade();
	}

	public DenunciasService getService() {
		return service;
	}

	public Denuncias getDenuncia() {
		return denuncia;
	}

	public void setDenuncia(Denuncias denuncia) {
		this.denuncia = denuncia;
	}

}
