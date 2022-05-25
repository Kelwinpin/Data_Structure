package Array;
import java.util.Arrays;


public class TadVetor {

	private static final int MAX = 100;
	
	private int [] v;  
	
	private int tamanho;
	
	private int capacidade; 


	public TadVetor(int capacidade) {
		this.v = new int[capacidade];
		this.tamanho = 0;
		this.capacidade = capacidade;
		
		System.out.println("Iniciando o vetor...\n\n");
		for(int i=0;i<v.length;i++) {
			v[i]=-1;
		}
	}
	
	public void imprimir() {
		System.out.println("TAD Vetor");
		System.out.println("Tamanho/Capacidade: " + 
		tamanho + "/" + capacidade);
		System.out.println(Arrays.toString(v));
	}
	
	public int inserir(int valor) {
		
		if (tamanho == capacidade) {

			System.out.println("O vetor já está cheio.\n\n");
			
			System.out.println("Ampliando o vetor . . .\n\n");
		
			crescer();
		}
		
		
		v[tamanho] = valor;
	
		tamanho++;
		
		return tamanho - 1;
	}
	
	private void crescer() {

		int [] temp = new int[capacidade * 2];
		
		for(int i=0;i<temp.length;i++) {
			temp[i]=-1;
		}
		for (int i = 0; i < v.length; i++) {
			temp[i] = v[i];
		}

		v = temp;
		capacidade = capacidade*2;
		
		System.out.println("Vetor ampliado para " + capacidade);
	}

	/*public void iniciar() {	
		System.out.println("Iniciando o vetor...");
	    for(int i=0;i<v.length;i++) {		
			v[i]=-1;	
		}	
	*/
	
	
	
	
	
	
}