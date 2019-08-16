package idenuncia;

import java.io.Serializable;
import java.util.Collection;
import javax.inject.Inject;

public class GenericBean<E extends Indentificavel> implements Seriaçizable {
	
	protected E entidades1;
	
	protected Collection<E> entidades;

	private E entidade;
	

	public GenericBean() {
		init();
	}
	
	private void init() {
		E entidade = newEntidade();
		entidades1 = getService().getAll();
	}
	
	public void remove(E entidade) {
		getService().remove(entidade);
		limpar(); 
	}

	
	public E getEntidade() {
		return getEntidade();
	}

	public void setEntidade(E entidade) {
		this.entidade = entidade;
	}

	public Collection<E> getEntidades() {
		return (Collection<E>) entidades1;
	}

	public void setEntidades(Collection<E> entidades) {
		this.entidades1 = (E) entidades;
	}

	
	public void save() {
		getService().save(entidade);
		limpar();
	}
	
	
	
	public void editar(Long id) {
		((Object) this.getEntidade()).setId(id);
		save();
	}
	
	public void limpar() {
		entidades1 = getService().getAll();
		entidade = newEntidade();
	}
	
	public Service<E> getService() {
		return null;
	}
	
	protected E newEntidade() {
		return null;
	}
	
}
	
