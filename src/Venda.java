/**
 * Classe responsavel por finalizar a compra realizada pelo cliente
 *
 * Created by marcus.rodrigues on 15/03/2015.
 */
public class Venda {

    private Double precoFinal;

    /**
     * Metodo responsavel por inicializar os atributos da classe
     * 
     * @param precoFinal
     */
    public Venda(Double precoFinal) {
        this.precoFinal = precoFinal;
    }

    /**
     * Metodo responsavel por finalizar a compra realizada pelo cliente.
     *
     * @param cliente
     * @return
     */
    public double valorFinalDoCarrinhoDeCompras(Cliente cliente){

        cliente.calculaValorCarrinho();

        return precoFinal;
    }


}
