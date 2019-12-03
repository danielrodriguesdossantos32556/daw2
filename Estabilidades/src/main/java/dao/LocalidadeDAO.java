package dao;

import java.awt.List;

import entities.Denuncias;
import entities.Identificavel;
import entities.Localidade;

public class LocalidadeDAO extends DAO<Identificavel> {
	
	public LocalidadeDAO() {
		super(Localidade.class);
	}
	public List findBy(Localidade filtro) {
		return null;
	}

}
