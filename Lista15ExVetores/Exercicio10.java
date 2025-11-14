package ExerciciosVetores;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

 

        int A[], B[], C[];
        int i, j, contC;

 

        A = new int[10];
        B = new int[10];
        C = new int[10];

 

        for(i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° valor do vetor A:");
            A[i] = entrada.nextInt();
        }

 

 

        for(i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "° valor do vetor B:");
            B[i] = entrada.nextInt();
        }

 

        contC = 0; // quantos elementos existem em C

 

        for(i = 0; i < 10; i++) {
            boolean existe = false;

 

            // verifica se A[i] existe no vetor B
            for(j = 0; j < 10; j++) {
                if (A[i] == B[j]) {
                    existe = true;
                    break;
                }
            }

 

            if(!existe) {
                C[contC] = A[i];
                contC++;
            }
        }

 

        System.out.println("\nVetor C (elementos de A que não estão em B):");
        if(contC == 0) {
            System.out.println("Nenhum elemento — todos estavam em B.");
        } else {
            for(i = 0; i < contC; i++) {
                System.out.print(C[i] + " ");
            }
        }

 

        entrada.close();
    }
}

