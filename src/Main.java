
public class Main {

	public static void main(String[] args) {
		Cliente jullian = new Cliente();
		jullian.setNome("Jullian");
		
		Conta cc = new ContaCorrente(jullian);
		Conta poupanca = new ContaPoupanca(jullian);
		
		cc.depositar(500);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
