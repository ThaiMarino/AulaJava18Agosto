package exemploHeranca;

public class ContaPoupanca extends ContaBancaria {
	
	private double rendimentos;

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

	public ContaPoupanca(double saldo, String cpf, double rendimentos) {
		super(saldo, cpf);
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [rendimentos=" + rendimentos + ", getSaldo()=" + getSaldo() + ", getCpf()=" + getCpf()+ "]";
	}


	
	
	
}
