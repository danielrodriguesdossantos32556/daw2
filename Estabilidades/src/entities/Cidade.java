package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade implements Identificavel {

	private Long id;

	private String nome;
	@OneToOne
	@JoinColumn
	private Mapa mapa;
	@ManyToMany
	@JoinTable(name = "Ruas", joinColumns = @JoinColumn(name = "cep"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private Set<Ruas> ruas;
	@ManyToMany
	@JoinTable(name = "Bairros", joinColumns = @JoinColumn(name = "id_bairros"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
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

	public Mapa getMapa() {
		return mapa;
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
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
		result = prime * result + ((mapa == null) ? 0 : mapa.hashCode());
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
		if (mapa == null) {
			if (other.mapa != null)
				return false;
		} else if (!mapa.equals(other.mapa))
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
		return "Cidade [id=" + id + ", nome=" + nome + ", mapa=" + mapa + ", ruas=" + ruas + ", bairros=" + bairros
				+ "]";
	}

}