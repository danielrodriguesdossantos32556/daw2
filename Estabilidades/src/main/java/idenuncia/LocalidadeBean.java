package idenuncia;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Localidade;
import services.LocalidadeService;

@ViewScoped
@Named
public class LocalidadeBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private LocalidadeService service;

	protected Localidade entidade;

	protected Collection<Localidade> entidades;

	public LocalidadeBean() {
	}

	@PostConstruct
	public void init() {
		entidade = getEntidade();

	}

	public void remove(Localidade entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Localidade getEntidade() {
		return entidade;
	}

	public void setEntidade(Localidade entidade) {
		this.entidade = entidade;
	}

	public Collection<Localidade> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Localidade> entidades) {
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
		entidades = getService().getAll();
		entidade = getEntidade();
	}

	public LocalidadeService getService() {
		return service;
	}

}
