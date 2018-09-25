
@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {

	private double saldo;
	private double valor;

	public SaldoInsuficienteException(double saldo, double valor) {
		this.saldo = saldo;
		this.valor = valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getValor() {
		return valor;
	}

}
