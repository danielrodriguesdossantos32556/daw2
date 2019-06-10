package entities;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import teste.Estabilidade;
@Entity 
public class Bairros {
	@Id
	@GeneratedValue
	private int id_bairro;
	
	private String nome_bairro;
	@ManyToMany
	@JoinTable(name =  "Bairros", joinColumns = @JoinColumn(name = "IDC"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Estabilidade>estavel;
	@ManyToMany
	@JoinTable(name =  "Bairros", joinColumns = @JoinColumn(name = "id_bairro"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Ruas>ruas;
	
	
	//--------------------------------------------//

	public int getId_bairro() {
		return id_bairro;
	}

	public void setId_bairro(int id_bairro) {
		this.id_bairro = id_bairro;
	}

	public String getNome_bairro() {
		return nome_bairro;
	}

	public void setNome_bairro(String nome_bairro) {
		this.nome_bairro = nome_bairro;
	}

	public ArrayList<Estabilidade> getEstavel() {
		return estavel;
	}

	public void setEstavel(ArrayList<Estabilidade> estavel) {
		this.estavel = estavel;
	}

	public ArrayList<Ruas> getRuas() {
		return ruas;
	}

	public void setRuas(ArrayList<Ruas> ruas) {
		this.ruas = ruas;
	}

	
	public Bairros(int id_bairro, String nome_bairro, ArrayList<Estabilidade> estavel, ArrayList<Ruas> ruas) {
		super();
		this.id_bairro = id_bairro;
		this.nome_bairro = nome_bairro;
		this.estavel = estavel;
		this.ruas = ruas;
	}

	public void setId(long l) {
		this.id_bairro = 0; 
		
	}

	public Object getBairros() {
		// TODO Auto-generated method stub
		return null;
	}

}
