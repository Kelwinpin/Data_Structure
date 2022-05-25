package Linked_List_Frases;

public class ListaEncadeada {
	TadCelula primeiro;
	TadCelula ultimo;
	int tamanho;
	int capacidade;
	
	  public ListaEncadeada() {
		 TadCelula head = new TadCelula();
			this.primeiro = head;
			this.ultimo = head;
			this.tamanho = 0;
			this.capacidade = 50;
		  }
	  public boolean estahvazia() {
		return this.primeiro.equals(this.ultimo);	  
}
	  public boolean estahCheia() {
		    return this.tamanho == this.capacidade;
		  }
	  public void exibir() {
		    TadCelula aux = this.primeiro.prox;
		    while (aux != null) {
		      System.out.print("[ " + aux.chave + "] -> ");
		      aux = aux.prox;
		    }
		    System.out.println("NULL");
		  }
	  public boolean inserir(char letra) {
	      if (this.estahCheia()) {
	        System.out.println("Lista Cheia!");
	        return false;
	      } else {
	        TadCelula nova = new TadCelula();
	        nova.chave = letra; 
	        this.ultimo.prox = nova; 
	        this.ultimo = nova;
	        this.tamanho++;

	        return true;
	      }
      }


     public void ImprimirVogais(String letra){
       String vogais = "aeiouAEIOU";
       System.out.println("Vogais:");
     for (int i = 0; i < letra.length(); i++) {
    	char c = letra.charAt(i);
    	
      if (vogais.indexOf(c) != -1) {
        System.out.print(c);
      }
      else
       System.out.print(" ");
    }
     System.out.println("");
    }
   public void ContadordeVogal(){
	    TadCelula aux = this.primeiro.prox;
	    String vogais = "aeiouAEIOU";
	    int contVog = 0;
	    while (aux != null) {
	    	if(vogais.indexOf(aux.chave) != -1) {
	    		contVog++;
	    	}
	      aux = aux.prox;
	    }
	    System.out.println("O número de vogais na frase é de "+contVog+".");
   }
   
   public void VerificadordeVezes() {
	   TadCelula aux = this.primeiro.prox;
	    String A = "Aa";
	    String E = "Ee";
	    String I = "Ii";
	    String O = "Oo";
	    String U = "Uu";
	    int contA = 0;
	    int contE = 0;
	    int contI = 0;
	    int contO = 0;
	    int contU = 0;
	    while (aux != null) {
	    	if(A.indexOf(aux.chave) != -1) {
	    		contA++;
	    	}if(E.indexOf(aux.chave) != -1) {
	    		contE++;
	    	}if(I.indexOf(aux.chave) != -1) {
	    		contI++;
	    	}if(O.indexOf(aux.chave) != -1) {
	    		contO++;
	    	}if(U.indexOf(aux.chave) != -1) {
	    		contU++;
	    	}
	      aux = aux.prox;
	     }
	    if(contA >= contE && contA >= contI && contA >= contO && contA >= contU) {
	    	System.out.println(" A ");
	    }if(contE >= contA && contE >= contI && contE >= contO && contE >= contU) {
	    	System.out.println(" E ");
	    }if(contI >= contE && contI >= contA && contI >= contO && contI >= contU) {
	    	System.out.println(" I ");
	    }if(contO >= contE && contO >= contI && contO >= contA && contO >= contU) {
	    	System.out.println(" O ");
	    }if(contU >= contE && contU >= contI && contU >= contA && contU >= contO)  {
	    	System.out.println(" U ");
	    }
	  
   }
   
   
   
   
   
   
   
   
   
   
   
}
   




