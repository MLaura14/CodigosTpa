package Atividades;
import java.util.Scanner;
public class MediaVetor {
	  public static void main (String[]args) {
	     Scanner ler = new Scanner (System.in);
	     
	     
	    int a[],i;
	    
	    double media;
	    double soma = 0;
	    a = new int [10];
	   
	     
	    
	    // Lendo vetor A 
	    
	      for (i=0; i<10; i++) {
	       System.out.println("Digite o "+(i+1)+" valor A:");
	       a[i] = ler.nextInt();
	       soma = soma + a[i];
	       
	      }
	      
	      media = soma/10;
	      System.out.println("O resultado da média é: " + media);
	      
	  }
	      
	  }
	      
