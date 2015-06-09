package model;

/**
 * Created by marcus.rodrigues on 02/04/2015.
 */
public class Item implements Comparable<Item>{

    private double preco;
    private int quantidade;
    private String titulo;

    public Item(String titulo) {
        this.titulo = titulo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Item item) {
        return titulo.compareTo(item.getTitulo());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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