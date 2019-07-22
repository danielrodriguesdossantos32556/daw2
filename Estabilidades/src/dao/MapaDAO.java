package dao;

import java.awt.List;

import javax.persistence.metamodel.IdentifiableType;

import entities.Mapa;

@SuppressWarnings("rawtypes")
public class MapaDAO extends DAO<IdentifiableType> {

	public MapaDAO() {
		super();
	}

	public List findBy(Mapa filtro) {
		return null;
	}

	public Mapa getByID(long mapaId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}