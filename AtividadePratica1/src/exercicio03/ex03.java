/*
03. Ler as notas finais de um aluno em três disciplinas, calcular a média global e, 
analisando-a, indicar se o aluno está aprovado (média global maior ou igual a 6.0) 
ou reprovado (caso contrário). 
 */
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        float nota1, nota2, nota3;
        
        System.out.println("Digite a nota da 1ª disciplina: ");
        nota1 = ler.nextFloat();
        
        System.out.println("Digite a nota da 2ª disciplina: ");
        nota2 = ler.nextFloat();
        
        System.out.println("Digite a nota da 3ª disciplina: ");
        nota3 = ler.nextFloat();
        
        //Média
        float media = (nota1 + nota2 + nota3) / 3;
        
        //Se aprovado ou reprovado
        if (media >= 6) {
            System.out.println("Parabéns! APROVADO 😃 com média: " + media);
        } else {
            System.out.println("Infelizmente você foi reprovado 🙁 e sua média final é: " + media);
        }
        
    }
    
}