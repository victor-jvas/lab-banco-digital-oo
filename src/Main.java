import main.models.Banco;
import main.models.Cliente;
import main.models.contas.Conta;
import main.models.contas.ContaCorrente;
import main.models.contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Banco banco = new Banco("Cash Bank");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		banco.addConta(cc);

		banco.addConta(poupanca);

		banco.showClientes();

		banco.showContasPoupanca();
		banco.showContasCorrente();

		banco.fecharConta(1);

		banco.showClientes();
	}

}
