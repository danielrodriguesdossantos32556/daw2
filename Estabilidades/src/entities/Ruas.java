package entities;

 import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ruas")
public class Ruas {
	@Id
	@GeneratedValue
	private int id_ruas;

	private String nome_ruas;
	@ManyToMany
	@JoinTable(name =  "Estabilidade", joinColumns = @JoinColumn(name = "IDC"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Estabilidade> estavel;
	
	
	//-------------------------------------------------------//

	public int getId_ruas() {
		return id_ruas;
	}

	public void setId_ruas(int id_ruas) {
		this.id_ruas = id_ruas;
	}

	public String getNome_ruas() {
		return nome_ruas;
	}

	public void setNome_ruas(String nome_ruas) {
		this.nome_ruas = nome_ruas;
	}

	public ArrayList<Estabilidade> getEstavel() {
		return estavel;
	}

	public void setEstavel(ArrayList<Estabilidade> estavel) {
		this.estavel = estavel;
	}

	public Ruas(int id_ruas, String nome_ruas, ArrayList<Estabilidade> estavel) {
		super();
		this.id_ruas = id_ruas;
		this.nome_ruas = nome_ruas;
		this.estavel = estavel;
	}
	
	
	

}