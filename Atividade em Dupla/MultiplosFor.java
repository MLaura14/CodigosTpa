package atividadestpa;
import java.util.*;
public class multiplosFor {
	public static void main(String[] args) {
	   int i;
	   int soma = 0;
			 
	   for (i=1;i<=400;i++) {
			 if (i %5==0) {
			    soma = soma + i;
			 
		   }
			
       }
			 
       System.out.println("A soma dos múltiplos de 5 do intervalo de 1 até 400 é de: " + soma);
			 
	   }

}
