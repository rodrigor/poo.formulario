package poo.formulario;

public class ValidadorTexto implements ValidadorDeCampo {

	private int maxLength;
	
	public ValidadorTexto(int max){
		this.maxLength = max;
	}
	@Override
	public boolean validar(String valor) {
		if(valor == null || valor.length() == 0) return false;
		return valor.length() <= this.maxLength;
	}

}
