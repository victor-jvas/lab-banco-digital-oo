package main.models;

import main.models.contas.Conta;
import main.models.contas.ContaCorrente;
import main.models.contas.ContaPoupanca;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		contas = new ArrayList<Conta>();
	}

	public void showClientes(){

		for(Conta conta : contas){
			conta.imprimirExtrato();
		}
	}

	public void addConta(Conta conta){
		this.contas.add(conta);
	}

	public void showContasPoupanca(){
		Predicate<Conta> isPoupanca = conta -> conta.getClass().equals(ContaPoupanca.class);
		Stream<Conta> poupancas = contas.stream().filter(isPoupanca);

		poupancas.forEach(Conta::imprimirExtrato);
	}

	public void showContasCorrente(){
		Predicate<Conta> isCorrent = conta -> conta.getClass().equals(ContaCorrente.class);
		Stream<Conta> correntes = contas.stream().filter(isCorrent);

		correntes.forEach(Conta::imprimirExtrato);
	}

	public void fecharConta(int numero){
		boolean found = false;
		for(Conta conta : contas){
			if(conta.getNumero() == numero){
				contas.remove(conta);
				System.out.println("Conta do cliente: "+ conta.getCliente().getNome() + " e numero: " + numero + " encerrada.");
				found = true;
				break;
			}
		}
		if(!found){
			System.out.println("Conta inexistente");
		}
	}

}
