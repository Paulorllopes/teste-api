import org.junit.jupiter.api.Test;

public class salarioTeste {
	
	@Test
	public void deveReceberSalarioFixo() {
		Salario salario = new Salario("Paulo Robson");
		salario.salarioFixo = 2000;
		System.out.println("Você recebe fixo: " + salario.salarioFixo);
		
	}
	
	@Test
	public void deveReceberSalarioComComissao() {
		Salario salario = new Salario("Paulo Robson");
		salario.salarioFixo = 2000;
		salario.vendaEmDinheiro = 5000;
		salario.valorComicao = 10;
		salario.SalarioComicao = salario.vendaEmDinheiro /100 * salario.valorComicao;
		salario.salarioFinal = salario.salarioFixo + salario.SalarioComicao;
		
		System.out.println("Seu salario fixo  mensal é: " + salario.salarioFixo);
		System.out.println("Suas vendas em dinheiro esse mês deu: " + salario.vendaEmDinheiro);
		System.out.println("Sua comição é: " + salario.SalarioComicao);
		System.out.println("Esse mês você vai receber o total de: " + salario.salarioFinal);
		
		
	}

}
