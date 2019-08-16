package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login implements Identificavel {
	@Id
	@GeneratedValue
	private int id_login;

	private String senha_usuario;

	private String nickName_usuario;

	public int getId_login() {
		return id_login;
	}

	public void setId_login(int id_login) {
		this.id_login = id_login;
	}

	public String getSenha_usuario() {
		return senha_usuario;
	}

	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}

	public String getNickName_usuario() {
		return nickName_usuario;
	}

	public void setNickName_usuario(String nickName_usuario) {
		this.nickName_usuario = nickName_usuario;
	}

	@Override
	public String toString() {
		return "Login [id_login=" + id_login + ", senha_usuario=" + senha_usuario + ", nickName_usuario="
				+ nickName_usuario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_login;
		result = prime * result + ((nickName_usuario == null) ? 0 : nickName_usuario.hashCode());
		result = prime * result + ((senha_usuario == null) ? 0 : senha_usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		if (id_login != other.id_login)
			return false;
		if (nickName_usuario == null) {
			if (other.nickName_usuario != null)
				return false;
		} else if (!nickName_usuario.equals(other.nickName_usuario))
			return false;
		if (senha_usuario == null) {
			if (other.senha_usuario != null)
				return false;
		} else if (!senha_usuario.equals(other.senha_usuario))
			return false;
		return true;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
}