package entities;

import java.awt.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import idenuncia.Identificavel;

@Entity
@Table(name = "cidade")
public class Cidade implements Identificavel {

	private int cep;

	private String nome;
	@OneToOne
	@JoinColumn
	private Mapa mapa;
	@ManyToMany
	@JoinTable(name = "Ruas", joinColumns = @JoinColumn(name = "cep"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Ruas> ruas;
	@ManyToMany
	@JoinTable(name = "Bairros", joinColumns = @JoinColumn(name = "id_bairros"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Bairros> bairros;

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
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

	public ArrayList<Ruas> getRuas() {
		return ruas;
	}

	public void setRuas(ArrayList<Ruas> ruas) {
		this.ruas = ruas;
	}

	public ArrayList<Bairros> getBairros() {
		return bairros;
	}

	public void setBairros(ArrayList<Bairros> bairros) {
		this.bairros = bairros;
	}

	public Object getCidade() {
		return getCidade();
	}

	public Cidade getByID(long cidade) {
		return getByID(cidade);
	}

	public List getAll() {
		return getAll();
	}

	@Override
	public Long getId() {
		return getId();
	}

	@Override
	public void setId(Long id) {

	}

	@Override
	public String toString() {
		return "Cidade [cep=" + cep + ", nome=" + nome + ", mapa=" + mapa + ", ruas=" + ruas + ", bairros=" + bairros
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairros == null) ? 0 : bairros.hashCode());
		result = prime * result + cep;
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
		if (cep != other.cep)
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

}