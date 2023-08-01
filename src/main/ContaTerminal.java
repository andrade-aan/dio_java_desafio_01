package main;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Integer numeroConta = 0;
		String numeroAgencia, nomeCliente;
		Double deposito = 0.0, saldo = 0.0;
		
		System.out.println("Digite seu nome completo!");
		nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite o numero da Agência!");
		numeroAgencia = sc.nextLine();
		
		System.out.println("Digite o número da Conta Corrente!");
		
		try {
			
			String strConta = sc.nextLine();
			numeroConta = Integer.valueOf(strConta);
		
		}catch(Exception e){
			System.out.println("Erro "+ e.getMessage());
		}
		
		System.out.println("Digite o valor do depósito inicial!");
		
		try {
			
			String strDeposito = sc.nextLine();
			String tratamentoStr = strDeposito.replace(",", ".");
			deposito = Double.valueOf(tratamentoStr);
			saldo = saldo + deposito;
			
		}catch(Exception e){
			System.out.println("Erro "+ e.getMessage());
		}
		
		System.out.printf("Olá " + nomeCliente + ", obrigado por"
				+ " criar uma conta em nosso banco,\nsua agência é "
				+ numeroAgencia +", conta "+ numeroConta);
		System.out.printf(", seu saldo de R$%.2f ", saldo);
		System.out.print("já está disponível para saque!");
		
		sc.close();
	}

}
