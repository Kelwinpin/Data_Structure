package List;
import java.util.Scanner;
public class PrincipalVetores {

    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
        var lista = new TadListaVetores(20);

        lista.exibir();

        int[] v = { 1, 2, 3, 5, 9, 13, 14};
        for (int i : v) {
            lista.inserirPrimeiro(i);
            lista.exibir();
        }

        // inverter
        lista.inverter();
        lista.exibir();

        // pilha
        // lista.empilhar(18);
        // lista.exibir();
        // int chave = lista.desempilhar();
        // System.out.println("Retirou a chave: " + chave);
        // lista.exibir();

        // fila
        lista.enfileirar(23);
        lista.exibir();
        int chave = lista.desenfileirar();
        System.out.println("Retirou a chave: " + chave);
        lista.exibir();
        
        System.out.println("Entre com uma chave para ser pesquisada:");
        int x = ler.nextInt();
        lista.pesquisarchave(x);
        
        System.out.println("");
        
        System.out.println("Entre com uma posição para ser removida:");
        x = ler.nextInt();
        lista.retirarPosEspecifica(x);
        lista.exibir();
        
        System.out.println("");
        
        System.out.println("Entre com um número para ser atualizado na posição desejada:");
        System.out.println("Posição:");
        int posi = ler.nextInt();
        System.out.println("Chave:");
        int chav = ler.nextInt();
        lista.atualizarPosEspecifica(posi, chav);
        lista.exibir();
        
        System.out.println("");
        
        System.out.println("Entre com um número para ser inserido na posição desejada:");
        System.out.println("Posição:");
        posi = ler.nextInt();
        System.out.println("Chave:");
        chav = ler.nextInt();
        lista.inserirPosEspecifica(posi, chav);
        lista.exibir();
        
        System.out.println("");      
        
        System.out.println("Entre com uma chave para ser retirada:");
        chav = ler.nextInt();
        lista.retirarchave(chav);
        lista.exibir();
        
        System.out.println("");      
        
        System.out.println("Entre com uma chave para ser inserido de forma ordenada:");
        chav = ler.nextInt();
        lista.inserirOrdenado(chav);
        lista.exibir();
        lista.exibirinvertido();
        
        
        // int chave = 0;
        // // validar se a chave foi removida
        // if ((chave = lista.retirarPrimeiro()) != VAZIO) {
        // System.out.println("Retirou a chave: " + chave);
        // }
        // lista.exibir();

        // while (!lista.estahVazia()) {
        // chave = lista.retirarPrimeiro();
        // System.out.println("Retirou a chave: " + chave);
        // lista.exibir();
        // }

        // // estado final da lista
        // lista.exibir();
    }
}
