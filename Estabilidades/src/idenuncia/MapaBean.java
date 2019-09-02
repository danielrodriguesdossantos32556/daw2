package idenuncia;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Mapa;
import services.MapaService;

@ViewScoped
@Named
public class MapaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private MapaService service;

	protected Mapa entidade;

	protected Collection<Mapa> entidades;

	public MapaBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = (Collection<Mapa>) getService().getAll();
	}

	public void remove(Mapa entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Mapa getEntidade() {
		return entidade;
	}

	public void setEntidade(Mapa entidade) {
		this.entidade = entidade;
	}

	public Collection<Mapa> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Mapa> entidades) {
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
		entidades = (Collection<Mapa>) getService().getAll();
		entidade = newEntidade();
	}

	protected Mapa newEntidade() {
		return new Mapa();
	}

	public MapaService getService() {
		return service;
	}

}
