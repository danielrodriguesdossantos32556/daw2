package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mapa")
public class Mapa implements Identificavel {
	@Id
	@GeneratedValue
	private int id_mapa;

	public int getId_mapa() {
		return id_mapa;
	}

	public void setId_mapa(int id_mapa) {
		this.id_mapa = id_mapa;
	}

	@Override
	public String toString() {
		return "Mapa [id_mapa=" + id_mapa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_mapa;
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
		Mapa other = (Mapa) obj;
		if (id_mapa != other.id_mapa)
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
