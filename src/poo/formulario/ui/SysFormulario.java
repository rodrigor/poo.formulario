package poo.formulario.ui;

import poo.formulario.Campo;
import poo.formulario.Formulario;
import poo.formulario.Secao;
import poo.formulario.SizeDecorator;
import poo.formulario.ValidadorInteiro;
import poo.formulario.ValidadorTexto;

public class SysFormulario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Secao s = new Secao("Cadastro de Alunos");
		Formulario form = new Formulario();
		s.add(form);
		form.add(new Campo("nome","Nome completo",new SizeDecorator(0,100,new ValidadorTexto())));
		form.add(new Campo("idade","Idade",new ValidadorInteiro()));
		
		form.setValor("nome", "Rodrigo Rebouças");
		form.setValor("idade","sefjk");

		s.exibir(System.out);
		
		System.out.println(s.validar());
	}

}
