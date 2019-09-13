package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import entities.Bairros;
import services.BairrosService;

public class BairrosTest {
	@Test
	public void adicionaCliente() {
		BairrosService service = new BairrosService();
		Bairros u = new Bairros();
		u.setNome_bairro("b");

		service.save(u);

		assertNotNull(u.getId());

		Bairros b2 = service.getByID(u.getId());
		assertEquals(u, b2);
		service.update(u);

		Bairros b3 = service.getByID(0);
		assertEquals("buffet", b3.getNome_bairro());
		service.remove(b2);

		Bairros b4 = service.getByID(0);
		assertNull(b4);
	}

}