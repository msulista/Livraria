package hashtable;

import model.Livro;

/**
 * Created by marcus.rodrigues on 06/06/2015.
 */
public interface IhashTableLivro {

    public int hashcodeOne(String isbn);
    public int hashcodeTwo(String isbn);

    public Livro criaLivroHash(Livro livro, int key);
    public void insereLivroNoHashList(Livro livro);

    public Livro buscaLivroHash(int isbn);
}
