package model;

import java.util.Date;

/**
 * Created by marcus.rodrigues on 03/04/2015.
 */
public class Pagamento {

    private double valorTotal;
    private Date dataCompra;

    public Pagamento(double valorTotal, Date dataCompra) {
        this.valorTotal = valorTotal;
        this.dataCompra = dataCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
}
