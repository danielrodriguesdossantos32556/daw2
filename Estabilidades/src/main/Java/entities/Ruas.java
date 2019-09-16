package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ruas")
public class Ruas implements Identificavel {
	@Id
	@GeneratedValue
	private Long id;

	private String nome_ruas;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_ruas() {
		return nome_ruas;
	}

	public void setNome_ruas(String nome_ruas) {
		this.nome_ruas = nome_ruas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		long result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome_ruas == null) ? 0 : nome_ruas.hashCode());
		return (int)result;
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome_ruas == null) {
			if (other.nome_ruas != null)
				return false;
		} else if (!nome_ruas.equals(other.nome_ruas))
			return false;
		return true;
	}

	

	

}
