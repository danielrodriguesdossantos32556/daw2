package dao;

import java.awt.List;

import entities.Bairros;
import entities.Cadastro;

public class CadastroDAO extends DAO<Cadastro> {

	public CadastroDAO() {
		super(Cadastro.class);
	}
	public List findBy(Bairros filtro) {
		return null;
	}
}
