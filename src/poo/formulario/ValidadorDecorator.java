package poo.formulario;

public class ValidadorDecorator implements ValidadorDeCampo {
	
	private ValidadorDeCampo componente;
	
	public ValidadorDecorator(ValidadorDeCampo comp){
		this.componente = comp;
	}

	@Override
	public boolean validar(String valor) {
		return componente.validar(valor);
	}

}
