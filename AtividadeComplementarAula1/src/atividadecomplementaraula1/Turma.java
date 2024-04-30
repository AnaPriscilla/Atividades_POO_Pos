/*

 */
package atividadecomplementaraula1;

import java.util.ArrayList;

/**
 *
 * @author anapriscilla
 */
public class Turma {
    private ArrayList<Aluno> alunos;
    
    // Construtor
    public Turma() {
        alunos = new ArrayList<>();
    }
    
    // Método para adicionar o aluno na turma
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    // Esse método mostra os dados de todos os alunos 
    public void mostrarDados() {
        for (Aluno aluno : alunos) {
            aluno.mostrarDados();
            System.out.println();
        }
    }
}
