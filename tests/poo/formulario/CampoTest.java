package poo.formulario;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class CampoTest {

	@Test
	public void testValidadorTexto() {
		Campo c = new Campo("nome","Nome completo:", new ValidadorTexto(5));
		
		c.setValor(null);
		assertFalse(c.validar());
		
		c.setValor("");
		assertFalse(c.validar());
		
		c.setValor("abcde");
		assertTrue(c.validar());
		
		c.setValor("abcdef");
		assertFalse(c.validar());
		
		
	}
	
	@Test
	public void testValidadorInteiro(){
		Campo c = new Campo("idade","Digite sua idade:",new ValidadorInteiro());
		
		c.setValor(null);
		assertFalse(c.validar());
		
		c.setValor("dkjfghsjghdkj");
		assertFalse(c.validar());
		
		c.setValor("123");
		assertTrue(c.validar());
	}

}
