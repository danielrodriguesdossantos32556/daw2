package dao;

import java.util.List;
import entities.Estabilidade;

public class EstabilidadeDAO extends DAO<Estabilidade> {

	public EstabilidadeDAO() {
		super(Estabilidade.class);
	}

	public List findBy(Estabilidade filtro) {
		return null;
	}
}
