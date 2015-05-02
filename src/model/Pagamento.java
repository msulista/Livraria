package model;

/**
 * Created by marcus.rodrigues on 03/04/2015.
 */
public class Pagamento {

    private Cliente cliente;
    private String tipoDePagamento;

    public Pagamento(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public String confirmaPagamento(){
        return (cliente.getNome() + "Realizou o pagamento realizado com sucesso!!!");
    }
}
