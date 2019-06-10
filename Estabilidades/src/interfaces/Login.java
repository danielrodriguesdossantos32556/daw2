package interfaces;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
	@Id
	@GeneratedValue
	private int id_login;

	private String senha_usuario;

	private String nickName_usuario;

	// ---------------------------------------------------------//

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

	public Login(int id_login, String senha_usuario, String nickName_usuario) {
		super();
		this.id_login = id_login;
		this.senha_usuario = senha_usuario;
		this.nickName_usuario = nickName_usuario;
	}

}
