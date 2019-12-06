package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Denuncias implements Identificavel {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "denuncias_denuncias")
	private String denuncias;

	@ManyToMany
	@JoinTable(name = "denuncias_localidade", joinColumns = @JoinColumn(name = "id_denuncia"), inverseJoinColumns = @JoinColumn(name = "id_localidade"))
	private Set<Localidade> denuncias_localidade;

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

	public void setDenuncias_ruas(String denuncias) {
		this.denuncias = denuncias;
	}

	public String getDenuncias_bairros() {
		return denuncias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denuncias == null) ? 0 : denuncias.hashCode());
		result = prime * result + ((denuncias_localidade == null) ? 0 : denuncias_localidade.hashCode());
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
		Denuncias other = (Denuncias) obj;
		if (denuncias == null) {
			if (other.denuncias != null)
				return false;
		} else if (!denuncias.equals(other.denuncias))
			return false;
		if (denuncias_localidade == null) {
			if (other.denuncias_localidade != null)
				return false;
		} else if (!denuncias_localidade.equals(other.denuncias_localidade))
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
		return "Denuncias [id=" + id + ", denuncias=" + denuncias + ", denuncias_localidade=" + denuncias_localidade
				+ "]";
	}
}
