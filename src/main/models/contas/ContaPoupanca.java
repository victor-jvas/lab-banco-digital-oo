package main.models.contas;

import main.models.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato main.models.contas.Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
