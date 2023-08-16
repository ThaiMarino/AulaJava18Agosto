package exemploHeranca;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria contas[] = new ContaBancaria[3];
		
		Scanner entrada = new Scanner (System.in);
		
		String cpf;
		int tipo;
		double valor;
		int posicao;
		double saldo, limite, rendimentos;
		
		for(int i = 0; i < contas.length; i++) {
			System.out.println("1. Conta Corrente"
					+ "\n2. Conta Poupança"
					+ "\nInforme o tipo da conta");
			tipo=entrada.nextInt();
			
			switch(tipo) {
				case 1:
					System.out.println("CPF: ");
					cpf = entrada.next();
					System.out.println("Saldo: ");
					saldo = entrada.nextDouble();
					System.out.println("Limite: ");
					limite = entrada.nextDouble();
					contas[i] = new ContaCorrente(saldo, cpf, limite);
					break;
				case 2:
					System.out.println("CPF: ");
					cpf = entrada.next();
					System.out.println("Saldo: ");
					saldo = entrada.nextDouble();
					System.out.println("Rendimentos: ");
					rendimentos = entrada.nextDouble();
					contas[i] = new ContaCorrente(saldo, cpf, rendimentos);
					break;
				default:
					System.out.println("Opção inválida!");
					i--;
			}
	}

	for(ContaBancaria conta : contas) {
		System.out.println(conta.toString());
	}
	
	int operacao = 1;
	
	while(operacao!=0) {
		System.out.println("1. Saque"
				+ "\n2. Depósito"
				+ "\n3. Parar");
		operacao=entrada.nextInt();
		switch(operacao) {
		case 1:
			System.out.println("Informe o valor do saque:");
			valor = entrada.nextDouble();
			System.out.println("Informe a posição da conta: ");
			posicao = entrada.nextInt();
			contas[posicao].saque(valor); 
			break;
		case 2:
			System.out.println("Informe o valor do depósito:");
			valor = entrada.nextDouble();
			System.out.println("Informe a posição da conta: ");
			posicao = entrada.nextInt();
			contas[posicao].deposito(valor); 
			break;
		case 0:
			System.out.println("Obrigada");
			break;
		default:
			System.out.println("Opção inválida!");
		}
	
	for(ContaBancaria conta : contas) {
		System.out.println(conta.toString());
	}
	
	}
	
	}
}
