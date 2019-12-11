package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Localidade implements Identificavel {
	@Column(name = "cidades")
	private String cidade;
	@Column(name = "Bairros")
	private String Barros;
	@Column(name = "ruas")
	private String Ruas;
	@Id
	@GeneratedValue
	private long id;

	private Set<Denuncias> denuncias_local;

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBarros() {
		return Barros;
	}

	public void setBarros(String barros) {
		Barros = barros;
	}

	public String getRuas() {
		return Ruas;
	}

	public void setRuas(String ruas) {
		Ruas = ruas;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Barros == null) ? 0 : Barros.hashCode());
		result = prime * result + ((Ruas == null) ? 0 : Ruas.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Localidade other = (Localidade) obj;
		if (Barros == null) {
			if (other.Barros != null)
				return false;
		} else if (!Barros.equals(other.Barros))
			return false;
		if (Ruas == null) {
			if (other.Ruas != null)
				return false;
		} else if (!Ruas.equals(other.Ruas))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Localidade [cidade=" + cidade + ", Barros=" + Barros + ", Ruas=" + Ruas + ", id=" + id + "]";
	}

	@Override
	public void setId(Long id) {
// TODO Auto-generated method stub

	}

	public Set<Denuncias> getDenuncias_local() {
		return denuncias_local;
	}

	public void setDenuncias_local(Set<Denuncias> denuncias_local) {
		this.denuncias_local = denuncias_local;
	}

}
