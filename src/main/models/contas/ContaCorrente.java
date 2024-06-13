package main.models.contas;

import main.models.Cliente;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato main.models.contas.Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
