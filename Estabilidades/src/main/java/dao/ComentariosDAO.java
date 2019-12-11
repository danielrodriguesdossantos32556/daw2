package dao;

import java.awt.List;

import entities.Comentarios;

public class ComentariosDAO extends DAO<Comentarios> {

	public ComentariosDAO() {
		super(Comentarios.class);
	} 

	public List findBy(Comentarios filtro) {
		return null;
	}

}
