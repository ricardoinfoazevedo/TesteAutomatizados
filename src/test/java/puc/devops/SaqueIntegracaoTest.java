package puc.devops;

import org.junit.Test;

import junit.framework.Assert;

public class SaqueIntegracaoTest {
	
	@Test
	public void verificarAtualizacaoSaldoValida() {
		System.out.println("----------------> inicio verificarAtualizacaoSaldoValida <----------------");
		Saque saque = new Saque();
		
		int novoSaldo = saque.debitarValor(50);
		boolean atualizou = saque.atualizarSaldo(novoSaldo);



		Assert.assertEquals(true, atualizou);
		System.out.println("----------------> fim verificarAtualizacaoSaldoValida <----------------");
	}
	
	@Test
	public void verificarAtualizacaoSaldoInValida() {
		System.out.println("----------------> inicio verificarAtualizacaoSaldoInValida <----------------");
		Saque saque = new Saque();
		
		int novoSaldo = saque.debitarValor(50);
		novoSaldo = novoSaldo + 200;
		boolean atualizou = saque.atualizarSaldo(novoSaldo);
		
		Assert.assertEquals(false, atualizou);
		System.out.println("----------------> fim verificarAtualizacaoSaldoInValida <----------------");
	}
	
	
}