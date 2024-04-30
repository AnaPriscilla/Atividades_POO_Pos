/*
 */
package atividadepratica3;

/**
 *
 * @author anapriscilla
 */
public class Morador {
   private String nome;
    private String cpf;
    private String telefone;

    public Morador(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Telefone: " + telefone;
    }
}
