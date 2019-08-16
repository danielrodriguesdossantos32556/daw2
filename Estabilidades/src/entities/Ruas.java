package entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ruas")
public class Ruas implements Identificavel {
	@Id
	@GeneratedValue
	private int id_ruas;

	private String nome_ruas;
	@ManyToMany
	@JoinTable(name = "Estabilidade", joinColumns = @JoinColumn(name = "IDC"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Estabilidade> estavel;
	
	public int getId_ruas() {
		return id_ruas;
	}

	public void setId_ruas(int id_ruas) {
		this.id_ruas = id_ruas;
	}

	public String getNome_ruas() {
		return nome_ruas;
	}

	public void setNome_ruas(String nome_ruas) {
		this.nome_ruas = nome_ruas;
	}

	public ArrayList<Estabilidade> getEstavel() {
		return estavel;
	}

	public void setEstavel(ArrayList<Estabilidade> estavel) {
		this.estavel = estavel;
	}

	@Override
	public String toString() {
		return "Ruas [id_ruas=" + id_ruas + ", nome_ruas=" + nome_ruas + ", estavel=" + estavel + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estavel == null) ? 0 : estavel.hashCode());
		result = prime * result + id_ruas;
		result = prime * result + ((nome_ruas == null) ? 0 : nome_ruas.hashCode());
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
		Ruas other = (Ruas) obj;
		if (estavel == null) {
			if (other.estavel != null)
				return false;
		} else if (!estavel.equals(other.estavel))
			return false;
		if (id_ruas != other.id_ruas)
			return false;
		if (nome_ruas == null) {
			if (other.nome_ruas != null)
				return false;
		} else if (!nome_ruas.equals(other.nome_ruas))
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