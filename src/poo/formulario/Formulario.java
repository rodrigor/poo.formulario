package poo.formulario;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Formulario extends ComponenteCompostoFormulario{
	
	private Map<String,Campo> campos;
	
	public Formulario(){
		campos = new HashMap<String,Campo>();
	}
	
	public void add(ComponenteDeFormulario componente){
		if(!(componente instanceof Campo))
			throw new IllegalArgumentException();
		Campo campo = (Campo)componente;
		campos.put(campo.getId(), campo);
		super.add(campo);
	}
	
	public boolean setValor(String campoId,String valor){
		Campo c = campos.get(campoId);
		c.setValor(valor);
		return c.validar();
	}
	
	public void exibir(PrintStream out){
		StringBuffer str = new StringBuffer();
		str.append("-------------");
		super.exibir(out);
	}


}
