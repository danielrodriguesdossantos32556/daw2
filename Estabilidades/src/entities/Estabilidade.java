package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import idenuncia.Identificavel;

@Entity
@Table(name = "estabilidade")
public class Estabilidade implements Identificavel {
	@Id
	@GeneratedValue
	private int IDC;

	private String estabilidade;

	public int getIDC() {
		return IDC;
	}

	public void setIDC(int iDC) {
		IDC = iDC;
	}

	public String getEstabilidade() {
		return estabilidade;
	}

	public void setEstabilidade(String estabilidade) {
		this.estabilidade = estabilidade;
	}

	@Override
	public String toString() {
		return "Estabilidade [IDC=" + IDC + ", estabilidade=" + estabilidade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IDC;
		result = prime * result + ((estabilidade == null) ? 0 : estabilidade.hashCode());
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
		if (IDC != other.IDC)
			return false;
		if (estabilidade == null) {
			if (other.estabilidade != null)
				return false;
		} else if (!estabilidade.equals(other.estabilidade))
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
