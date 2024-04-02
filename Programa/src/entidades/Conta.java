package entidades;

public class Conta {
	
	private String titular;
	private Double saldo;
	
	public Conta(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		
	}

	public String getTitular() {
		return this.titular;
	}
	public Double getSaldo() {
	    return this.saldo;
	}
	
	public void depositar(Double quantidade) {
		this.saldo += quantidade;
	}
	
	public void sacar(Double quantidade) {
		this.saldo -= quantidade;
		
	}
}
