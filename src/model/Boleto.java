package model;

import java.util.Date;

/**
 * Created by marcus.rodrigues on 03/04/2015.
 */
public class Boleto extends Pagamento {

    private Date dataVenciamento;

    public Boleto(double valorTotal, Date dataCompra, Date dataVenciamento) {
        super(valorTotal, dataCompra);
        this.dataVenciamento = dataVenciamento;
    }

    public Date getDataVenciamento() {
        return dataVenciamento;
    }

    public void setDataVenciamento(Date dataVenciamento) {
        this.dataVenciamento = dataVenciamento;
    }
}
