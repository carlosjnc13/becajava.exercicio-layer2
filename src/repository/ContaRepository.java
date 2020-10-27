package repository;

import model.Conta;

import java.util.ArrayList;
import java.util.List;

import model.Conta;

public class ContaRepository {

	public ArrayList<Conta> Lista = new ArrayList<Conta>();

	public ArrayList<Conta> SetConta(Conta conta) {

		Conta newconta = new Conta();
		Lista.add(conta);
		return Lista;

	}

	public ArrayList<Conta> ObterLista() {

		Conta newConta = new Conta();
		newConta.Nome = "carlos jorge";
		newConta.CPF = "48317464";
		newConta.Conta = 12345;
		newConta.Agencia = 54321;
		newConta.Saldo = 5000;
		Lista.add(newConta);
		
		newConta = new Conta();
		newConta.Nome = "robinho";
		newConta.CPF = "48317464";
		newConta.Conta = 12345;
		newConta.Agencia = 54321;
		newConta.Saldo = 2500;
		Lista.add(newConta);

		
		return Lista;

	}
}
