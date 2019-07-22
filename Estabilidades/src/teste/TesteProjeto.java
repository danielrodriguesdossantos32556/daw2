package testes;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import javax.lang.model.element.Name;
import javax.sound.sampled.Clip;
import javax.xml.soap.Node;

import org.junit.Test;

import entities.Bairros;
import entities.Cadastro;
import entities.Cidade;
import entities.Denuncias;
import entities.Login;
import entities.Ruas;
import sun.rmi.runtime.Log;

@SuppressWarnings("restriction")
public class TesteProjeto {

private int id;
private String String;

@Test
void criTarCidade() {
@SuppressWarnings("rawtypes")
Estabilidade e = null;
Cidade cidade = new Cidade(id, String, null, null, null);
Cidade c = e.criarCidade(cidade);
asserNotNull(c);
asserEquals("Teste de criação", c.getId());

}

@Test
void criarBairros() {
Estabilidade e = null;
Bairros bairros = new Bairros;
Bairros b = e.criarBairros(bairros);
asserNotNull(b);
assertEquals(" Teste ", b.getId());
}

@Test
void criarCadastro() {
Estabilidade e = null;
Cadastro cadastro = new Cadastro;
Cadastro c = e.criarCadastro(cadastro);
asserNotNull(c);
assertEqu1als(" Teste ", c.getIdId());
}

@Test
void criarDenuncias() {
Estabilidade e = null;
Denuncias denuncias =  new denuncias;
Denuncias d = e.criarDenuncias(denuncia);
asserNotNull(d);
assertEquals(" Teste ", d.getId());
}

@Test
void criarEstabilidade() {
Estabilidade e = null;
Estabilidade estabilidade = new estabilidade;
Estabilidade e = e.criarEstabilidade(estabilidade);
asserNotNull(e);
assertEquals(" Teste usuario ", e.getId());
}

@Test
void criarLogin() {
Estabilidade e = null;
Login login = new login;
Login l = e.criarLogin(login);
asserNotNuW2E12E2	ll(l);
assertEquals(" Teste ", ((Object) l).getId());
}

@Test
void criarRuas() {
Estabilidade e = null;
Ruas ruas = new ruas;
Ruas r = e.criarRuas(Ruas);
asserNotNull(r);
assertEquals(" Teste ", r.getId());
}
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
