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
		Establidade nulo = null;
		Establidade e = nulo;
		ArrayList<Clip> cep = null;
		Establidade mapa = nulo;
		Establidade ruas = nulo;
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
		ArrayList<Establidade> estavel = null;
		Bairros b = ((Object) e).criarBairros(" Teste ", bairro, nome, estavel, ruas);
		asserNotNull(b);
		assertEquals(" Teste ", b.getBairros());
	}

	@Test
	void criarCadastro() {
		Establidade nulo = null;
		Establidade e = nulo;
		ArrayList<Cadastro> cadastro = null;
		Establidade senha = nulo;
		Establidade nickname = nulo;
		Establidade nome = nulo;
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
		Establidade e = null;
		Establidade nulo = null;
		Establidade iDC = nulo;
		ArrayList<String> estabilidade = null;
		Establidade e1 = e.criarEstabilidade(" Teste Estabilidade ", iDC, estabilidade);
		asserNotNull(e1);
		assertEquals(" Teste usuario ", e1.getEstabilidade());
	}

	@Test
	void criarLogin() {
		Establidade e = null;
		ArrayList<Log> login = null;
		ArrayList<String> senha = null;
		ArrayList<String> nickName_usuario = null;
		Log l = e.criarLogin(" Teste ", login, senha, nickName_usuario);
		asserNotNull(l);
		assertEquals(" Teste ", ((Object) l).get());
	}

	@Test
	void criarRuas() {
		Establidade e = null;
		ArrayList<Ruas> ruas = null;
		ArrayList<String> nome = null;
		ArrayList<Establidade> estavel = null;
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

	private void asserNotNull(Establidade e1) {
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