package banco;

import java.util.Locale;

//import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Conta nubank;
		nubank = new Conta();
		
		//Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		nubank.numConta = 170535;
		nubank.nome = "Gabrielle Sim�es";
		nubank.saldo = 3231.00;
		nubank.limite = 200;
		
		System.out.println(nubank.nome + ", seu limite � de: " + nubank.limite + " e o saldo � de: " + nubank.saldo + ".");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("Digite o n�mero da conta: ");
		nubank.setNumConta(sc.nextInt());
		
		System.out.println("Digite o seu nome: ");
		nubank.setNome(sc.nextLine());
		
		System.out.println("Digite o limite: ");
		nubank.setLimite(sc.nextDouble());
		
		System.out.println("Digite o seu saldo: ");
		nubank.setSaldo(sc.nextDouble());
		
		System.out.println(nubank.getNome() + ", seu limite � de: " + nubank.getLimite() + " e o seu saldo � de: " + nubank.getSaldo());*/
		
	}
	
}
		
		
		
		
		
		
		/*nubank.setNome("Conta NuBank");
		
		System.out.println(nubank.getNome());
		//nessa linha � solicitado para que o m�todo getNome retorne o nome e imprima*/

	}

}
