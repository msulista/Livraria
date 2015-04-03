package model;

import java.util.Date;

/**
 * Created by marcus.rodrigues on 03/04/2015.
 */
public class CartaoCredito extends Pagamento {

    private String bandeira;
    private int anoVencimento;
    private String nomeTitular;

    public CartaoCredito(double valorTotal, Date dataCompra, String bandeira, int anoVencimento, String nomeTitular) {
        super(valorTotal, dataCompra);
        this.bandeira = bandeira;
        this.anoVencimento = anoVencimento;
        this.nomeTitular = nomeTitular;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getAnoVencimento() {
        return anoVencimento;
    }

    public void setAnoVencimento(int anoVencimento) {
        this.anoVencimento = anoVencimento;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
