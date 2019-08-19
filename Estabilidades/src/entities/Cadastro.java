package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro")
public class Cadastro extends Identificavel {
	@Id
	@GeneratedValue
	private long id_cadastro;

	public long getId_cadastro() {
		return id_cadastro;
	}

	public void setId_cadastro(long id_cadastro) {
		this.id_cadastro = id_cadastro;
	}

	@Override
	public String toString() {
		return "Cadastro [id_cadastro=" + id_cadastro + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id_cadastro ^ (id_cadastro >>> 32));
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
		Cadastro other = (Cadastro) obj;
		if (id_cadastro != other.id_cadastro)
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
