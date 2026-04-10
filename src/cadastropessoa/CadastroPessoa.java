
package cadastropessoa;
import java.util.Scanner;
import java.util.ArrayList;


public class CadastroPessoa {
    ArrayList <Pessoa> lista = new ArrayList();
    
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        //Faça-enquanto.
        do {            
            System.out.print("\n1 - Cadastrar \n2 - Listar Pessoas\n0 - Sair");
            System.out.print("\nEscolha: ");
            escolha = scanner.nextInt();
//OPÇÕES - switch case com -> / pra ficar mais simples
            switch (escolha) {
                case 1-> cadastrarPessoas();
                case 2-> listarPessoas(); 
                case 0-> System.out.println("Obrigado por usar o serviço!"); 
                default-> System.out.print("Opção: "+escolha+" não é valida!");
            }
        }while (escolha != 0);
    }
    public void cadastrarPessoas(){
        
        Scanner s = new Scanner(System.in);
        
        Pessoa nova = new Pessoa();
        
        System.out.print("\nDigite o nome: ");
        nova.setNome(s.nextLine());

        System.out.print("\nDigite o CPF: ");
        nova.setCPF(s.next());

        System.out.print("\nDigite a idade: ");
        nova.setIdade(s.nextInt());
        s.nextLine(); //serve para tirar o (limpeza de buffer/pulo do gato)
                
        lista.add(nova);//função adiciona novo objeto a lista
        
        System.out.println("\n"+nova.getNome()+" Cadastrado com sucesso!");
        
        //nova.imprimir();
    }
    public void listarPessoas(){
        if(lista.isEmpty()){//função indentifica vazio
            System.out.println("\nLista vazia!");
        }else{
            for (Pessoa p : lista){
                System.out.println("");
                p.imprimir();
            }
        }
    }

}


