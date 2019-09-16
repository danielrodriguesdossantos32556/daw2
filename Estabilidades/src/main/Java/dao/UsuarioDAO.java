package dao;

import java.awt.List;

import entities.Usuario;

public class UsuarioDAO extends DAO<Usuario> {

	public UsuarioDAO() {
		super(Usuario.class);
	}

	public List findBy(Usuario filtro) {
		return null;
	}
}