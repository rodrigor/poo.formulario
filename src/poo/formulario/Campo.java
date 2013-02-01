package poo.formulario;

public class Campo {
	
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
	
	public boolean validar(){
		return validador.validar(this.valor);
	}

}
