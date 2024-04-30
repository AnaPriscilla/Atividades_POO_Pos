/*
02. Ler os coeficientes “a”, “b” e “c” de uma equação do segundo grau e calcular 
os valores de delta e das duas raízes da equação; ao final, imprimir os resultados. 
 */
package exercicio02;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Equação 2º grau -> formula de baskara: x = -b (mais ou menos) raiz de delta / 2*a
        int a, b, c;
        float delta, raiz1, raiz2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("_____Calculo de equação do 2º grau_____");
        
        // 1º identificar os coeficientes
        System.out.print("Digite o coeficiente de a: ");
        a = ler.nextInt();
        
        System.out.print("Digite o coeficiente de b: ");
        b = ler.nextInt();
        
        System.out.print("Digite o coeficiente de c: ");
        c = ler.nextInt();
        
        // 2º resolver -> formula de delta: ax² + bx + c = 0
        delta = (b * b) + (-4 * (a * c));
        
        //PRECISO IMPRIMIR DELTA E SUAS RAIZES **AO FINAL**. 
        //Imprimindo o valor de delta
        //System.out.println("Valor de Delta é: " + delta);
        
        //Aqui preciso por a estrutura condicional
        if (delta >= 0) {
                raiz1 = (float) ((- b + (Math.sqrt(delta))) / (2 * a));
                raiz2 = (float) ((- b - (Math.sqrt(delta))) / (2 * a));
                
                System.out.println("A raiz 1 é: " + raiz1);
                System.out.println("A raiz 2 é: " + raiz2);
                
        } else {
            System.out.println("Não possui raizes reais!");
        }
       
    }
    
}
