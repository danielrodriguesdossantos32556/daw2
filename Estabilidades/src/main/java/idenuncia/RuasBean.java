package idenuncia;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Ruas;
import services.RuasService;

@ViewScoped
@Named
public class RuasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private RuasService service;

	protected Ruas entidade;

	protected Collection<Ruas> entidades;

	public RuasBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = (Collection<Ruas>) getService().getAll();
	}

	public void remove(Ruas entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Ruas getEntidade() {
		return entidade;
	}

	public void setEntidade(Ruas entidade) {
		this.entidade = entidade;
	}

	public Collection<Ruas> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Ruas> entidades) {
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
		entidades = (Collection<Ruas>) getService().getAll();
		entidade = newEntidade();
	}

	protected Ruas newEntidade() {
		return new Ruas();
	}

	public RuasService getService() {
		return service;
	}

}
