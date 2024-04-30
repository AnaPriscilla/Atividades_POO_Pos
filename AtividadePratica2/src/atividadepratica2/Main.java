/*
01 - Crie uma classe Triangulo que deverá apresentar os seguintes atributos: lado1 (int), lado2 (int) e lado3 (int). 
Deve também possuir um método para calcular e imprimir na tela o tipo do triângulo: isósceles (dois lados iguais), 
equilátero (três lados iguais) ou escaleno (três lados diferentes). Em outra classe (Main), crie três objetos do tipo
Triangulo. Atribua os valores para os lados de forma que cada triângulo seja de um tipo diferente. 
Chame, para cada um deles, o método para imprimir o seu tipo.
 */
package atividadepratica2;

/**
 *
 * @author anapriscilla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crie três objetos do tipo Triangulo
        
        //Escaleno
        Triangulo triangulo1 = new Triangulo(7, 10, 5);
        // Isósceles
        Triangulo triangulo2 = new Triangulo(5, 5, 8);
        // Equilátero
        Triangulo triangulo3 = new Triangulo(6, 6, 6); 

        // Imprimindo
        System.out.print("Triângulo 1: ");
        triangulo1.imprimirTipo();

        System.out.print("Triângulo 2: ");
        triangulo2.imprimirTipo();

        System.out.print("Triângulo 3: ");
        triangulo3.imprimirTipo();
    }
    
}
