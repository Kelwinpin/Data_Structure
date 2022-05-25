package Array;

public class Principal {

	public static void main(String[] args) {

		TadVetor tadVetor = new TadVetor(10);

		tadVetor.imprimir();	

		System.out.println("\n\n");

		for (int i = 0; i < 12; i++) {
			tadVetor.inserir(i+1);
			tadVetor.imprimir();
			System.out.println("\n\n");
		}
	}

}