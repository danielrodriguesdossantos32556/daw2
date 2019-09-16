package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estabilidade implements Identificavel{
	
	@Id
	private Long id;
	private Set<Estabilidade> estabilidades;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Estabilidade> getEstabilidades() {
		return estabilidades;
	}
	public void setEstabilidades(Set<Estabilidade> estabilidades) {
		this.estabilidades = estabilidades;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estabilidades == null) ? 0 : estabilidades.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Estabilidade other = (Estabilidade) obj;
		if (estabilidades == null) {
			if (other.estabilidades != null)
				return false;
		} else if (!estabilidades.equals(other.estabilidades))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Estabilidade [id=" + id + ", estabilidades=" + estabilidades + "]";
	}

}
