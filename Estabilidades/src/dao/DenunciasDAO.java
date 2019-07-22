package dao;

import java.awt.List;

import javax.persistence.metamodel.IdentifiableType;

import entities.Denuncias;

@SuppressWarnings("rawtypes")
public class DenunciasDAO extends DAO<IdentifiableType> {

	public DenunciasDAO() {
		super();
	}

	public List findBy(Denuncias filtro) {
		return null;
	}

}
