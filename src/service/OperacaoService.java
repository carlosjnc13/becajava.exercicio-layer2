package service;
import model.Conta;

import model.Operacao;

import java.util.List;
import java.util.ArrayList;
import repository.ContaRepository;

public class OperacaoService {
	
	public void Transferencia(Operacao operacao) {
		ContaRepository repository =  new ContaRepository();
		
		List<Conta> lista = repository.ObterLista();
		Conta contaOrigem = lista.get(operacao.IndiceOrigem);
		Conta contaDestino = lista.get(operacao.IndiceDestino);
		contaOrigem.Saldo -= operacao.Valor;
		contaDestino.Saldo += operacao.Valor;
		
	}
	public void Saque(int index, int valor) {
		ContaRepository repository =  new ContaRepository();
		List<Conta> lista = repository.ObterLista();
		Conta conta = lista.get(index);
		conta.Saldo -= valor;
		System.out.println("Saldo da conta: " +conta.Saldo);
		
	}
	public void Deposito(int index, int valor) {
		ContaRepository repository =  new ContaRepository();
		List<Conta> lista = repository.ObterLista();
		Conta conta = lista.get(index);
		conta.Saldo += valor;
		System.out.println("Saldo da conta: "+conta.Saldo);
		
	}
	
	

}
