package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Denuncias")
public class Denuncias implements Identificavel {
	@Id
	@GeneratedValue
	@Column(name = "Id_denuncias")
	private Long id;

	@Column(name = "denuncias_denuncias")
	private String denuncias;

	@ManyToMany
	@JoinTable(name = "Ruas", joinColumns = @JoinColumn(name = "id_ruas"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private Set<Ruas> denuncias_ruas;

	@ManyToMany
	@JoinTable(name = "Bairros", joinColumns = @JoinColumn(name = "id_bairros"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private Set<Bairros> denuncias_bairros;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDenuncias() {
		return denuncias;
	}

	public void setDenuncias(String denuncias) {
		this.denuncias = denuncias;
	}

	public Set<Ruas> getDenuncias_ruas() {
		return denuncias_ruas;
	}

	public void setDenuncias_ruas(String denuncias) {
		this.denuncias = denuncias;
	}

	public String getDenuncias_bairros() {
		return denuncias;
	}

	public void setDenuncias_bairros(Set<Bairros> denuncias) {
		this.denuncias_bairros = denuncias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		long result = 1;
		result = prime * result + ((denuncias == null) ? 0 : denuncias.hashCode());
		result = prime * result + ((denuncias_bairros == null) ? 0 : denuncias_bairros.hashCode());
		result = prime * result + ((denuncias_ruas == null) ? 0 : denuncias_ruas.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return (int) result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Denuncias other = (Denuncias) obj;
		if (denuncias == null) {
			if (other.denuncias != null)
				return false;
		} else if (!denuncias.equals(other.denuncias))
			return false;
		if (denuncias_bairros == null) {
			if (other.denuncias_bairros != null)
				return false;
		} else if (!denuncias_bairros.equals(other.denuncias_bairros))
			return false;
		if (denuncias_ruas == null) {
			if (other.denuncias_ruas != null)
				return false;
		} else if (!denuncias_ruas.equals(other.denuncias_ruas))
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
		return "Denuncias [id=" + id + ", denuncias=" + denuncias + ", denuncias_ruas=" + denuncias_ruas
				+ ", denuncias_bairros=" + denuncias_bairros + "]";
	}

}
