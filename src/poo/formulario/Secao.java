package poo.formulario;

import java.io.PrintStream;

public class Secao extends ComponenteCompostoFormulario{
	
	private String cabecalho = "";
	
	public Secao(String cabecalho){
		this.cabecalho = cabecalho;
	}

	@Override
	public void exibir(PrintStream out) {
		out.println("*****"+cabecalho.toUpperCase()+"*****");
		super.exibir(out);
		out.println("*************************************");		
	}


}
