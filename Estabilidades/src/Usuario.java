import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public abstract class Usuario implements ProjEstabilidade {
	
	@Id
	@GeneratedValue
	@Column(name="Id_usuario")
	private int id_Usuario;
	
	@ManyToMany
	@JoinTable(name =  "Cadastra", joinColumns = @JoinColumn(name = "id_cadastro"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Cadastro>cadastra;
	
	@ManyToMany
	@JoinTable(name =  "Loga", joinColumns = @JoinColumn(name = "id_login"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Login>loga; 
	
	@ManyToMany
	@JoinTable(name=" denuncias", joinColumns = @JoinColumn(name="id_denuncias"), inverseJoinColumns = @JoinColumn(name = "id_Usuario"))
	private ArrayList<Denuncias>faz_denuncias;
	
// -------------------------------------------------------//	

	public int getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(int id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public ArrayList<Cadastro> getCadastra() {
		return cadastra;
	}

	public void setCadastra(ArrayList<Cadastro> cadastra) {
		this.cadastra = cadastra;
	}

	public ArrayList<Login> getLoga() {
		return loga;
	}

	public void setLoga(ArrayList<Login> loga) {
		this.loga = loga;
	}

	public ArrayList<Denuncias> getFaz_denuncias() {
		return faz_denuncias;
	}

	public void setFaz_denuncias(ArrayList<Denuncias> faz_denuncias) {
		this.faz_denuncias = faz_denuncias;
	}

	public Usuario(int id_Usuario, ArrayList<Cadastro> cadastra, ArrayList<Login> loga, ArrayList<Denuncias> faz_denuncias) {
		super();
		this.id_Usuario = id_Usuario;
		this.cadastra = cadastra;
		this.loga = loga;
		this.faz_denuncias = faz_denuncias;
	}

	
	

}
