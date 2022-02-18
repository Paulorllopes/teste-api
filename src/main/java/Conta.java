
public class Conta {
	
	String titular;
	long cpf;
	long dataInclusao;
	double saldo;
	double salario;
	double contaNegativa;
	
	public Conta(String titular, long cpf, long dataInclusao) {
		this.titular = titular;
		this.cpf = cpf;
		this.dataInclusao = dataInclusao;
		
		
	}
	
	public void depositar (double valor) {
		
		this.saldo += valor;
	}
	
	public void sacar (double valor) {
		this.saldo -=valor;
	}
	
	public void receber (double salario) {
		this.saldo += salario;
	}
	
	public void naoSacar(double semDinheiro) {
		this.contaNegativa = semDinheiro;
	}

}
