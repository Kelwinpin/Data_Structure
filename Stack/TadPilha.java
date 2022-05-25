package Stack;



public class TadPilha {
	  public static final int VAZIO = -1;

	  TadCelula topo;
	  TadCelula fundo;
	  int tamanho;
	  int capacidade;

	  public TadPilha(int capacidade) {
	    TadCelula cabeca = new TadCelula();
	    this.topo = cabeca;
	    this.fundo = cabeca;
	    this.tamanho = 0;
	    this.capacidade = capacidade;
	  }

	  public void exibir() {
	    System.out.println("\n TAD Pilha: ");
	    System.out.println(String.format("Tamanho/Capacidade: %d/%d\n", tamanho, capacidade));

	    TadCelula aux = topo.prox;
	    System.out.print("TOPO -> ");
	    while (aux != null) {
	      System.out.print(aux);
	      aux = aux.prox;
	    }
	    System.out.println("FUNDO\n");
	  }
	  
	  public boolean estahCheia() {
	    return tamanho == capacidade;
	  }

	  public boolean estahVazia() {
	    return topo == fundo;
	  }

	  public boolean empilhar(int chave) { // PUSH
	    if (estahCheia()) {
	      System.out.println("Pilha está cheia!");
	      return false;
	    }

	    TadCelula nova = new TadCelula();
	    topo.valor = chave;
	    nova.prox = topo;
	    topo = nova; // nova celula cabeça
	    tamanho++;

	    return true;
	  }
	  
	  public void Peek() {
		  TadCelula aux = new TadCelula();
		  aux = this.topo.prox;
		  System.out.println("Exibindo elemento do topo:");		 
		  System.out.println(aux);	  
	  }
	  
	  public int desempilhar() { // POP
	    if (estahVazia()) {
	      System.out.println("Pilha está vazia!");
	      return VAZIO;
	    }

	    TadCelula aux = topo.prox; // topo da pilha
	    
	    if (aux.prox == null) {
	      fundo = topo; // pilha vazia;
	      topo.prox = null;
	    } else {
	      topo.prox = aux.prox;
	    }

	    tamanho--;
	    return aux.valor;
	  }
	  
	 
  
	  public boolean Pesquisar(int chave) {
			TadCelula aux = this.topo.prox;
			while(aux != null && aux.valor != chave ) {
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
	    
	  public void Inverter() {
		    TadPilha temp = new TadPilha(this.capacidade);
		    TadCelula aux = this.topo.prox;
		    while (aux != null) {
		      temp.empilhar(aux.valor);	
		      aux = aux.prox;
		    }
		    this.topo = temp.topo;
		    this.fundo = temp.fundo;		 
		  }
	  
	  public void Emergir() {
		    TadPilha temp = new TadPilha(this.capacidade);
			TadCelula aux = this.fundo;
			TadCelula p = this.topo.prox;
			int [] vet = new int[this.tamanho];
			
			vet[0] = aux.valor;
			for(int i = 1;i < this.tamanho;i++) {
				vet[i] = p.valor;
				p = p.prox;
			}
			
			for(int i = 1;i < this.tamanho;i++) {
				temp.empilhar(vet[this.tamanho - i]);
			}
			temp.empilhar(vet[0]);
			this.topo = temp.topo;
		    this.fundo = temp.fundo;
			temp.exibir();
			}
	  
 		
	  public void Subemergir() {	
		TadCelula aux = topo.prox;
		this.topo.prox = aux.prox;
		this.fundo.prox = aux;
		this.fundo = aux;
		this.fundo.prox = null;
		this.exibir();  
	  
}
}
