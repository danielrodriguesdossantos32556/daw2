package idenuncia;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Usuario;
import services.UsuarioService;

@ViewScoped
@Named
public class UsuarioBean implements Serializable {
	public Collection<Usuario> getUsuarios() {
		return entidades;
	}
	public void setUsuario(Collection<Usuario> entidades) {
		this.entidades = entidades;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usuario = new Usuario();
	private Collection<Usuario> entidades;
	private String nome;

	@Inject
	private UsuarioService service;

	protected Usuario entidade;

	public boolean isUserInRole(String role) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		return externalContext.isUserInRole(role);
	}

	public UsuarioBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = (Collection<Usuario>) getService().getAll();
	}

	public void remove(Usuario entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Usuario getEntidade() {
		return entidade;
	}

	public void setEntidade(Usuario entidade) {
		this.entidade = entidade;
	}

	public Collection<Usuario> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Usuario> entidades) {
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
		entidades = (Collection<Usuario>) getService().getAll();
		entidade = newEntidade();
	}

	protected Usuario newEntidade() {
		return new Usuario();
	}

	public UsuarioService getService() {
		return service;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
