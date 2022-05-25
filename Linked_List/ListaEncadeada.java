package Linked_List;


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
		      System.out.print("[ " + aux.valor + "] -> ");
		      aux = aux.prox;
		    }
		    System.out.println("NULL");
		  }
	  public boolean inserir(int valor) {
	      if (this.estahCheia()) {
	        System.out.println("Lista Cheia!");
	        return false;
	      } else {
	        TadCelula nova = new TadCelula();
	        nova.valor = valor; // pode ser inserido via scanner
	        this.ultimo.prox = nova; 
	        this.ultimo = nova;
	        this.tamanho++;

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
	  public void Remover(int r) {
		  TadCelula aux = this.primeiro.prox;
		  TadCelula ant = this.primeiro.prox;
		  if(this.Pesquisar(r) == true) {
			  if(aux.valor == r) {
					 this.primeiro.prox = aux.prox;
					 this.tamanho--;
			  }
			  while(aux.prox != null && aux.valor != r ) {
				    ant = aux; 
					aux = aux.prox;
			   }	  
			  ant.prox = aux.prox;
			  aux = null;		
	          this.tamanho--; 
		  }
          this.exibir();	 		 
		 }
	  public void Ordenar(int vet[]) {			
		  int temp = 0;
		for(int i = 1;i < vet.length;i++) {
			for(int j = 0;j < vet.length;j++) {
				if(vet[j] > vet[i]) {
				temp = vet[j];
				vet[j] = vet[i];
				vet[i] = temp;
		}	
			}	  
		}
	 
		for(int i1 = 0;i1 < vet.length;i1++) {
			System.out.print("[" + vet[i1] + "] ->");
			}
		    System.out.print("NULL");
	  }
	  
	  public int count = 0;
	  
	  public void Comparador(int vet[]) {	    
	    for(int i = 1;i < vet.length;i++) {
			if(vet[i-1] > vet[i]) {
				System.out.println("O vetor está fora de ordem.");
				count++;
				break;
				}			
			}
			if(count == 0)
				System.out.println("O vetor está ordenado.");
	  }


}