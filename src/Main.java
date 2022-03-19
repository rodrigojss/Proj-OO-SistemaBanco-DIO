
public class Main {
	public static void main(String[] args) {
		
		Cliente rodrigo = new Cliente();
		rodrigo.setNome("rodrigo");
		
		Conta cc = new ContaCorrente(rodrigo);
		Conta poupanca = new ContaPoupanca(rodrigo);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
