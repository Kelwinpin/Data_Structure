package Queue;

public class MainFila {

	public static void main(String[] args) {
		var fila = new TadFila(6);

        fila.exibir();

        int []v = new int[]{6, 8, 2, 5, 9, 4, 1, 11};
        for (int i : v) {
            System.out.println("Enfileirando " + i);

            fila.enfileirar(i);
            fila.exibir();
        }
           fila.pesquisar(6);
           
        System.out.println("\nDesempilhando itens");
        int i = 8;
        while (i > 0) {
            int valor = fila.desenfileirar();
            if (valor == -1) {
                System.out.println("N�o foi poss�vel desenfileirar.\n");
            } else {
                System.out.println("Desenfileirou: " + valor + "\n");
            }
            fila.exibir();
            i--;
        }
        fila.exibir();
        
        
    }


	}


