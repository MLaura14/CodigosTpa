package atividadestpa;
import java.util.Scanner;
public class idadeUsuario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
	    int anoAtual;
		 
		int anoNascimento;
		 
		int idade;
		 
        int i;
		 
		
        do {
		  
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = in.nextInt();
		 
		System.out.println("Digite o ano atual: ");
		anoAtual = in.nextInt();
		 
		
		idade = anoAtual - anoNascimento;
		 
		
		System.out.println("A idade é: "+ idade);
		 
        System.out.println("Deseja continuar? 1 Continuar / 0 - sair");
		 
		i = in.nextInt();
		 
	 } while (i == 1);
		 
		 
	}
}
