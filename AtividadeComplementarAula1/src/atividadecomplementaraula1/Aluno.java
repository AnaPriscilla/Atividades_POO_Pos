/*
 */
package atividadecomplementaraula1;


/**
 *
 * @author anapriscilla
 */
public class Aluno {
    
    private int matricula;
    private String nome;
    private String telefone;
    
    //Construtor
    public Aluno (int matricula, String nome, String telefone){
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    //Metodo pedido para mostrar os dados
    public void mostrarDados(){
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
    
}
