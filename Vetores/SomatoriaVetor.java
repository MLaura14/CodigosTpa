package prjVetor;
import java.util.Scanner;
public class SomatoriaVetor {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    final int TAM=10;
    int a[], b[], c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		 
		//laço para leitura do vetor A
		 
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
		
		}
	
		 
		//laço para leitura do vetor B
		 
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor B");
			 
			b[i] = in.nextInt();
			 
			//fazendo a soma
			 
			c[i] = a[i]+b[i];
			
		}
		 
		 
		//apresentando o vetor C
		 
		    System.out.print("\nC = ");	 
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		 
		}
		 
		 
		}
		 

	}
