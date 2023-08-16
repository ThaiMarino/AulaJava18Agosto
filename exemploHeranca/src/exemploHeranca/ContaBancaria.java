package exemploHeranca;

public class ContaBancaria {
	private double saldo;
	private String cpf;
	
	//source - generate field - omitir super
	public ContaBancaria(double saldo, String cpf) {
		this.saldo = saldo;
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void saque(double valor) {
		this.saldo-=valor;
		//this.saldo = this.saldo - valor - é a mesma coisa
	}
	
	public void deposito(double valor) {
		this.saldo+=valor;
		//this.saldo=this.saldo+valor;
	}

	@Override
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + ", cpf=" + cpf + "]";
	}
	
	
}
