package dao;

import java.util.List;
import entities.Bairros;

public class BairrosDAO extends DAO<Bairros> {

	public BairrosDAO() {
		super(Bairros.class);
	}

	public List<BairrosDAO> findBy(Bairros filtro) {
		return null;
	}


}
