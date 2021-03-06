package model;

/**
 * Created by marcus.rodrigues on 07/03/2015.
 *
 * Classe model.Livro contem todas as informações
 * de um livro.
 */
public class Livro extends Item{

    private String tituloLivro;
    private String autor;
    private String isbn;
    private String editora;
    private String edicao;
    private int hashCodeOne;
    private int hashCodeTwo;
    private long key;

    /**
     * Metodo construtor
     *
     *
     * @param autor - Nome do outor do livro
     * @param isbn - Cod isbn do livro
     * @param editora - Nome da editora responsavel pelo livro
     * @param edicao - Indica a edição do livro
     * @param preco - Indica o valor do livro
     *
     */
    public Livro(String titulo, String autor, String isbn) {
        super(titulo);
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.edicao = edicao;
    }
    public Livro(String titulo, String autor, String isbn, long key) {
        super(titulo);
        this.autor = autor;
        this.isbn = isbn;
        this.tituloLivro = titulo;
        this.key = key;
    }

    /**
     * Método para retorno do titulo do autor
     *
     * @return Nome do autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Método para receber autor
     *
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Método para retorno do código isbn
     *
     * @return código isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Método para receber isbn
     *
     * @param isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Método para retorno do titulo da editora
     *
     * @return Nome editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * Método para receber editora
     *
     * @param editora
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * Método para retorno do numero da edição
     *
     * @return numero edição
     */
    public String getEdicao() {
        return edicao;
    }

    /**
     * Método para receber edição
     *
     * @param edicao
     */
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public long getKey() {
        return key;
    }
}
