/*
 */
package atividadepratica4;

/**
 *
 * @author anapriscilla
 */
class Cliente extends Pessoa {
    private double valorUltimaCompra;

    public Cliente(String nome, char sexo, String cpf, String endereco, double valorUltimaCompra) {
        super(nome, sexo, cpf, endereco);
        this.valorUltimaCompra = valorUltimaCompra;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Última Compra($): " + valorUltimaCompra);
    }
}