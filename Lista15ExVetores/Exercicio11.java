package ExerciciosVetores;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
	    Scanner in = new Scanner(System.in);
	    final int TAM=10;
	    int a[], i;
	    a = new int[TAM];
	    
	    //LAÇO PARA LER VETOR A
	    for(i=0; i<TAM; i++) {
	    	System.out.println("Digitem o " +(i+1)+" valor do vetor A");
	    	a[i] = in.nextInt();
	    	
	    }
	    
	    //APRESENTANDO A
	    System.out.print("\nA = ");
	    for(i=0; i<TAM; i++) {
	    	System.out.print(a[i]+ " ");
	    }
	    
        // LER X
        System.out.println("\n\nDigite o valor X que deseja buscar:");
        int x = in.nextInt();

        // A TAL DA ROTINA
        int cont = 0;

        for(i = 0; i < TAM; i++) {
            if(a[i] == x) {
                cont = cont + 1;
            }
        }

        if(cont > 0) {
            System.out.println("O valor " + x + " ESTÁ no vetor.");
        } else {
            System.out.println("O valor " + x + " NÃO está no vetor.");
        }

    }

	 
	    
	}
