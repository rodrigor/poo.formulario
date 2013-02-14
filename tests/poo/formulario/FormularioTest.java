package poo.formulario;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class FormularioTest {


	@Test
	public void testeBasicoFormulario() {
		
		Formulario f = new Formulario();
		f.add(new Campo("texto","Campo Texto",new ValidadorTexto()));
		f.add(new Campo("inteiro","Campo Inteiro",new ValidadorInteiro()));
		
		assertTrue(f.setValor("texto","abcde"));
		assertTrue(f.setValor("texto","abcdef"));
		assertTrue(f.setValor("texto",null));
		
	}

}
