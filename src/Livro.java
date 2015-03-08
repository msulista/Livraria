/**
 * Created by marcus.rodrigues on 07/03/2015.
 */
public class Livro {

    private String nome;
    private String aoutor;
    private String isbn;
    private String editora;
    private String edicao;

    public Livro(String nome, String aoutor, String isbn, String editora, String edicao) {
        this.nome = nome;
        this.aoutor = aoutor;
        this.isbn = isbn;
        this.editora = editora;
        this.edicao = edicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAoutor() {
        return aoutor;
    }

    public void setAoutor(String aoutor) {
        this.aoutor = aoutor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
}
