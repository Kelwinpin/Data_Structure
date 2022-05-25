package Linked_List_Frases;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    ListaEncadeada lista = new ListaEncadeada();
	    String frase = null;
	    if(lista.estahvazia()) {
				System.out.println("A lista está vazia.");
			}	
			    System.out.println("Entre com uma frase:");
	        frase = ler.nextLine();
			for(int i = 0;i < frase.length();i++) {	
	           char c = frase.charAt(i);
				lista.inserir(c);
				lista.exibir();
			}

			lista.ImprimirVogais(frase);
			lista.ContadordeVogal();
			System.out.println("A vogal que mais aparece é: ");
	           lista.VerificadordeVezes();
	           
	           
	           ler.close();		
	}    
}
