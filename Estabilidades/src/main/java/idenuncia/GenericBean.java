package idenuncia;

import java.io.Serializable;
import java.util.Collection;

import entities.Identificavel;
import services.Service;

public abstract class GenericBean<E extends Identificavel> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected E entidade;
	
	protected Collection<E> entidades;
	
	public GenericBean() {
		init();
	}
	
	private void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}
	
	public void remove(E entidade) {
		getService().remove(entidade);
		limpar(); 
	}

	
	public E getEntidade() {
		return entidade;
	}

	public void setEntidade(E entidade) {
		this.entidade = entidade;
	}

	public Collection<E> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<E> entidades) {
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
	
	public abstract Service<E> getService();
	
	protected abstract E newEntidade();
	
}
	
