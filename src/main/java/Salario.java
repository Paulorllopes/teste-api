
public class Salario {
	
	String nomeVendedor;
	double salarioFixo;
	double salarioFinal;
	double SalarioComicao;
	double valorComicao;
	double vendaEmDinheiro;
	
	public Salario (String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	
	public void receber(double valor) {
		this.salarioFinal += valor;
		this.SalarioComicao += valor;
		this.salarioFixo += valor;
		this.valorComicao += valor;
	}
	
	public void venderEmDinheiro(double valorVenda) {
		this.vendaEmDinheiro += valorVenda;
	}
	
	
	
	
	
	

}
