package Double_Linked_List;


      public class ListaDuplaEncad  {
	   TadCelula primeiro;
	   TadCelula ultimo;
	   int tamanho;
	   int capacidade;
	   TadCelula[] vetor;
	
	  public ListaDuplaEncad() {
		  TadCelula head = new TadCelula();
			this.primeiro = head;
			this.ultimo = head;
			this.tamanho = 0;
			this.capacidade = 7;
		  }
	  
	  public boolean estahvazia() {
		//equals:compara se dois objetos são iguais.
		return this.primeiro.equals(this.ultimo);	  
}
	  
	  public boolean estahCheia() {
		    return this.tamanho == this.capacidade;
		  }
	  
	  public void exibir() {
		    TadCelula aux = this.primeiro.prox;
		    while (aux != null) {
		      System.out.print("[ " + aux.valor + "] <-> ");
		      aux = aux.prox;
		    }
		    System.out.println("NULL");
		  }
	  
	  public boolean inserir(int chave) {
	      if (this.estahCheia()) {
	        System.out.println("Lista Cheia!");
	        return false;
	      } else {
	    	TadCelula nova = new TadCelula();
	    	ultimo.prox = nova;
	        nova.ant = ultimo;
	        ultimo = nova;
	        nova.valor = chave;
	        tamanho++;  
	        return true;
	      }
	  
}  
	  
	  public boolean Pesquisar(int x) {			
			TadCelula aux = this.primeiro.prox;
			while(aux != null && aux.valor != x ) {
				aux = aux.prox;
			}
			if(aux == null) {
				System.out.println("Valor não encontrado.");
				return false;
			}
			else {
				System.out.println("Valor encontrado.");
				return true;
			}
	  }
	  
	  public void ExibirInsert() {
		  TadCelula aux = this.ultimo;
		  System.out.print("[ NULL ]");
		  while(aux != primeiro) {
			  System.out.print("<->[ "+aux.valor+" ]");
			  aux = aux.ant;
		  }
	  } 

	  public void Inverter() {
		 ListaDuplaEncad temp = new ListaDuplaEncad();
		 temp.primeiro =  this.primeiro;
		 temp.ultimo = this.ultimo;
		  TadCelula aux = temp.ultimo;
		    while (aux != temp.primeiro) {
		      System.out.print("[ " + aux.valor + "] <-> ");
		      aux = aux.ant;
		    }
		    System.out.println("NULL");
		  }
	  
	  public void Remover(int r) {
		TadCelula aux = new TadCelula();
	    TadCelula auxant = new TadCelula();
	    aux = this.primeiro.prox;
			  if(Pesquisar(r) == true) {
				 if(aux.valor == r) {
		     		 this.primeiro.prox = aux.prox;
					 this.tamanho--;
				  }	      
			  while(aux != null && aux.valor != r) {
				  auxant = aux;
				  aux = aux.prox;
			  }
			   auxant.ant = aux.ant;
			   auxant.prox = aux.prox;
			   aux = null;
			   tamanho--;
		  }
		      this.exibir();
	  }
	  
	  
	  public void Ordenar(int chave) {
		 TadCelula aux = primeiro.prox;
		 TadCelula ant = primeiro;
		 TadCelula nova = new TadCelula();
		 nova.valor = chave;
		while(aux != null && aux.valor < chave) {
			ant = aux;
			aux = aux.prox;
		}
		 ant.prox = nova;
		 nova.ant = ant;
		 nova.prox = aux;
		if(aux == null) {
		  ultimo = ultimo.prox;
		}else {
		  aux.ant = nova;
		}  
		tamanho++;
		this.exibir();
		
		}
		  
      
		  
		  
		  
		  
		  
	  }
		
        
		
      
       
      
      
      
      


      




	  

