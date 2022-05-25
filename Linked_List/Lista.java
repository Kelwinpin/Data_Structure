package Linked_List;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);	
	ListaEncadeada lista = new ListaEncadeada();
	int [] v = {11, 3, 4, 1, 12, 5, 7};//{1, 3, 5, 6, 7, 9, 21};  //new int[lista.capacidade];
	  System.out.println("Primeiro: "+lista.primeiro);
	  System.out.println("Ultimo: "+lista.ultimo);
	  
	
		if(lista.estahvazia()) {
			System.out.println("A lista está vazia.");
		}	
		    //System.out.println("Entre com um número para ser inserido no vetor:");
		for(int i = 0;i < v.length;i++) {	
			//v[i] = ler.nextInt();
			lista.inserir(v[i]);
			lista.exibir();
		}
		
		
		//pesquisa
		System.out.println("Entre com um número para ser pesquisado: ");
		int proc = ler.nextInt();
	    lista.Pesquisar(proc);
	    
		//remoção
	    System.out.println("Entre com um número para ser deletado: ");
	    int dell = ler.nextInt();
	    lista.Remover(dell);
	    
	    System.out.println("\n");
	    
	    //inserção ordenada
	    System.out.println("Verificando se a lista está em ordem...");
        lista.Comparador(v);
        if(lista.count != 0) {
         System.out.println("Ordenando lista...\n");
         lista.Ordenar(v);
        }   
        ler.close();
	}
}