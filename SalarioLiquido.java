package atividadestpa;
import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			 //declara��o de vari�veis
			 double valorHora, numeroAulas, inss, salarioBruto, desconto, salarioLiquido;
			 
		    
			 System.out.println("Digite o valor por horas de cada aula: ");
			 valorHora = ler.nextDouble();
			 
			 System.out.println("Digite o n�mero de aulas dadas no m�s: ");
			 numeroAulas = ler.nextDouble();
			 
			 System.out.println("Digite o percentual de desconto do inss: ");
			 inss = ler.nextDouble();
			 
			 
             salarioBruto = valorHora*numeroAulas;
	
             desconto = salarioBruto* (inss/100);
			
			 salarioLiquido = salarioBruto - desconto;
			 
		
			 System.out.println("O seu sal�rio bruto � de: "+ salarioBruto);
			 System.out.println("O seu sal�rio l�quido � de: "+ salarioLiquido);
			  
	

	}

}
