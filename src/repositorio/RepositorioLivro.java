package repositorio;

import model.Livro;

import java.util.ArrayList;

/**
 * Created by marcus.rodrigues on 15/03/2015.
 */
public class RepositorioLivro {
    ArrayList<Livro> livros;

    /**
     * Metodo responsavel por inicializar o objeto de livros
     */
    public RepositorioLivro() {
        this.livros = new ArrayList<Livro>();
    }

    /**
     * Metodo responsavel por adicionar livro a lista
     *
     * @param livro objeto de livro cadastrado
     */
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    /**
     * Metodo responsavel por retornal lista de livros cadastrados
     *
     * @return livros
     */
    public ArrayList<Livro> getLivros(){
        return livros;
    }

    /**
     * Metodo responsavel por buscar livro por titulo
     *
     * @param titulo paramentro informado para a busca
     * @return se existir retorna valor de liv, caso não exista retorna null
     */
    public Livro buscaLivroTitulo(String titulo){
        for(Livro liv: livros){
            if(liv.getTitulo().equalsIgnoreCase(titulo)){
                return (liv);
            }
        }
        return (null);
    }

    /**
     * Metor responsavel por testar se livro existe
     *
     * @param titulo parametro informado para busca
     * @return false caso não exista, e true se existir
     */
    public boolean existeLivroTitulo(String titulo){
       if(this.buscaLivroTitulo(titulo) == null){
           return (false);
       }
        return (true);
    }

    /**
     * Metodo responsavel por buscar livro por isbn
     *
     * @param isbn parametro informado para a busca
     * @return retorna valor de liv se existir e null se não existir
     */
    public Livro buscaLivroIsbn(String isbn){
        for(Livro liv: livros){
            if(liv.getIsbn().equals(isbn)){
                return (liv);
            }
        }
        return (null);
    }

    /**
     * Metodo responsavel por testar se existe livro
     *
     * @param isbn parametro informado para busca
     * @return false se não existir e true se existir
     */
    public boolean existeLivroIsbn(String isbn){
        if(this.buscaLivroIsbn(isbn) == null){
            return (false);
        }
        return (true);
    }
}
