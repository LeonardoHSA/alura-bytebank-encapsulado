
public class TestaGetSet {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(154, 36547);
		// conta.numero = 1337; Desta forma não compila
		conta1.setNumero(1337);
		System.out.println(conta1.getNumero());
		
		Cliente paulo = new Cliente();
		conta1.setTitular(paulo);
		paulo.setNome("Paulo Silveira");
		
		System.out.println(conta1.getTitular().getNome());
		
		conta1.getTitular().setProfissao("Programador");
		
		System.out.println(conta1.getTitular().getProfissao());
		
		conta1.getTitular().setCpf("222.222.222-22");
		System.out.println(conta1.getTitular().getCpf());
	}
}
