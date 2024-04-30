/*
 */
package atividadepratica4;

/**
 *
 * @author anapriscilla
 */
// Classe Pessoa
class Pessoa {
    private String nome;
    private char sexo;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, char sexo, String cpf, String endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }
}

