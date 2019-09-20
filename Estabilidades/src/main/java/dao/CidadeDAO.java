package dao;

import java.awt.List;
import entities.Cidade;

public class CidadeDAO extends DAO<Cidade> {

	public CidadeDAO() {
		super(Cidade.class);
	}

	public List findBy(Cidade filtro) {
		return null;
	}

}
