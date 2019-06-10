package interfaces;


import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Denuncias")
public class Denuncias {
	@Id
	@GeneratedValue
	private int id_denuncias;

	private String denuncias;
	@ManyToMany
	@JoinTable(name = "Ruas", joinColumns = @JoinColumn(name = "id_ruas"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Ruas> denuncias_ruas;
	@ManyToMany
	@JoinTable(name = "Bairros", joinColumns = @JoinColumn(name = "id_bairros"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Bairros> denuncias_bairros;

	// ----------------------------------------------------//

	public int getId_denuncias() {
		return id_denuncias;
	}

	public void setId_denuncias(int id_denuncias) {
		this.id_denuncias = id_denuncias;
	}

	public String getDenuncias() {
		return denuncias;
	}

	public void setDenuncias(String denuncias) {
		this.denuncias = denuncias;
	}

	public ArrayList<Ruas> getDenuncias_ruas() {
		return denuncias_ruas;
	}

	public void setDenuncias_ruas(ArrayList<Ruas> denuncias_ruas) {
		this.denuncias_ruas = denuncias_ruas;
	}

	public ArrayList<Bairros> getDenuncias_bairros() {
		return denuncias_bairros;
	}

	public void setDenuncias_bairros(ArrayList<Bairros> denuncias_bairros) {
		this.denuncias_bairros = denuncias_bairros;
	}

	public Denuncias(int id_denuncias, String denuncias, ArrayList<Ruas> denuncias_ruas,
			ArrayList<Bairros> denuncias_bairros) {
		super();
		this.id_denuncias = id_denuncias;
		this.denuncias = denuncias;
		this.denuncias_ruas = denuncias_ruas;
		this.denuncias_bairros = denuncias_bairros;
	}

}
