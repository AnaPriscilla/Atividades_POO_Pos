/*
 */
package atividadepratica4;

/**
 *
 * @author anapriscilla
 */
class Horista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String sobrenome, int horasTrabalhadas, 
            double valorHora) {
        super(nome, sobrenome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularGanhoMensal() {
        return horasTrabalhadas * valorHora;
    }
}
