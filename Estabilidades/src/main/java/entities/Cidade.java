package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade implements Identificavel {

	@Column(name = "Id_cidade")
	private Long id;

	@Column(name = "cidade_nome")
	private String nome;
	@ManyToMany
	@JoinTable(name = "ruas", joinColumns = @JoinColumn(name = "id_cidade"), inverseJoinColumns = @JoinColumn(name = "id_rua"))
	private Set<Ruas> ruas;

	@OneToMany(mappedBy = "cidade")
	private Set<Bairros> bairros;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Ruas> getRuas() {
		return ruas;
	}

	public void setRuas(Set<Ruas> ruas) {
		this.ruas = ruas;
	}

	public Set<Bairros> getBairros() {
		return bairros;
	}

	public void setBairros(Set<Bairros> bairros) {
		this.bairros = bairros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairros == null) ? 0 : bairros.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((ruas == null) ? 0 : ruas.hashCode());
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
		Cidade other = (Cidade) obj;
		if (bairros == null) {
			if (other.bairros != null)
				return false;
		} else if (!bairros.equals(other.bairros))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;

		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (ruas == null) {
			if (other.ruas != null)
				return false;
		} else if (!ruas.equals(other.ruas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cidade [id=" + id + ", nome=" + nome + ", ruas=" + ruas + ", bairros=" + bairros + "]";
	}

}