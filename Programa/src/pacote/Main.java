package pacote;

import entidades.Conta;

public class Main {
	
	public static void main(String[] args) {
		Conta conta = new Conta("Guilherme", 1d);
		
		System.out.println("Titular da Conta: " + conta.getTitular());
	    System.out.println("Saldo da conta: " + conta.getSaldo());
	    
		conta.depositar(41d);
		System.out.println("Saldo da conta: " + conta.getSaldo());
		
		conta.sacar(1000d);
		
		 System.out.println("Saldo da conta: " + conta.getSaldo());
	}
	
	
}
