package teste;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import javax.lang.model.element.Name;
import javax.sound.sampled.Clip;
import javax.xml.soap.Node;

import org.junit.Test;

import sun.rmi.runtime.Log;

@SuppressWarnings("restriction")
public class TesteProjeto {

	@Test
	void criarCidade() {
		Estabilidade nulo = null;
		Estabilidade e = nulo;
		ArrayList<Clip> cep = null;
		Estabilidade mapa = nulo;
		Estabilidade ruas = nulo;
		ArrayList<Bairros> bairros = null;
		Cidade c = e.criarCidade("Tsete de criação", cep, mapa, ruas, bairros);
		asserNotNull(c);
		asserEquals("Teste de criação", c.getCidade());
	}

	private void asserEquals(String string, Object cidade) {
		// TODO Auto-generated method stub

	}

	@Test
	void criarBairros() {
		ArrayList<Name> nulo;
		ArrayList<Name> e = nulo;
		ArrayList<Bairros> bairro = null;
		ArrayList<Name> nome = nulo;
		ArrayList<Name> ruas = nulo;
		ArrayList<Estabilidade> estavel = null;
		Bairros b = ((Object) e).criarBairros(" Teste ", bairro, nome, estavel, ruas);
		asserNotNull(b);
		assertEquals(" Teste ", b.getBairros());
	}

	@Test
	void criarCadastro() {
		Estabilidade nulo = null;
		Estabilidade e = nulo;
		ArrayList<Cadastro> cadastro = null;
		Estabilidade senha = nulo;
		Estabilidade nickname = nulo;
		Estabilidade nome = nulo;
		ArrayList<String> email = null;
		ArrayList<Data_de_nascimento> data_de_nascimento = null;
		Object datadenascimento;
		Cadastro c = e.criarCadastro(" Teste ", cadastro, senha, nickname, nome, email, data_de_nascimento);
		asserNotNull(c);
		assertEquals(" Teste ", c.getCadastro());
	}

	@Test
	void criarDenuncias() {
		Establidade e = null;
		ArrayList<Denuncias> denuncias = null;
		ArrayList<String> denuncia = null;
		ArrayList<Ruas> denuncias_ruas = null;
		ArrayList<Bairros> denuncias_bairros = null;
		Denuncias d = e.criarDenuncias(" Teste ", denuncias, denuncia, denuncias_ruas, denuncias_bairros);
		asserNotNull(d);
		assertEquals(" Teste ", d.getDenuncias());
	}

	@Test
	void criarEstabilidade() {
		Estabilidade e = null;
		Estabilidade nulo = null;
		Estabilidade iDC = nulo;
		ArrayList<String> estabilidade = null;
		Estabilidade e1 = e.criarEstabilidade(" Teste Estabilidade ", iDC, estabilidade);
		asserNotNull(e1);
		assertEquals(" Teste usuario ", e1.getEstabilidade());
	}

	@Test
	void criarLogin() {
		Estabilidade e = null;
		ArrayList<Log> login = null;
		ArrayList<String> senha = null;
		ArrayList<String> nickName_usuario = null;
		Log l = e.criarLogin(" Teste ", login, senha, nickName_usuario);
		asserNotNull(l);
		assertEquals(" Teste ", ((Object) l).get());
	}

	@Test
	void criarRuas() {
		Estabilidade e = null;
		ArrayList<Ruas> ruas = null;
		ArrayList<String> nome = null;
		ArrayList<Estabilidade> estavel = null;
		Ruas r = e.criarRuas(" Teste ", ruas, nome, estavel);
		asserNotNull(r);
		assertEquals(" Teste ", r.getClass());
	}

	private void asserNotNull(Ruas r) {
		// TODO Auto-generated method stub
	}

	private void asserNotNull(Log l) {
		// TODO Auto-generated method stub
	}

	private void asserNotNull(Estabilidade e1) {
		// TODO Auto-generated method stub
	}

	private void asserNotNull(Denuncias d) {
		// TODO Auto-generated method stub
	}

	private void asserNotNull(Cadastro c) {
		// TODO Auto-generated method stub

	}

	private void asserNotNull(Bairros b) {
		// TODO Auto-generated method stub
	}

	private void asserNotNull(Cidade c) {
		// TODO Auto-generated method stub

	}
}