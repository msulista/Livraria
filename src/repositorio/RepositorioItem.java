package repositorio;

import model.DVD;
import model.Eletronico;
import model.Item;
import model.Livro;

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

    public List<Item> getListaDeitens() {
        return listaDeitens;
    }

    // Tratando de Livro

    /**
     * Metodo responsavém por adicionar um livro na lista de item
     *
     * @param livro objeto livro que sera adicionado
     */
    public void adicionarLivro(Livro livro){
        listaDeitens.add(livro);
    }

    public Livro buscaLivroPorTitulo(String titulo){
        for(Item itemDeLivro : listaDeitens){
            if(itemDeLivro instanceof Livro){
               if(((Livro) itemDeLivro).getTitulo().equalsIgnoreCase(titulo)){
                    return (Livro) itemDeLivro;
               }
            }
        }
        return null;
    }
    public boolean existeLivroComTitulo(String titulo){
        if(this.buscaLivroPorTitulo(titulo) == null){
            return (false);
        }
        return (true);
    }

    public Livro buscaLivroPorIsbn(String isbn){
        for(Item itemDeLivro : listaDeitens){
            if(itemDeLivro instanceof Livro){
                if(((Livro) itemDeLivro).getIsbn().equals(isbn)){
                    return (Livro) itemDeLivro;
                }
            }
        }
        return null;
    }
    public boolean existeLivroComIsbn(String isbn){
        if(this.buscaLivroPorIsbn(isbn) == null){
            return (false);
        }
        return (true);
    }

    public Livro buscaLivroPorAutor(String autor){
        for(Item itemDeLivro : listaDeitens){
            if(itemDeLivro instanceof Livro){
                if (((Livro) itemDeLivro).getAutor().equalsIgnoreCase(autor)){
                    return (Livro) itemDeLivro;
                }
            }
        }
        return null;
    }
    public boolean existeLivroComAutor(String autor){
        if (this.buscaLivroPorAutor(autor) == null){
            return (false);
        }
        return (true);
    }

    // Tratando de DVD

    public void adicionarDVD(DVD dvd){
        listaDeitens.add(dvd);
    }

    public DVD buscaDVDporTitulo(String titulo){
        for (Item itemDeDVD : listaDeitens){
            if (itemDeDVD instanceof DVD){
                if (((DVD) itemDeDVD).getTitulo().equalsIgnoreCase(titulo)){
                    return ((DVD) itemDeDVD);
                }
            }
        }
        return null;
    }
    public boolean existeDVDcomTitulo(String titulo){
        if (this.buscaDVDporTitulo(titulo) == null){
            return (false);
        }
        return (true);
    }

    public DVD buscaDVDporCategoria(String categoria){
        for (Item itemDeDVD : listaDeitens){
            if (itemDeDVD instanceof DVD){
                if (((DVD) itemDeDVD).getCategoria().equalsIgnoreCase(categoria)){
                    return ((DVD) itemDeDVD);
                }
            }
        }
        return null;
    }
    public boolean existeDVDcomCategoria(String categoria){
        if (this.buscaDVDporCategoria(categoria) == null){
            return (false);
        }
        return (true);
    }

    public DVD buscaDVDporAnoProducao(int ano){
        for (Item itemDeDVD : listaDeitens){
            if (itemDeDVD instanceof DVD){
                if (((DVD) itemDeDVD).getAnoProducao() == ano){
                    return ((DVD) itemDeDVD);
                }
            }
        }
        return null;
    }
    public boolean existeDVDcomAnoProducao(int ano){
        if (this.buscaDVDporAnoProducao(ano) == null){
            return (false);
        }
        return (true);
    }

    // Tratanto de Eletronicos

    public void adicionarEletronico(Eletronico eletronico){
        listaDeitens.add(eletronico);
    }

    public Eletronico buscaEletronicoPorTipoDeProduto(String tipoDeProduto){
        for (Item itemDeEletro : listaDeitens){
            if (itemDeEletro instanceof Eletronico){
                if (((Eletronico) itemDeEletro).getTipoDeProduto().equalsIgnoreCase(tipoDeProduto)){
                    return ((Eletronico) itemDeEletro);
                }
            }
        }
        return null;
    }
    public boolean existeEletronicoComTipoDeProduto(String tipoDeProduto){
        if (this.buscaEletronicoPorTipoDeProduto(tipoDeProduto) == null){
            return (false);
        }
        return (true);
    }

    public Eletronico buscaEletronicoPorMarca(String marca){
        for (Item itemDeEletro : listaDeitens){
            if (itemDeEletro instanceof Eletronico){
                if (((Eletronico) itemDeEletro).getMarca().equalsIgnoreCase(marca)){
                    return ((Eletronico) itemDeEletro);
                }
            }
        }
        return null;
    }
    public boolean existeEletronicoComMarca(String marca){
        if (this.buscaEletronicoPorMarca(marca) == null){
            return (false);
        }
        return (true);
    }

    public Eletronico buscaEletronicoPorModelo(String modelo){
        for (Item itemDeEletro : listaDeitens){
            if (itemDeEletro instanceof Eletronico){
                if (((Eletronico) itemDeEletro).getModelo().equalsIgnoreCase(modelo)){
                    return ((Eletronico) itemDeEletro);
                }
            }
        }
        return null;
    }
    public boolean existeEletronicoComModelo(String modelo){
        if (this.buscaEletronicoPorModelo(modelo) == null){
            return (false);
        }
        return (true);
    }
}
