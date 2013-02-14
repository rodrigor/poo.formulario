package poo.formulario;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class ComponenteCompostoFormulario implements ComponenteDeFormulario {
	
	private List<ComponenteDeFormulario> componentes = new LinkedList<ComponenteDeFormulario>();

	@Override
	public void exibir(PrintStream out) {
		for(ComponenteDeFormulario componente: componentes){
			componente.exibir(out);
		}
	}
	
	public void add(ComponenteDeFormulario componente){
		componentes.add(componente);
	}
	
	public boolean validar(){
		for(ComponenteDeFormulario componente: componentes){
			if(!componente.validar()) return false;
		}
		return true;
	}



}
