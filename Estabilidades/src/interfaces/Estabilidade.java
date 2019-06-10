package interfaces;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.sound.sampled.Clip;

import sun.rmi.runtime.Log;

@Entity
@Table(name = "estabilidade")
public class Estabilidade {
	@Id
	@GeneratedValue
	private int IDC;

	private String estabilidade;

	// -------------------------------------------------------//

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

	public Cidade criarCidade(String string, ArrayList<Clip> cep, Estabilidade mapa, Estabilidade ruas,
			ArrayList<Bairros> bairros) {
		// TODO Auto-generated method stub
		return criarCidade(string, cep, mapa, ruas, bairros);
	}

	public Estabilidade criarEstabilidade(String string, Estabilidade iDC2, ArrayList<String> estabilidade2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Log criarLogin(String string, ArrayList<Log> login, ArrayList<String> senha,
			ArrayList<String> nickName_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public Ruas criarRuas(String string, ArrayList<Ruas> ruas, ArrayList<String> nome, ArrayList<Estabilidade> estavel) {
		// TODO Auto-generated method stub
		return null;
	}

	public Denuncias criarDenuncias(String string, ArrayList<Denuncias> denuncias, ArrayList<String> denuncia,
			ArrayList<Ruas> denuncias_ruas, ArrayList<Bairros> denuncias_bairros) {
		// TODO Auto-generated method stub
		return null;
	}

}
