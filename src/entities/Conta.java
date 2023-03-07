package entities;

import Exception.MinhaExcecao;

public class Conta {
	private int num;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	
	public Conta(int num, String titular, Double limiteSaque, Double depositoInicial) {
		this.num = num;
		this.titular = titular;
		this.limiteSaque = limiteSaque;
		this.saldo = depositoInicial;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public int getNum() {
		return num;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void deposito(Double deposito) {
		saldo += deposito;
	}
	
	public void saque(Double saque) {
		if(saque > saldo) {
			throw new MinhaExcecao("Saldo insuficiente.");
		}
		if(saque > limiteSaque) {
			throw new MinhaExcecao("Erro de saque: Valor saque maior que o limite de saque");
		}
		saldo -= saque;
		System.out.println("Novo saldo: " + saldo);
	}
	
	@Override
	public String toString() {
		return "Saldo: " + saldo;
	}
}
