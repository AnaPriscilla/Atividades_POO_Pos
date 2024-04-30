/*
 */
package atividadepratica4;

/**
 *
 * @author anapriscilla
 */
class Colaborador extends Pessoa {
    private double salario;

    public Colaborador(String nome, char sexo, String cpf, String endereco, double salario) {
        super(nome, sexo, cpf, endereco);
        this.salario = salario;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salário: " + salario);
    }
}

