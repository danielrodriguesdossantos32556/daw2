package interfaces;

import java.util.Date;
import java.util.Set;

import entities.Localidade;

public interface ProjEstabilidade {

	public void Denuncias(int id_denuncias, String denuncias, Set<Localidade> denuncias_localidade);

	public void Localidade(String cidade, String Barros, String Ruas, long id);

	public void Usuario(Long id, String nova_senha, String novo_nickname, String nome_completo, String email,
			Date data_de_nascimento, String grupo);

	public void Comentarios(Long id, String nome);
	
}
