package puc.devops;

import org.junit.Test;

import junit.framework.Assert;

public class SaqueUnitarioTest {
	
	@Test
	public void verificarSenhaValida() {
		System.out.println("----------------> inicio verificarSenhaValida <----------------");
		Saque saque = new Saque();
		boolean senha = saque.validarSenha("12345");
		Assert.assertEquals(true, senha);
		System.out.println("----------------> fim verificarSenhaValida <----------------");
	}
	
	@Test
	public void verificarSenhaInvalida() {
		System.out.println("----------------> inicio verificarSenhaInvalida <----------------");
		Saque saque = new Saque();
		boolean senha = saque.validarSenha("123456");
		Assert.assertEquals(false, senha);
		System.out.println("----------------> fim verificarSenhaInvalida <----------------");
	}
	
	
}