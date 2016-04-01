
public class Main {
	public static void main(String args[]){
		System.out.println("Hello!");
		
		Conta c = new Conta();
		c.depositar(100);
		c.sacar(25);
		c.verSaldo();
	}
}
