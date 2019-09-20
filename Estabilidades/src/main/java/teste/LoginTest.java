package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import entities.Login;
import services.LoginService;

public class LoginTest {
	@Test
	
	public void adicionaCliente() {
		LoginService service = new LoginService();
		Login l = new Login();
		l.setSenha_usuario("l");

		service.save(l);

		assertNotNull(l.getId());

		Login l2 = service.getByID(l.getId());
		assertEquals(l, l2);
		service.update(l);

		Login l3 = service.getByID(0);
		assertEquals("buffet", l3.getSenha_usuario());
		service.remove(l2);

		Login l4 = service.getByID(0);
		assertNull(l4);
	}

}