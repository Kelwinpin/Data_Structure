package Stack;
import java.util.Scanner;

public class Main {
	 public static void exibirMenu() {
		    System.out.println("======================================");
		    System.out.println("EdD - TAD Pilha\n");

		    System.out.println("1. Criar nova pilha");
		    System.out.println("2. Exibir pilha");
		    System.out.println("3. Empilhar novo item");
		    System.out.println("4. Desempilhar item");
		    System.out.println("5. Está cheia?");
		    System.out.println("6. Está vazia?");
		    System.out.println("7. Opter topo");
		    System.out.println("8. Pesquisar por uma chave");
		    System.out.println("9. Inverter a pilha");
		    System.out.println("10. Emergir");
		    System.out.println("11. Submergir");
		    System.out.println("12. Sair\n");

		    System.out.println("Escolha uma das opções acima (1-12):");
		  }
	
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        TadPilha pilha = null;
        int op = 0;
        
        
        
        while (op != 12) {
            exibirMenu();

            op = sc.nextInt();

            switch (op) {
                case 1:
                   System.out.println("Digite a capacidade desejada:");
                   int capacidade = sc.nextInt();
                   pilha = new TadPilha(capacidade);


                    break;
                case 2:
                	pilha.exibir();

                    break;
                case 3:
                	
                	System.out.println("Digite a chave desejada:");
                  int c= sc.nextInt();
                	pilha.empilhar(c);
                	pilha.exibir();

                    break;
                case 4:
                	pilha.desempilhar();
                	pilha.exibir();

                    break;
                case 5:
                	pilha.estahCheia();

                    break;
                case 6:
                	pilha.estahVazia();

                    break;
                case 7:
                	pilha.Peek();

                    break;
                case 8:
                	System.out.println("Digite a chave desejada:");
                    int x= sc.nextInt();
                	pilha.Pesquisar(x);

                    break;
                case 9:
                	pilha.Inverter();
                	pilha.exibir();
           		
                    break;
                case 10:
                	pilha.Emergir();
                	pilha.exibir();
                	break;
                case 11:
                	pilha.Subemergir();
                	break;
            }
    	    pilha.exibir();
        }

        sc.close();
    }

}
