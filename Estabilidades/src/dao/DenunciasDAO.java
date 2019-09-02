package dao;

import java.awt.List;

import entities.Denuncias;

public class DenunciasDAO extends DAO<Denuncias> {

	public DenunciasDAO() {
		super(Denuncias.class);
	}

	public List findBy(Denuncias filtro) {
		return null;
	}

}
