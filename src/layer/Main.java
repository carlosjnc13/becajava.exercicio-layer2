package layer;
import model.Conta;
import model.Operacao;
import service.OperacaoService;
import service.ContaService;
import model.Conta;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		OperacaoService OperacaoService = new OperacaoService();
		ContaService service = new ContaService();
		Conta novaConta = new Conta();
		int indice;
		float valor;
		int opcao = 0;
		
		System.out.println("Oque deseja fazer? \n1-Adicionar Conta\n2- Saque\n3-Deposito\n4-Transferencia\n:");
		opcao = leitor.nextInt();
		if (opcao == 1) {
			
			System.out.println("Digite seu nome: ");		
			novaConta.Nome = leitor.next(); 
			
			System.out.println("Digite seu CPF: ");
			novaConta.CPF = leitor.next();
			
			System.out.println("Digite sua agencia: ");
			novaConta.Agencia = leitor.nextInt();
			
			System.out.println("Digite sua conta: ");
			novaConta.Conta = leitor.nextInt();
			
			
			System.out.println("Conta adicionada com sucesso.");
			System.out.println("-------------------------");
			System.out.println("Infos da Conta.:  \nNome: "+ novaConta.Nome + "\nCPF: "+novaConta.CPF+"\nAgencia: "+novaConta.Agencia+"\nConta: "+novaConta.Conta+"\nSaldo: "+novaConta.Saldo);
			
		}
		
		else if(opcao == 4) {
			Operacao operacao = new Operacao();
			System.out.println("Digite o Indice Da conta Conta Destino:");
			operacao.IndiceDestino = leitor.nextInt();
			
			System.out.println("Digite o Indice Da conta Conta Origem:");
			operacao.IndiceOrigem = leitor.nextInt();
			
			System.out.println("Digite o Valor A ser Transferido:");
			operacao.Valor = leitor.nextDouble();
			OperacaoService.Transferencia(operacao);
			System.out.println("Transferencia concluida, "+ operacao.Valor + "R$ na conta de destino ");
			
		}
		else if(opcao == 2) {
			Operacao operacao = new Operacao();
			
			System.out.println("digite indice da conta: ");
			operacao.Indice = leitor.nextInt();
			System.out.println("Valor de Saque: ");
			operacao.ValorSaque = leitor.nextInt();
			OperacaoService.Saque(operacao.Indice, operacao.ValorSaque);

			
		}
		else if(opcao == 3) {
			Operacao operacao = new Operacao();
			
			System.out.println("digite o indice da conta:");
			operacao.Indice = leitor.nextInt();
			System.out.println("Valor de Deposito: ");
			operacao.ValorDeposito = leitor.nextInt();
			OperacaoService.Deposito(operacao.Indice, operacao.ValorDeposito);
		}
		
	}

}
