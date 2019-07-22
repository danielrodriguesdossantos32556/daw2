package entities;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.crypto.Data;

import interfaces.ProjEstabilidade;

@Entity
@Table(name = "usuario")
public abstract class Usuario implements ProjEstabilidade {

	@Id
	@GeneratedValue
	@Column(name = "Id_usuario")
	private int id_Usuario;

	private String nova_senha;
	private String novo_nickname;
	private String nome_completo;
	private String email;
	private Data data_de_nascimento;

	@ManyToMany
	@JoinTable(name = " denuncias", joinColumns = @JoinColumn(name = "id_denuncias"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Denuncias> faz_denuncias;

// -------------------------------------------------------//	

	public int getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(int id_Usuario) {
		this.id_Usuario = id_Usuario;
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

}
