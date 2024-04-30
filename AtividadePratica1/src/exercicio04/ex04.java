/*
04. Ler um vetor (com 5 posições) e uma matriz quadrada (de ordem 5), 
fazer a soma dos elementos do vetor e multiplicar este resultado por cada elemento da matriz, 
gerando uma matriz nova, que deverá ser impressa na tela. 
 */
package exercicio04;


import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class ex04 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("__________Gere uma Nova Matriz__________");

        //Ler um vetor (com 5 posições)
        int[] vetor = new int[5];
        System.out.println("Digite as 5 posições: ");
        for (int i = 0; i < 5; i++) {
            vetor[i] = ler.nextInt();
        }
        
        //Ler a matriz quadrada (de ordem 5)
        int[][] matriz = new int[5][5];
        System.out.println("Digite uma matriz de ordem 5x5: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }
        
        //soma dos elementos do vetor
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += vetor[i];
        }
        
        //multiplicar este resultado por cada elemento da matriz
        int[][] resultMatriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                resultMatriz[i][j] = matriz[i][j] * soma;
            }
        }
        
        //Resultado da nova matriz
        System.out.println("A nova matriz resultante é: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(resultMatriz[i][j]);
            }
        }
        
    }
}
