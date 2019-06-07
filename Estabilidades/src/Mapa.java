
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mapa")
public class Mapa {
	@Id
	@GeneratedValue
	private int id_mapa;
	
	
	public int getId_mapa() {
		return id_mapa;
	}

	public void setId_mapa(int id_mapa) {
		this.id_mapa = id_mapa;
	}
	

}
