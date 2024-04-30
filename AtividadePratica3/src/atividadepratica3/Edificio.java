/*
 */
package atividadepratica3;

/**
 *
 * @author anapriscilla
 */
import java.util.ArrayList;

class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void adicionarApartamento(Apartamento apartamento) {
        this.apartamentos.add(apartamento);
    }

    public void mostrarDados() {
        System.out.println("Edificio: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Lista de Apartamentos: ");
        for (Apartamento apartamento : apartamentos) {
            System.out.println(apartamento);
        }
    }
}