/**
 * Created by marcus.rodrigues on 07/03/2015.
 *
 * Classe Livro contem todas as informações
 * de um livro.
 */
public class Livro {

    private String nome;
    private String autor;
    private String isbn;
    private String editora;
    private String edicao;
    private Double preco;

    /**
     * Metodo construtor
     *
     * @param nome - nome ou titulo do livro
     * @param autor - Nome do outor do livro
     * @param isbn - Cod isbn do livro
     * @param editora - Nome da editora responsavel pelo livro
     * @param edicao - Indica a edição do livro
     * @param preco - Indica o valor do livro
     *
     */
    public Livro(String nome, String autor, String isbn, String editora, String edicao, Double preco) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.edicao = edicao;
        this.preco = preco;
    }

    /**
     * Método para retorno do nome do funcionario
     *
     * @return Nome do livro
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para receber nome
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para retorno do nome do autor
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
     * Método para retorno do nome da editora
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

    /**
     * Metodo para retorno do valor do livro
     *
     * @return
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Metodo para receber valor
     *
     * @param preco
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
