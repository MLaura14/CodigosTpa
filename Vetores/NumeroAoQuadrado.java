package prjVetor;
import java.util.Scanner;
public class ElevadoNumero {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int [TAM];
		b = new int [TAM];
		
		//laço para leitura do vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+" valor do vetor A");
			a [i] = ler.nextInt();
			
     }
		System.out.print("B = [ ");
	
		//laço para leitura do vetor A
				for(i=0; i<TAM; i++) {
					
					b[i] = a [i]* a [i];
					
					System.out.print(b[i] + " ");
		     }
				
				System.out.print(" ]");
			
	
	}

}
