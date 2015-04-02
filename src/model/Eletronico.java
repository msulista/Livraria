package model;

/**
 * Created by marcus.rodrigues on 02/04/2015.
 */
public class Eletronico extends Item {

    private String tipoDeProduto;
    private String marca;
    private String modelo;
    private int voltagem;
    private double preco;
    private int quantidade;


    public Eletronico(String departamento, String tipoDeProduto, String marca, String modelo, int voltagem, double preco, int quantidade) {
        super(departamento);
        this.tipoDeProduto = tipoDeProduto;
        this.marca = marca;
        this.modelo = modelo;
        this.voltagem = voltagem;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
