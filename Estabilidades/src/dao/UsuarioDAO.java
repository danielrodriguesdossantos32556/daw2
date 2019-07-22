package dao;

import java.awt.List;

import javax.persistence.metamodel.IdentifiableType;

import entities.Usuario;

@SuppressWarnings("rawtypes")
public class UsuarioDAO extends DAO<IdentifiableType> {

	public UsuarioDAO() {
		super();
	}

	public List findBy(Usuario filtro) {
		return null;
	}

	public Usuario getByID(long usuarioId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}