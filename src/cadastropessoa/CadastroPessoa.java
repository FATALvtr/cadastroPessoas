
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
                    
            System.out.println("\nDigite 1 para sair / d1igite 0 para fazer novo cadastro!");
            decisao = s.nextInt();
                
        } while (decisao != 1);
    }
    public void listarPessoas(){
        ArrayList <Pessoa> lista = new ArrayList();
        
        System.out.print("Digite o nome que deseja consultar: ");
        
        
        
    }
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1 - cadastrar");
        System.out.println("2- listar pessoas");
        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
                cadastrarPessoas();
                break;
            case 2: 
                listarPessoas();
                break;
            default:
                System.out.print("Escolha uma opção valida!");
        }
    }

    

}
