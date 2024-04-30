/*
 */
package atividadepratica4;

/**
 *
 * @author anapriscilla
 */
class Comissionado extends Funcionario {
    private double salarioMensal;
    private double totalVendas;
    private double percentualComissao;

    public Comissionado(String nome, String sobrenome, double salarioMensal, double totalVendas, 
            double percentualComissao) {
        super(nome, sobrenome);
        this.salarioMensal = salarioMensal;
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularGanhoMensal() {
        return salarioMensal + (totalVendas * percentualComissao / 100);
    }
}