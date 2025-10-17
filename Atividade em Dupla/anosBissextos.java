package atividadestpa;
import java.util.Scanner;
public class anos {
	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			 
			int anoInicial;
			 
			int anoFinal;
			 
			int anos = 0;
			 
			int anosBissextos = 0;
			 
			
			 
			System.out.println("Digite o ano inicial: ");
			anoInicial = ler.nextInt();
			 
			System.out.println("Digite o ano final: ");
			anoFinal = ler.nextInt();
			 
			
			while (anoInicial<anoFinal) {
			 
			    if (anoInicial % 4 == 0) {
			 
	               anosBissextos = anoInicial;
			    
			    System.out.println("Os anos bissextos são: " + anosBissextos);
			 
		   }
			 
		       anos = anos + 1;
			   anoInicial = anoInicial + 1;
			 
			}
			 
			System.out.println("O total de anos dentro do intervalo é de: " + anos);
			 
			
			 
			}
			 

	}

