package view;

import model.DVD;
import model.Item;
import repositorio.RepositorioItem;
import view.menu.DvdMenu;

/**
 * Created by marcus.rodrigues on 05/04/2015.
 */
public class DvdUI {

    private RepositorioItem listaItens;

    public DvdUI (RepositorioItem listaItens) {
        this.listaItens = listaItens;
    }

    public void executar(){
        int opcao = 0;
        do{
            System.out.println(DvdMenu.getOpcoes());
            switch (opcao){
                case DvdMenu.OP_CADASTRAR:{

                    // cadastrarDVD();
                    break;
                }
                case DvdMenu.OP_LISTAR:{

                    //listarDVDs();
                    break;
                }
                case DvdMenu.OP_VOLTAR:{
                    System.out.println("Retornando ao menu anterior!!!");
                    break;
                }
                default:
                    System.out.println("Opção inválida!!!");
            }
        }while (opcao != DvdMenu.OP_VOLTAR);
    }

    public void cadastrarDVD(){

        String titulo = "Joe Bonamassa - Tour de Force Live in London";
        String categoria = "Blues";
        int anoProducao = 2013;
        int duracaoMinutos = 180;
        String idioma = "Ingles";
        int quantidade = 7;
        double preco = 54.90;
        listaItens.adicionarDVD(new DVD(preco, titulo, categoria, anoProducao, duracaoMinutos, idioma, quantidade));
        System.out.println("DVD " + titulo + " cadastrado com sucesso!!!");
    }

    public void listarDVDCadastrados(){
        System.out.println("===============================================\n");
        System.out.println(String.format("%-10s", "TITULO:") + "\t" +
                String.format("%-20s", "CATEGORIA") + "\t" +
                String.format("%-20s", "ANO DE PRODUÇÃO") + "\t" +
                String.format("%-20s", "DURAÇÃO EM MINUTOS") + "\t" +
                String.format("%-20s", "IDIOMA") + "\t" +
                String.format("%-20s", "PREÇO") + "\t" +
                String.format("%-20s", "QUANTIDADE ESTOQUE"));

        for (Item item : listaItens.getListaDeitens()){
            if (item instanceof DVD) {
                System.out.println(String.format("%-10s", ((DVD) item).getTitulo()) + "\t" +
                        String.format("%-20s", ((DVD) item).getCategoria()) + "\t" +
                        String.format("%-20s", ((DVD) item).getAnoProducao()) + "\t" +
                        String.format("%-20s", ((DVD) item).getDuracaoMinutos()) + "\t" +
                        String.format("%-20s", ((DVD) item).getIdioma()) + "\t" +
                        String.format("%-20s", ((DVD) item).getPreco()) + "\t" +
                        String.format("%-20s", ((DVD) item).getQuantidade()));
            }
        }
    }
}
