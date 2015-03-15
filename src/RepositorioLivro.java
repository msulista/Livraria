import java.util.ArrayList;

/**
 * Created by marcus.rodrigues on 15/03/2015.
 */
public class RepositorioLivro {
    ArrayList<Livro> livros;

    public RepositorioLivro() {
        this.livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public ArrayList<Livro> getLivros(){
        return livros;
    }

    public Livro buscaLivroTitulo(String titulo){
        for(Livro liv: livros){
            if(liv.getTitulo().equalsIgnoreCase(titulo)){
                return (liv);
            }
        }
        return (null);
    }

    public boolean existeLivroTitulo(String titulo){
       if(this.buscaLivroTitulo(titulo)==null){
           return (false);
       }
        return (true);
    }

}
