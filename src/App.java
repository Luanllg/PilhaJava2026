 import java.util.Scanner;

public class App {

     static Scanner leia = new Scanner(System.in);

    private static int menu() {
        System.out.println("\n--- Menu Pilha ---");
        System.out.println("1. Inserir elemento - Push");
        System.out.println("2. Remover elemento - Pop");
        System.out.println("3. Mostrar topo - Peek");
        System.out.println("4. Mostrar pilha");
        System.out.println("0. Sair");
        System.out.printf("Digite a opção desejada:" );
    	return leia.nextInt();
	}
    public static void removerElemento(Pilha<String> pilha){
        String removido = pilha.pop();
        if(removido!=null)
            System.out.println("Dado removido: "+removido);
        else
            System.out.println("A pilha está vazia");
    }
    public static void mostrartopo(Pilha<String> pilha){
        String topo = pilha.peek();
        if(topo!=null)
            System.out.println("Topo da pilha: "+topo);
        else
            System.out.println("A pilha está vazia");
    }

    public static void main(String[] args) throws Exception {
        Pilha<String> minhaPilha = new Pilha<>(5);
        int opcao = 0;
        String elemento;
        do { 
            opcao = menu();
            switch(opcao){
                case 1: System.out.println("Entre com uma string para inserir na pilha");
                        leia.nextLine();// limpar o buffer
                        elemento = leia.nextLine();
                        if( minhaPilha.push(elemento)) // ==true
                            System.out.println("Dado inserido!");
                        else
                            System.out.println("Pilha cheia - Stack Overflow");
                break;
                case 2: removerElemento(minhaPilha);
                break;
                case 3: mostrartopo(minhaPilha);
                break;
                case 4: System.out.println(minhaPilha.toString());
                break;
                case 0: System.out.println("Saindo...");
                break;
            }// fim switch
                
            
        } while (opcao!=0);
            
    

    }
}
