package idenuncia;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Estabilidade;
import services.EstabilidadeService;

@ViewScoped
@Named
public class EstabilidadeBean implements Serializable {

	@Inject
	private EstabilidadeService service;

	protected Estabilidade entidade;

	protected Collection<Estabilidade> entidades;

	public EstabilidadeBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Estabilidade entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Estabilidade getEntidade() {
		return entidade;
	}

	public void setEntidade(Estabilidade entidade) {
		this.entidade = entidade;
	}

	public Collection<Estabilidade> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Estabilidade> entidades) {
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
		entidade = newEntidade();
	}

	protected Estabilidade newEntidade() {
		return new Estabilidade();
	}

	public EstabilidadeService getService() {
		return service;
	}

}

