package Atividades;
import java.util.Scanner;
public class PotenciaFacaEnquanto {
	   public static void main(String[] args) {

	       Scanner entrada = new Scanner(System.in);

	       int base, expo, i = 1, pot = 1;

	       System.out.print("Digite a base: ");

	       base = entrada.nextInt();

	       System.out.print("Digite o expoente: ");

	       expo = entrada.nextInt();

	       // Laço faça-enquanto

	       do {

	           pot = pot * base;   // calcula a potência

	           i = i + 1;          // incrementa o contador

	       } while (i <= expo);

	       System.out.println("O resultado de " + base + "^" + expo + " = " + pot);

	       entrada.close();

	   }

	}
	 
