/*
Crie ainda uma classe principal (Main), que cadastre uma turma de 50 alunos, 10 disciplinas e um curso.
 */
package atividadecomplementaraula1;

/**
 *
 * @author anapriscilla
 */

public class Main {
    public static void main(String[] args) {
        
        // Aqui crio a tuma de alunos
        Turma turma = new Turma();

        // Fazendo o cadastro dos 50 alunos
        for (int i = 1; i <= 50; i++) {
            Aluno aluno = new Aluno(i, "Aluno " + i, (String.valueOf(20) + i));
            turma.adicionarAluno(aluno);
        }

        // Criando uma lista de disciplinas
        ListaDasDisciplinas disciplinas = new ListaDasDisciplinas();

        // Cadastrando 10 disciplinas
        for (int i = 1; i <= 10; i++) {
            Disciplina disciplina = new Disciplina("Disciplina " + String.valueOf(i));
            disciplinas.adicionarDisciplina(disciplina);
        }

        // Criando um curso
        Curso curso = new Curso(String.valueOf(1), "Curso de Orientação a Objetos em Java"); 

        // Mostrando os dados da turma, disciplinas e curso
        System.out.println("_____ Dados da Turma _____");
        turma.mostrarDados();

        System.out.println("\n_____ Dados das Disciplinas _____");
        disciplinas.mostrarDados();

        System.out.println("\n_____ Dados do Curso _____");
        curso.mostrarDados();
    }
}