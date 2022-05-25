package Double_Linked_List;

import java.util.Scanner;

public class ListaDupla {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);	
		ListaDuplaEncad lista = new ListaDuplaEncad();
	     int[] idade = {11, 3, 4, 1, 12, 5, 7};
	     int[] vet2 ={1, 2, 3, 4, 5, 6, 7};//new int[lista.capacidade];
	     String[] nome = {"Amanda" ,"Bernado" ,"Carol" ,"Davi" ,"Ellen" ,"Fábio" ,"Gabriel"};
		  System.out.println("Primeiro: "+lista.primeiro);
		  System.out.println("Ultimo: "+lista.ultimo);
		  
		
			if(lista.estahvazia()) {
				System.out.println("A lista está vazia.");
			}	
			    //System.out.println("Entre com um número para ser inserido no vetor:");
			for(int i = 0;i < vet2.length;i++) {	
				//v[i] = ler.nextInt();
				lista.inserir(vet2[i]);
				lista.exibir();
			}
				
			//pesquisa
			System.out.println("Entre com um número para ser pesquisado: ");		
			int proc = ler.nextInt();
		    lista.Pesquisar(proc);  
		    
		    //exibir invertido
		    System.out.println("Exibindo em ordem invertida: ");
		    lista.ExibirInsert();
		    System.out.println("");
		    
		    //inserir de forma invertida
		    System.out.println("Inserindo de forma invertida:");
		      lista.Inverter();
		    System.out.println("");
		    
		    //remoção
		    System.out.println("Entre com um número para ser deletado: ");
		    int dell = ler.nextInt();
		    lista.Remover(dell);
		    System.out.println("");
		    
		    //Inserção ordenada
			System.out.println("Verificando se o vetor está em ordem...");
			for(int i = 0;i < lista.capacidade;i++) {
			   lista.Ordenar(idade[i]);
			}
			System.out.println("");
			
			//Inserir vários
			System.out.println("Inserindo vários:");
			TadCelula[] vet = new TadCelula[7];
		    TadCelula nova = new TadCelula();
		    for(int i = 0;i < lista.capacidade;i++) {
				nova.info = nome[i];
				nova.valor = idade[i];
				vet[i] = nova;
				   System.out.print("[ " +vet[i].info+" / "+vet[i].valor+" ] <-> ");  
			    }
			    System.out.println("NULL");			   
		       }	
			

			
		
			
	}

	


