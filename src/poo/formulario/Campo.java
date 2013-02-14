package poo.formulario;

import java.io.PrintStream;

public class Campo implements ComponenteDeFormulario{
	
	private String id;
	private String label;
	private String valor;
	private ValidadorDeCampo validador;
	
	public Campo(String id, String label,ValidadorDeCampo validador){
		this.id = id;
		this.validador = validador;
		this.label = label;
	}
	
	public String getLabel(){
		return this.label;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setValor(String valor){
		this.valor = valor;
	}
	
	@Override
	public boolean validar(){
		return validador.validar(this.valor);
	}

	@Override
	public void exibir(PrintStream out) {
		out.println("\t"+this.label+":"+this.valor);
	}

}
