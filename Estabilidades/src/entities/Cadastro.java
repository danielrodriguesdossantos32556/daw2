package entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import idenuncia.Identificavel;
@Entity
@Table(name="cadastro")
public class Cadastro implements Identificavel{
	@Id
	@GeneratedValue
	private long id_cadastro;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	//-------------------------------------------------------------//
}
