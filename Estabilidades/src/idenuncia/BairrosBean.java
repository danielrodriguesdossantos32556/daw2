package idenuncia;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Bairros;
import services.BairrosService;

@ViewScoped
@Named
public class BairrosBean implements Serializable {

	@Inject
	private BairrosService service;

	protected Bairros entidade;

	protected Collection<Bairros> entidades;

	public BairrosBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Bairros entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Bairros getEntidade() {
		return entidade;
	}

	public void setEntidade(Bairros entidade) {
		this.entidade = entidade;
	}

	public Collection<Bairros> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Bairros> entidades) {
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

	protected Bairros newEntidade() {
		return new Bairros();
	}

	public BairrosService getService() {
		return service;
	}

}
