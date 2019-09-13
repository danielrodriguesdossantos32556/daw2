package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import entities.Usuario;
import services.UsuarioService;

public class UsuarioTest {
	@Test
	@DisplayName("Teste classe Usuario")
	public void adicionaCliente() {
		UsuarioService service = new UsuarioService();
		Usuario u = new Usuario();
		u.setNova_senha("u");

		service.save(u);

		assertNotNull(u.getId());

		Usuario u2 = service.getByID(u.getId());
		assertEquals(u, u2);
		service.update(u);

		Usuario u3 = service.getByID(0);
		assertEquals("buffet", u3.getNova_senha());
		service.remove(u2);

		Usuario u4 = service.getByID(0);
		assertNull(u4);
	}

}