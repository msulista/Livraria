package repositorio;

import model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcus.rodrigues on 02/04/2015.
 */
public class RepositorioItem {

    private List<Item> listaDeitens;

    public RepositorioItem() {
        this.listaDeitens = new ArrayList<Item>();
    }

    public void adicionarItem(Item item){
        listaDeitens.add(item);
    }

    public List<Item> getListaDeitens() {
        return listaDeitens;
    }

    /*
        public Item buscaItemPor(String titulo){
            for(Livro liv: livros){
                if(liv.getTitulo().equalsIgnoreCase(titulo)){
                    return (liv);
                }
            }
            return (null);
        }
    */
}
