package idenuncia;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Cidade;
import services.CidadeService;

@ViewScoped
@Named
public class CidadeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private CidadeService service;

	protected Cidade entidade;

	protected Collection<Cidade> entidades;

	public CidadeBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();

	}

	public void remove(Cidade entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Cidade getEntidade() {
		return entidade;
	}

	public void setEntidade(Cidade entidade) {
		this.entidade = entidade;
	}

	public Collection<Cidade> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Cidade> entidades) {
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

		entidade = newEntidade();
	}

	protected Cidade newEntidade() {
		return new Cidade();
	}

	public CidadeService getService() {
		return service;
	}

}
