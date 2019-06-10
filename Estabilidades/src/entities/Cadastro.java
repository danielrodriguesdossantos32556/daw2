package entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.crypto.Data;
@Entity
@Table(name="cadastro")
public class Cadastro {
	@Id
	@GeneratedValue
	private int id_cadastro;
	private String nova_senha;
	private String novo_nickname;
	private String nome_completo;
	private String email;
	@OneToOne
	@JoinColumn
	private Data data_de_nascimento;

	
	//-------------------------------------------------------------//
	
	public int getId_cadastro() {
		return id_cadastro;
	}

	public void setId_cadastro(int id_cadastro) {
		this.id_cadastro = id_cadastro;
	}

	public String getNova_senha() {
		return nova_senha;
	}

	public void setNova_senha(String nova_senha) {
		this.nova_senha = nova_senha;
	}

	public String getNovo_nickname() {
		return novo_nickname;
	}

	public void setNovo_nickname(String novo_nickname) {
		this.novo_nickname = novo_nickname;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Data getData_de_nascimento() {
		return data_de_nascimento;
	}

	public void setData_de_nascimento(Data data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}

	public Cadastro(int id_cadastro, String nova_senha, String novo_nickname, String nome_completo, String email,
			Data data_de_nascimento) {
		super();
		this.id_cadastro = id_cadastro;
		this.nova_senha = nova_senha;
		this.novo_nickname = novo_nickname;
		this.nome_completo = nome_completo;
		this.email = email;
		this.data_de_nascimento = data_de_nascimento;
	}
	
	
	
	

}
