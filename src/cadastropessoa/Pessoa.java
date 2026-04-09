package cadastropessoa;

public class Pessoa {

    String nome;
    int idade;
    String cpf;

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
        this.idade = idade;
    }

    public String getCPF(String a) {

        if (a == null || a.length() != 11) {
            return cpf;
        }

        return a.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})",
                "$1.$2.$3-$4");

    }

    public void setCPF(String CPF) {
        this.cpf = CPF;
    }

}
