package interfaces;

import java.util.ArrayList;

import javax.xml.crypto.Data;

import dao.EstabilidadeDAO;
import entities.Bairros;
import entities.Ruas;

public interface ProjEstabilidade {
	
	public void Cidade(int cep, String nome, ArrayList<Ruas> ruas, ArrayList<Bairros> bairros);
	
	
	public void Bairros(int id_bairro, String nome_bairro, ArrayList<EstabilidadeDAO> estavel, ArrayList<Ruas> ruas);
	
	
	public void Cadastro(int id_cadastro, String nova_senha, String novo_nickname, String nome_completo, String email, Data data_de_nascimento);
		
	
	public void Denuncias(int id_denuncias, String denuncias, ArrayList<Ruas> denuncias_ruas, ArrayList<Bairros> denuncias_bairros);
	
	
	public void Estabilidade(int iDC, String estabilidade);
	
	
	public void Login(int id_login, String senha_usuario, String nickName_usuario);
	
	
	public void Ruas(int id_ruas, String nome_ruas, ArrayList<EstabilidadeDAO> estavel);
	
}
