package interfaces;


import java.util.ArrayList;

import javax.xml.crypto.Data;

public interface ProjEstabilidade {
	
	public void Cidade(int cep, String nome, Mapa mapa, ArrayList<Ruas> ruas, ArrayList<Bairros> bairros);
	
	
	public void Bairros(int id_bairro, String nome_bairro, ArrayList<Estabilidade> estavel, ArrayList<Ruas> ruas);
	
	
	public void Cadastro(int id_cadastro, String nova_senha, String novo_nickname, String nome_completo, String email, Data data_de_nascimento);
		
	
	public void Denuncias(int id_denuncias, String denuncias, ArrayList<Ruas> denuncias_ruas, ArrayList<Bairros> denuncias_bairros);
	
	
	public void Estabilidade(int iDC, String estabilidade);
	
	
	public void Login(int id_login, String senha_usuario, String nickName_usuario);
	
	
	public void Ruas(int id_ruas, String nome_ruas, ArrayList<Estabilidade> estavel);
	
	
	public void Usuario(int id_Usuario, ArrayList<Cadastro> cadastra, ArrayList<Login> loga, ArrayList<Denuncias> faz_denuncias);
	
	
}
