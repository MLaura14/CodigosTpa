package Atividades;
import java.util.Scanner;
public class InversãoDeValores {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		   
		   final int TAM = 10;
		   int a[],b[],i;
		   a = new int [TAM];
		   b = new int [TAM];
		   
		   // Lendo vetor A 
		   
		     for (i=0; i<TAM; i++) {
		      System.out.println("Digite o "+(i+1)+" valor A:");
		      a[i] = ler.nextInt();
		      b[i] = a[i];
		     }
		     
		     System.out.print("B = [");
		     for (i= 9;i<TAM && i > -1; i--) {
		      System.out.print(b[i]+" ");
		     }
		     System.out.print("]");
		 }
	

	}


