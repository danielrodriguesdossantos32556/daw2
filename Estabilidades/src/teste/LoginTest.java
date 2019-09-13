package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import entities.Login;
import services.LoginService;

public class LoginTest {
	@Test
	@DisplayName("Teste classe Login")
	public void adicionaCliente() {
		LoginService service = new LoginService();
		Login u = new Login();
		u.setSenha_usuario("l");

		service.save(l);

		assertNotNull(u.getId());

		Login l2 = service.getByID(u.getId());
		assertEquals(u, l2);
		service.update(u);

		Login l3 = service.getByID(0);
		assertEquals("buffet", l3.getSenha_usuario());
		service.remove(l2);

		Login l4 = service.getByID(0);
		assertNull(l4);
	}

}