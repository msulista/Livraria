package model;

/**
 * Created by marcus.rodrigues on 02/04/2015.
 */
public class Eletronico extends Item {

    private String tipoDeProduto;
    private String marca;
    private String modelo;
    private int voltagem;

    public Eletronico(String titulo, String tipoDeProduto, String marca, String modelo, int voltagem) {
        super(titulo);
        this.tipoDeProduto = tipoDeProduto;
        this.marca = marca;
        this.modelo = modelo;
        this.voltagem = voltagem;
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
}
