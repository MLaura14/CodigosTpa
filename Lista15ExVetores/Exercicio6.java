package vetores;

public class Ex6 {
	    public static void main(String[] args) {
	 
	        final int TAM = 11;
	        int a[] = new int[TAM];
	 
	        int base = 2;
	 
	        for (int i = 0; i < TAM; i++) {
	 
	            int pot = 1;
	            for (int j = 0; j < i; j++) {
	                pot = pot * base;
	            }
	 
	            a[i] = pot;
	        }
	 
	        System.out.println("Vetor A:");
	        for (int i = 0; i < TAM; i++) {
	            System.out.println("A[" + i + "] = " + a[i]);
	        }
	    }
	}
