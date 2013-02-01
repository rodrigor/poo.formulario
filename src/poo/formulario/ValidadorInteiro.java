package poo.formulario;

public class ValidadorInteiro implements ValidadorDeCampo {

	@Override
	public boolean validar(String valor) {
		try{
			Integer.parseInt(valor);
			return true;
		}catch(Exception e){
			return false;
		}
	}

}
