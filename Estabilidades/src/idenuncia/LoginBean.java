package idenuncia;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Login;
import services.LoginService;

@ViewScoped
@Named
public class LoginBean implements Serializable {

	@Inject
	private LoginService service;

	protected Login entidade;

	protected Collection<Login> entidades;

	public LoginBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = (Collection<Login>) getService().getAll();
	}

	public void remove(Login entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Login getEntidade() {
		return entidade;
	}

	public void setEntidade(Login entidade) {
		this.entidade = entidade;
	}

	public Collection<Login> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Login> entidades) {
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
		entidades = (Collection<Login>) getService().getAll();
		entidade = newEntidade();
	}

	protected Login newEntidade() {
		return new Login();
	}

	public LoginService getService() {
		return service;
	}

}
