package Pacote;
import java.util.Scanner;
public class Principal {

	public static void main (String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		Cliente cliente_01 = new Cliente();
		
		cliente_01.cpf = "02850435902";
		cliente_01.nascimento = 1980;
		cliente_01.nome = "Marcos da Rocha Souza";
		cliente_01.email = "mr_souza@gmail.com";

		Conta conta_01 = new Conta();
		
		conta_01.numero = 1521;
		conta_01.saldo = 750.53;
		
		
		Cliente cliente_02 = new Cliente();
		
		cliente_02.cpf = "03510400902";
		cliente_02.nascimento = 1985;
		cliente_02.nome = "Ana Clara Marques";
		cliente_02.email = "aninha@gmail.com";

		Cliente cliente_03 = new Cliente();
		
		cliente_03.cpf = "04564238906";
		cliente_03.nascimento = 1975;
		cliente_03.nome = "Pedro de Alcantara";
		cliente_03.email = "pedro_75@gmail.com";
		
		Cliente cliente_04 = new Cliente();
		
		cliente_04.cpf = "03289078908";
		cliente_04.nascimento = 1977;
		cliente_04.nome = "Pedro Andre Marcondess";
		cliente_04.email = "pedro@gmail.com";
		
		System.out.println(cliente_01.toString()); 
		System.out.println(cliente_02.toString());
		System.out.println(cliente_03.toString());
		System.out.println(cliente_04.toString());

		System.out.println(conta_01.toString());
		
		conta_01.debitaSaldo(100.00);
		
		System.out.println(conta_01.toString());
		
		conta_01.creditaSaldo(1000.00);
		
		System.out.println(conta_01.toString());
		
		Cliente cliente_05 = new Cliente();
		
		System.out.println("Digite o nome do cliente : ");
		cliente_05.nome = read.nextLine();
		System.out.println("Digite o Cpf do cliente : ");
		cliente_05.cpf = read.nextLine();
		System.out.println("Digite o email do cliente : ");
		cliente_05.email = read.nextLine();
		System.out.println("Digite a data de nascimeto do cliente : ");
		cliente_05.nascimento = read.nextInt();
		
		System.out.println(cliente_05.toString()); 
		
		
		
		
		
		read.close();
	}
	
}
