/*
 1. A lista de “Apartamentos” deverá ser um ArrayList da classe “Apartamento”.
 */
package atividadepratica3;

import java.util.ArrayList;

/**
 *
 * @author anapriscilla
 */
class Apartamento {
    private int numero;
    private int andar;
    private double metragem;
    private String situacao;
    private ArrayList<Morador> moradores;

    public Apartamento(int numero, int andar, double metragem, String situacao) {
        this.numero = numero;
        this.andar = andar;
        this.metragem = metragem;
        this.situacao = situacao;
        this.moradores = new ArrayList<>();
    }

    public void adicionarMorador(Morador morador) {
        this.moradores.add(morador);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Apartamento: ");
        stringBuilder.append(numero);
        stringBuilder.append(", Andar: ");
        stringBuilder.append(andar);
        stringBuilder.append(", Metragem: ");
        stringBuilder.append(metragem);
        stringBuilder.append(", Situação: ");
        stringBuilder.append(situacao);
        stringBuilder.append("\n");
        for (Morador morador : moradores) {
            stringBuilder.append("  - ");
            stringBuilder.append(morador);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}