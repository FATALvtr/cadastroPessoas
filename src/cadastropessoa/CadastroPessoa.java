package cadastropessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa {

    ArrayList<Pessoa> lista = new ArrayList<>();

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
            for (Pessoa p : lista) {
                System.out.println("");
                p.imprimir();
            }
        }
    }

    public void menu() {

        Scanner s = new Scanner(System.in);
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
