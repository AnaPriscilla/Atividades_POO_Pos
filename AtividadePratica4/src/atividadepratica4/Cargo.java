/*
 */
package atividadepratica4;

/**
 *
 * @author anapriscilla
 */
class Cargo extends Colaborador {
    private String descricao;

    public Cargo(String nome, char sexo, String cpf, String endereco, double salario, String descricao) {
        super(nome, sexo, cpf, endereco, salario);
        this.descricao = descricao;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cargo: " + descricao);
    }
}