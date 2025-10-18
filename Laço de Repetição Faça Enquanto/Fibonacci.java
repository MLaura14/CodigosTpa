package Atividades;
import java.util.Scanner;
public class FibonacciDoWhile {
	 public static void main(String[] args) {
	       Scanner entrada = new Scanner(System.in);

	       System.out.print("Digite a quantidade de termos: ");
	       int ter = entrada.nextInt();

	       int i = 1;

	       int T1 = 1, T2 = 1;

	       int Prox;
	       System.out.print(T1 + " " + T2 + " ");

	       while (i <= ter - 2) { 
	           Prox = T1 + T2;

	           System.out.print(Prox + " ");

	           T1 = T2;
	           T2 = Prox;

	           i++;
	       }
	       entrada.close();
	   }
	}
