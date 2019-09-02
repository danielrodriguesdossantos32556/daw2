package teste;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estabilidade")
public class Estabilidade {
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

	public Estabilidade(int iDC, String estabilidade) {
		super();
		IDC = iDC;
		this.estabilidade = estabilidade;
	}
}
