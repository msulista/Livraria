package view;

import model.Item;
import model.Livro;
import repositorio.RepositorioItem;
import view.menu.LivroMenu;

/**
 * Created by marcus.rodrigues on 05/04/2015.
 */
public class LivroUI {

    private RepositorioItem listaItens;

    public LivroUI(RepositorioItem listaItens) {
        this.listaItens = listaItens;
    }

    public void executar(){
        int opcao = 0;
        do{
            System.out.println(LivroMenu.getOpcoes());
            opcao = 1;
            switch (opcao){
                case LivroMenu.OP_CADASTRAR:{

                   // cadastrarLivro();
                    break;
                }
                case LivroMenu.OP_LISTAR:{

                    break;
                }
                case LivroMenu.OP_VOLTAR:{
                    System.out.println("Retornando ao menu anterior!!!");
                    break;
                }
                default:
                    System.out.println("Opção inválida!!!");
            }
        }while (opcao != LivroMenu.OP_VOLTAR);
    }

    public void cadastrarLivro(){
        String titulo = "Lone Survivor";
        String autor = "Marcus Luttrell";
        String isbn = "978-0-316-06759-1";
        String editora = "Little Brows";
        String edicao = "June 2007";
        int quantidade = 5;
        double preco = 57.10;
        listaItens.adicionarLivro(new Livro(preco, titulo, autor, isbn, editora, edicao, quantidade));
        System.out.println("Livro " + titulo + " cadastrado com sucesso!!!");
    }

    public void listaLivrosCadastrados(){
        System.out.println("===============================================\n");
        System.out.println(String.format("%-10s", "TITULO:") + "\t" +
                String.format("%-20s", "ISBN") + "\t" +
                String.format("%-20s", "AUTOR") + "\t" +
                String.format("%-20s", "EDITORA") + "\t" +
                String.format("%-20s", "EDIÇÃO") + "\t" +
                String.format("%-20s", "PREÇO") + "\t" +
                String.format("%-20s", "QUANTIDADE ESTOQUE"));

        for (Item item : listaItens.getListaDeitens()){
            if (item instanceof Livro) {
                System.out.println(String.format("%-10s", ((Livro) item).getTitulo()) + "\t" +
                        String.format("%-20s", ((Livro) item).getIsbn()) + "\t" +
                        String.format("%-20s", ((Livro) item).getAutor()) + "\t" +
                        String.format("%-20s", ((Livro) item).getEditora()) + "\t" +
                        String.format("%-20s", ((Livro) item).getEdicao()) + "\t" +
                        String.format("%-20s", ((Livro) item).getPreco()) + "\t" +
                        String.format("%-20s", ((Livro) item).getQuantidade()));
            }
        }
    }
}
