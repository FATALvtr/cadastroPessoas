package cadastropessoa;

public class Pessoa {

    String nome;
    int idade;
    String cpf;

    
    public void imprimir (){
        System.out.println("------------------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCPF(cpf));
        System.out.println("------------------------------------");
    }

    public Pessoa(String nome, int idade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = CPF;
    }

    // construtor vazio pro Scanner
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade <100) {
            this.idade = idade;
        } else {
            System.out.println("\nDigite uma idade maior que 0 e menor que 100!");
        }

    }

    // formatação do CPF (000.000.000-00)
    public String getCPF(String a) {

        // se o cpf for null ou tiver 11 caracteres, ele formata.
        if (a == null || a.length() != 11) {
            return cpf;
        }

        // se tiver ele formata.
        return a.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})",
                "$1.$2.$3-$4");
    }

    public void setCPF(String CPF) {
        this.cpf = CPF;
    }

}
