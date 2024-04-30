/*
1 - Faça uma classe Principal, com o método main. 
Experimente criar objetos de cada uma dessas classes e invocar o método mostrarDados() para cada um deles.
 */
package atividadepratica4;

/**
 *
 * @author anapriscilla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // Instanciando 6 funcionários
        Funcionario[] funcionarios = new Funcionario[6];
        funcionarios[0] = new Horista("Diego", "Pereira", 185, 10.0); 
        funcionarios[1] = new Horista("Giovana", "Fernandas", 240, 24.7); 
        funcionarios[2] = new Administrador("Sharon", "Ramos", 6000.0);
        funcionarios[3] = new Administrador("Núbia", "Silva", 6800.0); 
        funcionarios[4] = new Comissionado("Joaquim", "Mendes", 3000.0, 8000.0, 7.0); 
        funcionarios[5] = new Gerente("Lucas", "Couto", 5000.0, 2000.0); 

        // Percorrendo o vetor em funcionários e imprimindo os dados e salario mensal
        for (Funcionario funcionario : funcionarios) {
            System.out.println("\n_____ Dados do Funcionário _____");
            funcionario.mostrarDados();
            System.out.println("Salário mensal: R$" + funcionario.calcularGanhoMensal());
        }
    }
}
