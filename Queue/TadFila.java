package Queue;

public class TadFila {
	public static final int VAZIO = -1;

    TadCelula frente;
    TadCelula tras;
    int tamanho;
    int capacidade;

    // construtor
    public TadFila(int capacidade) {
        TadCelula cabeca = new TadCelula();
        this.frente = cabeca;
        this.tras = cabeca;
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public void exibir() {
        System.out.println("\n\nTAD Fila: ");
        System.out.println(String.format("Tamanho/Capacidade: %d/%d\n", tamanho, capacidade));
        TadCelula aux = frente.prox;
        System.out.print("FRENTE: ");
        while(aux != null) {
            System.out.print(aux);
            aux = aux.prox;
        }

        System.out.println(" TR�S\n");
    }

    public boolean estahVazia() {
        return frente == tras;
    }

    public boolean estahCheia() {
        return tamanho == capacidade;
    }

    public boolean enfileirar(int chave) {
        // 1. verficar se est� cheia.
        if (estahCheia()) {
            System.out.println("A Fila est� CHEIA!");
            return false;
        }

        // 2. criar a nova TadCelula
        var nova = new TadCelula(chave);
        // 3. atribuir a chave na nova celula
        
        // 4. colocar a nova celula atr�s da Fila
        this.tras.prox = nova;
        // 5. atualizar a tras da fila
        this.tras = nova;
        // 6. atualizar o tamanho da fila
        this.tamanho++;

        return true;
    }

    public int desenfileirar() {
        // 1. verificar se n�o est� vazia
        if (estahVazia()) {
            System.out.println("A Fila est� VAZIA!");
            return VAZIO;
        }

        // 2. atribuir a c�lula a ser removida
        var aux = this.frente.prox;
        // 3. atualizar a frente
        this.frente = frente.prox;
        // 4. atualizar o tamanho
        this.tamanho--;

        return aux.valor;
    }

    public boolean pesquisar(int chave) {
    	TadCelula aux = this.frente.prox;
    	while (aux != null && aux.valor != chave){
    		aux = aux.prox;
    	}
    	if (aux == null){
    		System.out.println("Valor n�o encontrado!!!");
    		return false;	
    		}  			
    	else {
    	  System.out.println("Valor encontrado!!!");
    	  return true;
    	}
    				
    }

    public int obterFrente() {
        // 1. verificar se n�o est� VAZIA
        if (estahVazia()) {
            System.out.println("A Fila est� VAZIA!");
            return VAZIO;
        }
        // 2. retornar o valor na frente da fila
        return this.frente.prox.valor;
    }

    public int obterTras() {
        // 1. verificar se n�o est� VAZIA
        if (estahVazia()) {
            System.out.println("A Fila est� VAZIA!");
            return VAZIO;
        }
        // 2. retornar o valor na frente da fila
        return this.tras.valor;
    }

    public boolean inserirFuraFila(int chave) {
        return false;
    }

    public void inverter() {

    }
}
