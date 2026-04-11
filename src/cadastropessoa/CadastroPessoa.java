package cadastropessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa {

    ArrayList<Pessoa> lista = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    
    public void cadastrarPessoas() {

        Scanner s = new Scanner(System.in);

        Pessoa nova = new Pessoa();
        String cpf;

        System.out.print("\nDigite o nome: ");
        nova.setNome(s.nextLine());

        do {
            System.out.print("\nDigite o CPF: ");
            cpf = s.next();

            if (cpf.length() != 11) {
                System.out.println("CPF inválido! Digite exatamente 11 dígitos.");
            }

        } while (cpf.length() != 11);

        nova.setCPF(cpf);

        do {
            System.out.print("\nDigite a idade: ");
            nova.setIdade(s.nextInt());
            s.nextLine(); //Pulo do gato

        } while (nova.getIdade() <= 0);

        lista.add(nova);

    }

    public void listarPessoas() {
        if (lista.isEmpty()) {
            System.out.println("\nLista vazia!");
        } else {
            System.out.println("\n"+lista.size()+" Pessoas Cadastradas: ");
            System.out.print("\n1- Litar todos");
            System.out.print("\n2- Buscar na lista");
            System.out.print("\nescolha uma opção: ");
            int opção = s.nextInt();
            if(opção == 1){
                for (Pessoa p : lista) {
                    System.out.println("");
                    p.imprimir();
                }
            }else if(opção == 2){
                System.out.println("\nDigite o nome que deseja consultar: ");
                s.nextLine();//pulao do gato
                String buscar = s.nextLine();
                
                boolean encontrado = false;
                
                for(Pessoa p : lista) {
                    if(p.nome.equalsIgnoreCase(buscar)){
                        System.out.println("Usuario encontrado!");
                        p.imprimir();
                        
                        encontrado = true;
                    break;
                    }
                }if(!encontrado){
                    System.out.println("Usuario não encontrado!");
                }
                
            }
        }
    }

    public void menu() {

        
        int op;

        do {
            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            op = s.nextInt();
            s.nextLine();

            if (op == 1) {
                cadastrarPessoas();
            } else if (op == 2) {
                listarPessoas();
            }

        } while (op != 0);
    }
}
