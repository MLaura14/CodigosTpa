package Atividades;
import java.util.Scanner;
public class FatorialFacaEnquanto {
	public static void main(String[] args) {
		       int i = 1;
		       int n;
		       int multi = 1;
		       Scanner ler = new Scanner(System.in);
		       System.out.println("Apresente o numero:");
		       n = ler.nextInt();
		       do {
		           multi = multi * i;
		           i++;
		       } while (i <= n);
		       ler.close();
		       System.out.println("A fatoração é:" + multi);
		   }
	

	}
