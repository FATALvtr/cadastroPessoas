
package cadastropessoa;
import java.util.Scanner;
import java.util.ArrayList;


public class CadastroPessoa {
    
    public void cadastrarPessoas(){
        Scanner s = new Scanner(System.in);
        Pessoa cadastrar = new Pessoa();
        
        int decisao = 0;
        
        do {
            System.out.print("\nDigite o nome: ");
            cadastrar.setNome(s.next());

            System.out.print("\nDigite o CPF: ");
            cadastrar.setCPF(s.next());
            
            System.out.print("\nDigite a idade: ");
            cadastrar.setIdade(s.nextInt());
            
            cadastrar.imprimir();
                    
            System.out.println("\nDigite 1 para fazer novo cadastro / Digite 0 para voltar ao menu!");
            decisao = s.nextInt();
                
        } while (decisao != 0);
        
        
    }
    public void listarPessoas(Pessoa pessoa1){
        
        ArrayList <Pessoa> lista = new ArrayList();
        
        lista.add(pessoa1);
        
    }
    public void menu(Pessoa pessoa1){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1 - cadastrar");
        System.out.print("\n2- listar pessoas");
        System.out.print("\n3- Sair\n");
        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
                cadastrarPessoas();
                break;
            case 2: 
                listarPessoas(pessoa1);
                break;
            case 3: 
                System.out.println("Obrigado por usar o serviço!");
                break;
            default:
                System.out.print("Escolha uma opção valida!");
        }
    }

    

}
