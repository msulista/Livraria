package model;

/**
 * Created by marcus.rodrigues on 02/04/2015.
 */
public class DVD {

    private String titulo;
    private String categoria;
    private int anoProducao;
    private int duracaoMinutos;
    private String idioma;
    private double preco;
    private int quantidade;

    public DVD(String titulo, String categoria, int anoProducao, int duracaoMinutos, String idioma, double preco, int quantidade) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.anoProducao = anoProducao;
        this.duracaoMinutos = duracaoMinutos;
        this.idioma = idioma;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnoProducao() {
        return anoProducao;
    }

    public void setAnoProducao(int anoProducao) {
        this.anoProducao = anoProducao;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
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
