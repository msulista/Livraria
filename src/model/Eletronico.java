package model;

/**
 * Created by marcus.rodrigues on 02/04/2015.
 */
public class Eletronico extends Item {

    private String tipoDeProduto;
    private String marca;
    private String modelo;
    private int voltagem;
    private int quantidade;

    public Eletronico(double preco, String tipoDeProduto, String marca, String modelo, int voltagem, int quantidade) {
        super(preco);
        this.tipoDeProduto = tipoDeProduto;
        this.marca = marca;
        this.modelo = modelo;
        this.voltagem = voltagem;
        this.quantidade = quantidade;
    }

    public String getTipoDeProduto() {
        return tipoDeProduto;
    }

    public void setTipoDeProduto(String tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
