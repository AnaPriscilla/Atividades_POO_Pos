/*
    1. Crie uma classe Main para representar todos os seus apartamentos e seus respectivos moradores, seguindo os itens a seguir:
        1. A lista de “Apartamentos” deverá ser um ArrayList da classe “Apartamento”.
        2. Na classe “Main”, implemente um método adicionarApartamento() para adicionar os apartamentos dentro do ArrayList criado.
        3. Na classe “Main”, implemente um método mostrarDados(), que imprima a lista de todos os apartamentos do Main em questão.
 */
package atividadepratica3;

/**
 *
 * @author anapriscilla
 */
/*
import java.util.ArrayList;*/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Edificio edificio = new Edificio(" Oklahoma", " Rua 16");

        Apartamento ap1 = new Apartamento(101, 1, 86.5, "Alugado");
        ap1.adicionarMorador(new Morador("Diego", "437.823.261-80", "(62) 99446-8709"));
        edificio.adicionarApartamento(ap1);
        
         Apartamento ap2 = new Apartamento(102, 2, 86.5, "Alugado");
        ap2.adicionarMorador(new Morador("Giovana", "171.813.241-79", "(62) 98118-6742"));
        edificio.adicionarApartamento(ap2);

        Apartamento ap3 = new Apartamento(103, 3, 173.0, "À venda");
        ap3.adicionarMorador(new Morador("Sharon", "347.681.481-58", "(62) 96864-8255"));
        edificio.adicionarApartamento(ap3);

        edificio.mostrarDados();
    }
    
}
