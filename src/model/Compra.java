package model;

/**
 * Created by marcus.rodrigues on 03/04/2015.
 */
public class Compra {

    private Pedido pedido;
    private Pagamento pagamento;
    private double valor;

    public Compra(Pedido pedido, Pagamento pagamento) {
        this.pedido = pedido;
        this.pagamento = pagamento;
        this.valor = 0.00;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double calculaValorCompra(Pedido pedido){
        for(Item item : pedido.getListaCarrinho()){
            this.valor = this.valor + item.getPreco();
        }
        return valor;
    }
    public void emitirNotaFiscalDaCompra(Pedido pedido){

        int contadorItens = 1;
        System.out.println("\t\t\t###NOTAFISCAL###\n" +
                "Cliente: " + pedido.getCliente().getNome() + "\n" +
                "CPF: " + pedido.getCliente().getCpf() +"\n" +
                "Numero Pedido: " + pedido.getCodigo() + "\n" +
                "==================================================" +
                "\n##Item   \tProduto      \t\tValor(R$)");
        for(Item item : pedido.getListaCarrinho()){

            System.out.println(contadorItens + " -\t\t " + item.getClass() +"\t\t\tR$ " + item.getPreco());
            item.retiraEstoque(item);

        }
        System.out.println("##Valor Total:\t\t\t\t\t\tR$" + calculaValorCompra(pedido) );
    }

}
