package vetores;
import java.util.Scanner;
public class Ex4 {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);

	        final int TAM = 10;
	        int[] a = new int[TAM];

	        System.out.println("--- Entrada de Dados ---");
	        System.out.println("Por favor, digite " + TAM + " números inteiros:");

	        for (int i = 0; i < TAM; i++) {
	            System.out.print("Digite o elemento A[" + i + "]: ");
	            a[i] = ler.nextInt();
	 }

	        ler.close(); 

	        System.out.println("Resultados:");

	        for (int i = 0; i < 10; i++) {
	            int elementoAtu = a[i];

	            System.out.println("\nElemento A[" + i + "] = " + elementoAtu + ".");
	            System.out.print("Relação de 0 até " + elementoAtu + ": ");

	            for (int contador = 0; contador <= elementoAtu; contador++) {
	                System.out.print(contador);
	                if (contador < elementoAtu) {
	                    System.out.print(", ");

	                }

	            }

	            System.out.println();

	        }

	        System.out.println("\n--- Fim do Processamento ---");

	    }

	}

