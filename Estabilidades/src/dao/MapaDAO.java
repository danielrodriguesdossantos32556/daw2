package dao;

import java.awt.List;

import entities.Mapa;

public class MapaDAO implements DAO<Mapa> {

	public MapaDAO() {
		super(Mapa.class);
	}

	public List findBy(Mapa filtro) {
		return null;
	}
}