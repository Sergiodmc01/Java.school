package Pacote;

public class Conta {

	public int numero;
	public Double saldo;
	
	
	public String toString() {
		return ("numero : " + numero + "\nSaldo : " + saldo);
		
	}
	
	public Double debitaSaldo(Double debito) {
		return saldo = saldo - debito;
	}
	
	public Double creditaSaldo(Double credito) {
		return saldo = saldo + credito;
	}
	
}
