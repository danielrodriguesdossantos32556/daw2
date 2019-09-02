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

	@Inject
	private DenunciasService service;

	protected Denuncias entidade;

	protected Collection<Denuncias> entidades;

	public DenunciasBean() {
	}

	@PostConstruct
	public void init() {
		entidade = getEntidade();
		
	}

	public void remove(Denuncias entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Denuncias getEntidade() {
		return entidade;
	}

	public void setEntidade(Denuncias entidade) {
		this.entidade = entidade;
	}

	public Collection<Denuncias> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Denuncias> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		
		entidade = getEntidade();
	}


	public DenunciasService getService() {
		return service;
	}

}
