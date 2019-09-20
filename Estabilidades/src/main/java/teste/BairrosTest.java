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
		Bairros b = new Bairros();
		b.setNome_bairro("b");

		service.save(b);

		assertNotNull(b.getId());

		Bairros b2 = service.getByID(b.getId());
		assertEquals(b, b2);
		service.update(b);

		Bairros b3 = service.getByID(0);
		assertEquals("bbffet", b3.getNome_bairro());
		service.remove(b2);

		Bairros b4 = service.getByID(0);
		assertNull(b4);
	}

}