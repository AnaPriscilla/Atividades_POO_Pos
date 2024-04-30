/*
 */
package atividadecomplementaraula1;

/**
 *
 * @author anapriscilla
 */
public class Curso {
    
    private String nome;
    private String turno;
    
    public Curso(String nome, String turno){
        this.nome = nome;
        this.turno = turno;
    }
    
    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Turno: " + turno);
    }
    
}
