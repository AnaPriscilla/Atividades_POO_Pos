/*
 */
package atividadepratica4;

/**
 *
 * @author anapriscilla
 */
class Gerente extends Funcionario {
    private double salarioMensal;
    private double bonificacao;

    public Gerente(String nome, String sobrenome, double salarioMensal, 
            double bonificacao) {
        super(nome, sobrenome);
        this.salarioMensal = salarioMensal;
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularGanhoMensal() {
        return salarioMensal + bonificacao;
    }
}
