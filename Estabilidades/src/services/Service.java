package services;

import java.util.List;

import entities.Cadastro;
import idenuncia.Identificavel;

public interface Service<E extends Identificavel> {

	void save(E e);

	void update(E e);

	void remove(E e);

	E getByID(long userId);

	List<E> getAll();

	void save(Cadastro cadastro);

}