package atividadestpa;
import java.util.*;
public class JoaoPedro {
	public static void main(String[] args) {
		double joao = 1.34, pedro = 1.45;
   	 int anos = 0;
   	 
   	 while (joao <= pedro) {
   		 joao += 0.025;
   		 pedro += 0.02;
   		 anos++;
   	 }
		
        System.out.println("João ficará mais alto que Pedro em  " + anos + " anos");
        
	}
	
}
