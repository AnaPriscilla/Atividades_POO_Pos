/*
 */
package atividadecomplementaraula1;

import java.util.ArrayList;

/**
 *
 * @author anapriscilla
 */
public class ListaDasDisciplinas {
     private ArrayList<Disciplina> disciplinas;
    
    // Construtor
    public ListaDasDisciplinas() {
        disciplinas = new ArrayList<>();
    }
    
    // Método para adicionar disciplina à lista
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
    
    // Método para mostrar os dados de todas as disciplinas na lista
    public void mostrarDados() {
        for (Disciplina disciplina : disciplinas) {
            disciplina.mostrarDados();
            System.out.println();
        }
    }
}
