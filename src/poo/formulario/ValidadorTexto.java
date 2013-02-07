package poo.formulario;

public class ValidadorTexto implements ValidadorDeCampo {

	@Override
	public boolean validar(String valor) {
		if(valor == null) return true;
		try{
			Integer.parseInt(valor);
			return false;
		}catch(Exception e){
			return true;
		}
	}

}
