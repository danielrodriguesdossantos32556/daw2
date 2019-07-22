package dao;

import java.awt.List;

import javax.persistence.metamodel.IdentifiableType;

import testes.Estabilidade;

@SuppressWarnings("rawtypes")
public class EstabilidadeDAO extends DAO<IdentifiableType> {

	public EstabilidadeDAO() {
		super();
	}

	public List findBy(Estabilidade filtro) {
		return null;
	}

	public entities.Estabilidade getByID(long estabilidadeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}