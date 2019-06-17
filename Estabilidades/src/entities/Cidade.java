package entities;


import java.awt.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="cidade")
public class Cidade {
	
	private int cep;
	
	private String nome;
	@OneToOne
	@JoinColumn
	private Mapa mapa;
	@ManyToMany
	@JoinTable(name =  "Ruas", joinColumns = @JoinColumn(name = "cep"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Ruas>ruas;
	@ManyToMany
	@JoinTable(name =  "Bairros", joinColumns = @JoinColumn(name = "id_bairros"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Bairros>bairros;
	
	
	//-----------------------------------------------------------//
	
	
	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
//-----------------------------------------CONSTRUTOR/APAGAR?--------------------------------------------------------//
	
	public Cidade(int cep, String nome, Mapa mapa, ArrayList<Ruas> ruas, ArrayList<Bairros> bairros) {
		super();
		this.cep = cep;
		this.nome = nome;
		this.mapa = mapa;
		this.ruas = ruas;
		this.bairros = bairros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Mapa getMapa() {
		return mapa;
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}

	public ArrayList<Ruas> getRuas() {
		return ruas;
	}

	public void setRuas(ArrayList<Ruas> ruas) {
		this.ruas = ruas;
	}

	public ArrayList<Bairros> getBairros() {
		return bairros;
	}

	public void setBairros(ArrayList<Bairros> bairros) {
		this.bairros = bairros;
	}

	public Object getCidade() {
		return getCidade();
	}

	public Cidade getByID(long cidade) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
