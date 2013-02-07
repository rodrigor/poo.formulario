package poo.formulario;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class CampoTest {

	@Test
	public void testValidadorTexto() {
		Campo c = new Campo("nome","Nome completo:", new ValidadorTexto());
		
		c.setValor(null);
		assertTrue(c.validar());
		
		c.setValor("");
		assertTrue(c.validar());
		
		c.setValor("abcde");
		assertTrue(c.validar());
		
		c.setValor("2387462");
		assertFalse(c.validar());
		
		
	}
	


}
