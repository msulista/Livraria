package model;

/**
 * Created by marcus.rodrigues on 02/04/2015.
 */
public class Item {

    private double preco;
    private int quantidade;

    public Item(double preco, int quantidade) {
        this.preco = preco;
        this.quantidade = quantidade;
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

    public void retiraEstoque(Item item){
        item.setQuantidade(quantidade - 1);
    }
}
