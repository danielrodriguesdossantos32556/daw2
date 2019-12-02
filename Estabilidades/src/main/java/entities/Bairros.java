package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Bairros implements Identificavel {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_cidade")
	private Cidade cidade;
	private String nome_cidade;

	private String nome_bairro;
	
	@ManyToMany
	@JoinTable(name = "bairro_ruas", joinColumns = @JoinColumn(name = "id_bairros"), inverseJoinColumns = @JoinColumn(name = "id_ruas"))
	private Set<Ruas> ruas;

	@ManyToMany(mappedBy = "denuncias_bairros")
	private Set<Denuncias> denuncias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_bairro() {
		return nome_bairro;
	}

	public void setNome_bairro(String nome_bairro) {
		this.nome_bairro = nome_bairro;
	}

	public Set<Ruas> getRuas() {
		return ruas;
	}

	public void setRuas(Set<Ruas> ruas) {
		this.ruas = ruas;
	}

	@Override
	public String toString() {
		return "Bairros [id=" + id + ", nome_bairro=" + nome_bairro + ", ruas=" + ruas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome_bairro == null) ? 0 : nome_bairro.hashCode());
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
		Bairros other = (Bairros) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome_bairro == null) {
			if (other.nome_bairro != null)
				return false;
		} else if (!nome_bairro.equals(other.nome_bairro))
			return false;
		if (ruas == null) {
			if (other.ruas != null)
				return false;
		} else if (!ruas.equals(other.ruas))
			return false;
		return true;
	}

	public String getNome_cidade() {
		return nome_cidade;
	}

	public void setNome_cidade(String nome_cidade) {
		this.nome_cidade = nome_cidade;
	}
}
