package model;

/**
 * Created by marcus.rodrigues on 02/04/2015.
 */
public class DVD extends Item{

    private String titulo;
    private String categoria;
    private int anoProducao;
    private int duracaoMinutos;
    private String idioma;

    public DVD(double preco, int quantidade, String titulo, String categoria, int anoProducao, int duracaoMinutos, String idioma) {
        super(preco, quantidade);
        this.titulo = titulo;
        this.categoria = categoria;
        this.anoProducao = anoProducao;
        this.duracaoMinutos = duracaoMinutos;
        this.idioma = idioma;
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

}
