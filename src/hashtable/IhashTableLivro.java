package hashtable;

import model.Livro;

import java.util.List;

/**
 * Created by marcus.rodrigues on 06/06/2015.
 */
public interface IhashTableLivro {

    public int hashcodeOne(String isbn);
    public int hashcodeTwo(String isbn);

    public void recebeListaLivros(List<Livro> livroList);
    public Livro criaLivroHash(Livro livro, int hc1, int hc2, int key);
    public void insereLivroNoHashList(Livro livro);

    public Livro buscaLivroHash(int isbn);
}
