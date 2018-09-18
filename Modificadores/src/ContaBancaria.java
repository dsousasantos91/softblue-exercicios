
public class ContaBancaria {

	private int numConta;
	private boolean ativa;
	private double saldo;
	
	public void sacar(double valor) {
		this.saldo -=  valor;
	}
	
	public void depositar(double valor) {
		
		if (valor < 0) {
			return;
		}
		
		double valor1;
		
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		if (numConta > 0) {
			this.numConta = numConta;
		}
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
