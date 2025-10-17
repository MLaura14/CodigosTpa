package atividadestpa;
import java.util.*;
public class idadeDezPessoas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade, i = 1;
		int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;
		
		while (i <= 10) {
			System.out.print("Digite a idade da pessoa " + i + ": ");
			idade = in.nextInt();
			
			if (idade<= 15)
				f1++;
			else if (idade <= 30)
				f2++;
			else if (idade <= 45)
				f3++;
			else if (idade <= 60)
				f4++;
			else 
				f5++;
			
			i++;
			
			}
		
		    System.out.println("Faixa 1: " + f1 + "pessoas - " + (f1*100/10) + "%");
		    System.out.println("Faixa 2: " + f2 + "pessoas - " + (f2*100/10) + "%");
		    System.out.println("Faixa 3: " + f3 + "pessoas - " + (f3*100/10) + "%");
		    System.out.println("Faixa 4: " + f4 + "pessoas - " + (f4*100/10) + "%");
		    System.out.println("Faixa 5: " + f5 + "pessoas - " + (f5*100/10) + "%");
		    

	}
	
}

