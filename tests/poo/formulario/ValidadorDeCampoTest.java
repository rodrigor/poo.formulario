package poo.formulario;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidadorDeCampoTest {

	@Test
	public void testValidadorInteiro(){
		Campo c = new Campo("idade","Digite sua idade:",new ValidadorInteiro());
		
		c.setValor(null);
		assertTrue(c.validar());
		
		c.setValor("dkjfghsjghdkj");
		assertFalse(c.validar());
		
		c.setValor("123");
		assertTrue(c.validar());
		
		c.setValor("000000123");
		assertTrue(c.validar());
	}

	@Test
	public void testValidadorTexto() {		
		Campo c = new Campo("texto","Texto",new ValidadorTexto());
		assertTrue(c.validar());
		
		c.setValor("dkjfghsjghdkj");
		assertTrue(c.validar());
		
		c.setValor("a22222");
		assertTrue(c.validar());

		c.setValor(null);
		assertTrue(c.validar());
		
	}

	@Test
	public void testNotNullDecorator(){
		Campo c = new Campo("texto","Teste",new NotNullDecorator(new ValidadorTexto()));
		assertFalse(c.validar());
		
		c.setValor(null);
		assertFalse(c.validar());
	}
	
	
	@Test
	public void testSizeDecorator(){
		Campo c = new Campo("texto","Teste",new SizeDecorator(new ValidadorTexto(),3,8));
		
		c.setValor("abc");
		assertTrue(c.validar());
		c.setValor("abcdefgh");
		assertTrue(c.validar());

		c.setValor("ab");
		assertFalse(c.validar());
		c.setValor("abcdefghi");
		assertFalse(c.validar());
	}

}
