package entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Bairros implements Identificavel {
	@Id
	@GeneratedValue
	private Long id;

	private String nome_bairro;
	@ManyToMany
	@JoinTable(name = "Bairros", joinColumns = @JoinColumn(name = "IDC"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Estabilidade> estavel;
	@ManyToMany
	@JoinTable(name = "Bairros", joinColumns = @JoinColumn(name = "id_bairro"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Ruas> ruas;

	public Long getId() {
		return id;
	}

	public void setId(Long id_bairro) {
		this.id = id_bairro;
	}

	public String getNome_bairro() {
		return nome_bairro;
	}

	public void setNome_bairro(String nome_bairro) {
		this.nome_bairro = nome_bairro;
	}

	public ArrayList<Estabilidade> getEstavel() {
		return estavel;
	}

	public void setEstavel(ArrayList<Estabilidade> estavel) {
		this.estavel = estavel;
	}

	public ArrayList<Ruas> getRuas() {
		return ruas;
	}

	public void setRuas(ArrayList<Ruas> ruas) {
		this.ruas = ruas;
	}

	@Override
	public String toString() {
		return "Bairros [id=" + id + ", nome_bairro=" + nome_bairro + ", estavel=" + estavel + ", ruas=" + ruas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estavel == null) ? 0 : estavel.hashCode());
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
		if (estavel == null) {
			if (other.estavel != null)
				return false;
		} else if (!estavel.equals(other.estavel))
			return false;
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

}