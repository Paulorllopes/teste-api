import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {
	
	@Test
	public void testDeveDepositarCorretamenteOValorInformado() {
		
		Conta conta = new Conta("Paulo Robson", 12312312320L, 12/12/2020L);
		conta.saldo = 200;
		conta.depositar(300);
		Assertions.assertEquals(500, conta.saldo);
		System.out.println(conta.saldo);
		
	}
	
	@Test
	public void testDeveSacarCorretamenteOValorInformado() {
		Conta conta = new Conta("Paulo Robson", 12312312320L, 12/12/2020L);
		conta.saldo = 500;
		conta.sacar(300);
		Assertions.assertEquals(200, conta.saldo);
		System.out.println(conta.titular + conta.cpf );
		System.out.println(conta.saldo);
	}
	
	@Test
	public void testDeveReceberSalarioEAumentarOsaldoDaConta() {
		Conta conta = new Conta("Paulo Robson", 12312312320L, 12/12/2020L);
		conta.saldo = 500;
		conta.receber(2000);
		Assertions.assertEquals(2500, conta.saldo);
		System.out.println(conta.saldo);
	}
	@Test
	public void testDeveConsultarSeOValorDoSaqueEMaiorQueOSaldoEmConta() {
		Conta conta = new Conta("Paulo Robson", 12312312320L, 12/12/2020L);
		conta.saldo = 0;
		conta.contaNegativa = -1;
		if(conta.saldo <= conta.contaNegativa) {
			System.out.println("Não é possível sacar!");
		}else {
			conta.sacar(100);
			Assertions.assertEquals(-100, conta.saldo);
			System.out.println("Você sacou, o saldo da sua conta é: " + conta.saldo);
		}
		 
	}

}
