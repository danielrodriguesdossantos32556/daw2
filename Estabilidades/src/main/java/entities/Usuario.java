package entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuario")
public class Usuario implements Identificavel {

	@Id
	@GeneratedValue
	@Column(name = "Id_usuario")
	private Long id;

	@Column(name = "usuario_nova_senha")
	private String nova_senha;

	@Column(name = "usuario_novo_nickname")
	private String novo_nickname;

	@Column(name = "usuario_nome_completo")
	private String nome_completo;

	@Column(name = "usuario_email")
	private String email;

	@Column(name = "usuario_data_de_nascimento")
	@Temporal(TemporalType.DATE)
	private Date data_de_nascimento;

	@ManyToMany
	@JoinTable(name = "usuario_denuncia", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_denuncia"))
	private Set<Denuncias> faz_denuncias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Date getData_de_nascimento() {
		return data_de_nascimento;
	}

	public void setData_de_nascimento(Date data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}

	public Set<Denuncias> getFaz_denuncias() {
		return faz_denuncias;
	}

	public void setFaz_denuncias(Set<Denuncias> faz_denuncias) {
		this.faz_denuncias = faz_denuncias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_de_nascimento == null) ? 0 : data_de_nascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((faz_denuncias == null) ? 0 : faz_denuncias.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome_completo == null) ? 0 : nome_completo.hashCode());
		result = prime * result + ((nova_senha == null) ? 0 : nova_senha.hashCode());
		result = prime * result + ((novo_nickname == null) ? 0 : novo_nickname.hashCode());
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
		Usuario other = (Usuario) obj;
		if (data_de_nascimento == null) {
			if (other.data_de_nascimento != null)
				return false;
		} else if (!data_de_nascimento.equals(other.data_de_nascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (faz_denuncias == null) {
			if (other.faz_denuncias != null)
				return false;
		} else if (!faz_denuncias.equals(other.faz_denuncias))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome_completo == null) {
			if (other.nome_completo != null)
				return false;
		} else if (!nome_completo.equals(other.nome_completo))
			return false;
		if (nova_senha == null) {
			if (other.nova_senha != null)
				return false;
		} else if (!nova_senha.equals(other.nova_senha))
			return false;
		if (novo_nickname == null) {
			if (other.novo_nickname != null)
				return false;
		} else if (!novo_nickname.equals(other.novo_nickname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nova_senha=" + nova_senha + ", novo_nickname=" + novo_nickname
				+ ", nome_completo=" + nome_completo + ", email=" + email + ", data_de_nascimento=" + data_de_nascimento
				+ ", faz_denuncias=" + faz_denuncias + "]";
	}
}
