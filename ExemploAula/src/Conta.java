
public class Conta {
	private double saldo;
	public int conta;
	
	public void sacar(double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
		}else{
			
		}
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void verSaldo(){
		System.out.println(this.saldo);
	}
	
	
}
