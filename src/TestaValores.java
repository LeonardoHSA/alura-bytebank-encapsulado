public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226); // O trecho de código new Conta() está passando por um construtor
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16459);
		
		System.out.println(Conta.getTotal());
	}
}
