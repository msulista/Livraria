import java.util.ArrayList;

/**
 * Created by marcus.rodrigues on 07/03/2015.
 */
public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;
    private String endereco;
    private String cidade;
    private String uf;
    private ArrayList<Livro> carrinhoLivros;

    /**
     * Método construtor
     *
     * @param nome - Nome do cliente
     * @param cpf - cpf do cliente
     * @param telefone - telefone do cliente
     * @param dataNascimento - Data de nascimento do cliente
     * @param endereco - Endereço do cliente
     * @param cidade - Cidade do cliente
     * @param uf - uf do cliente
     */
    public Cliente(String nome, String cpf, String telefone, String dataNascimento, String endereco, String cidade, String uf) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.carrinhoLivros = new ArrayList<Livro>();
    }

    /**
     * Método para retorno do nome do nome
     *
     * @return Nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para receber nome do cliente
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para retorno do nome do Cpf
     *
     * @return cpf do cliente
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Método para receber cpf do cliente
     *
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Método para retorno do telefone do cliente
     *
     * @return telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Método para receber telefone do cliente
     *
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Método para retorno da data de nascimento
     *
     * @return dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Método para receber datanascimento do cliente
     *
     * @param dataNascimento
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Método para retorno do endereço do cliente
     *
     * @return endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Método para receber endereço do cliente
     *
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Método para retorno da cidade do cliente
     *
     * @return cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Método para receber cidade do cliente
     *
     * @param cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Método para retorno do uf do cliente
     *
     * @return uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * Método para receber o uf do cliente
     *
     * @param uf
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * Método para retorno da list de carrinhoLivros do cliente
     *
     * @return carrinhoLivros
     */
    public ArrayList<Livro> getLivros() {
        return carrinhoLivros;
    }

    /**
     * Metodo para adicionar carrinhoLivros no carrinho do cliente
     *
     * @param livro
     */
    public void carrinhoCompras(Livro livro){

        carrinhoLivros.add(livro);
    }
}
