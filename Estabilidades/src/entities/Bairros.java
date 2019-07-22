package entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import idenuncia.Identificavel;

@Entity
public class Bairros implements Identificavel {
	@Id
	@GeneratedValue
	private Long id;

	private String nome_bairro;
	@ManyToMany
	@JoinTable(name = "Bairros", joinColumns = @JoinColumn(name = "IDC"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Estabilidade> estavel;
	@ManyToMany
	@JoinTable(name = "Bairros", joinColumns = @JoinColumn(name = "id_bairro"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Ruas> ruas;

	// --------------------------------------------//

	public Long getId() {
		return id;
	}

	public void setId(Long id_bairro) {
		this.id = id_bairro;
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

	public Bairros(Long id_bairro, String nome_bairro, ArrayList<Estabilidade> estavel, ArrayList<Ruas> ruas) {
		super();
		this.id = id_bairro;
		this.nome_bairro = nome_bairro;
		this.estavel = estavel;
		this.ruas = ruas;
	}

	


}