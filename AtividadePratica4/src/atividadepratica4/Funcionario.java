/*
 */
package atividadepratica4;

/**
 *
 * @author anapriscilla
 */
class Funcionario {
    private String nome;
    private String sobrenome;

    public Funcionario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
    }

    public double calcularGanhoMensal() {
        return 0.0;
    }
}
