package exemploHeranca;

public class ContaCorrente extends ContaBancaria {
	
	private double limite;
	
	public ContaCorrente(double saldo, String cpf, double limite) {
		super(saldo, cpf);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaCorrente [limite=" + limite + ", getSaldo()=" + getSaldo() + ", getCpf()=" + getCpf()+ "]";
	}

	

	
}
