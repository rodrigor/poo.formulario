package poo.formulario;

public class ValidadorInteiro implements ValidadorDeCampo {

	@Override
	public boolean validar(String valor) {
		if(valor == null) return true;
		try{
			Integer.parseInt(valor);
			return true;
		}catch(Exception e){
			return false;
		}
	}

}
