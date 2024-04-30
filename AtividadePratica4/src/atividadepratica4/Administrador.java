/*
 */
package atividadepratica4;

/**
 *
 * @author anapriscilla
 */
class Administrador extends Funcionario {
    private double salarioMensal;

    public Administrador(String nome, String sobrenome, double salarioMensal) {
        super(nome, sobrenome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularGanhoMensal() {
        return salarioMensal;
    }
}