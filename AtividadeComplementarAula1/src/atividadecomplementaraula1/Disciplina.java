/*
 */
package atividadecomplementaraula1;

/**
 *
 * @author anapriscilla
 */
// Classe Disciplina
public class Disciplina {
    private String nome;
    
    // Construtor
    public Disciplina(String nome) {
        this.nome = nome;
    }

    // Método para mostrar os dados da disciplina
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
    }
}
