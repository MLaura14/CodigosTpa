package Atividades;
import java.util.Scanner;
public class algoritmoIdade {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			
			String nome1, nome2;
			int idade1, idade2;
			
			
			System.out.print("Digite o nome da primeira pessoa: ");
			nome1 = sc.nextLine();
			
			System.out.print("Digite a idade da primeira pessoa: ");
			idade1 = sc.nextInt();
			
			sc.nextLine(); // limpar buffer
			
			System.out.print("Digite o nome da segunda pessoa: ");
			nome2 = sc.nextLine();
			
			System.out.print("Digite a idade da segunda pessoa: ");
			idade2 = sc.nextInt();
			
			if (idade1 > idade2) {
				System.out.println(nome1 + " é mais velho(a) com " + idade1 + " anos");
				System.out.println(nome2 + " é mais novo(a) com " + idade2 + " anos");
				
			} else if (idade2 > idade1) {
				System.out.println(nome2 + " é mais velho(a) com " + idade2 + " anos");
				System.out.println(nome1 + " é mais novo(a) com " + idade1 + " anos");
				
			} else {
				System.out.println("Os dois tem a mesma idade: " + idade1 + " anos");
				
			}
			
			sc.close();
			
			}
		
	 
	}
