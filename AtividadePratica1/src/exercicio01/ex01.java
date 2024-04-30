/*
01. Ler dois números inteiros, calcular a média aritmética e imprimir na tela o resultado. 
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2;
        float media;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("______Média entre dois números inteiros______");
                
        System.out.print("Digite o 1º número: ");
        numero1 = ler.nextInt();
        
        System.out.print("Digite o 2º número: ");
        numero2 = ler.nextInt();
        
        media = (float) ((numero1 + numero2) / 2);
        System.out.println("Média aritmética: " + media);
        
    }
    
}
