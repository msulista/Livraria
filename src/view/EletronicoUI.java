package view;

import model.Eletronico;
import model.Item;
import repositorio.RepositorioItem;
import view.menu.EletronicoMenu;

/**
 * Created by marcus.rodrigues on 05/04/2015.
 */
public class EletronicoUI {

    private RepositorioItem listaItens;

    public EletronicoUI (RepositorioItem listaItens) {
        this.listaItens = listaItens;
    }

    public void executar(){
        int opcao = 0;
        do{
            System.out.println(EletronicoMenu.getOpcoes());
            switch (opcao){
                case EletronicoMenu.OP_CADASTRAR:{

                    // cadastrarEletronico();
                    break;
                }
                case EletronicoMenu.OP_LISTAR:{

                    //listarEletronicos();
                    break;
                }
                case EletronicoMenu.OP_VOLTAR:{
                    System.out.println("Retornando ao menu anterior!!!");
                    break;
                }
                default:
                    System.out.println("Opção inválida!!!");
            }
        }while (opcao != EletronicoMenu.OP_VOLTAR);
    }

    public void cadastrarEletronico(){

        System.out.println("Tipo de Produto : Multifuncional" +
                "\nMarca: HP" +
                "\nModelo: OfficeJet Pro 276dw Colorida Wi-Fi" +
                "\nVoltagem (V): 110" +
                "\nQuantidade: 2" +
                "\nPreço (R$): 1139.05");

        String tipoDeProduto = "Multifuncional";
        String marca = "HP";
        String modelo = "OfficeJet Pro 276dw Colorida Wi-Fi";
        int voltagem = 110;
        int quantidade = 2;
        double preco = 1139.05;
        listaItens.adicionarEletronico(new Eletronico(preco, quantidade, tipoDeProduto, marca, modelo, voltagem));
        System.out.println("\nEletronico " + tipoDeProduto + " cadastrado com sucesso!!!");
    }

    public void listarEletronicosCadastrados(){
        System.out.println("===============================================\n");
        System.out.println(String.format("%-10s", "TIPO DE PRODUTO:") + "\t" +
                String.format("%-20s", "MARCA") + "\t" +
                String.format("%-20s", "MODELO") + "\t" +
                String.format("%-20s", "VOLTAGEM (v)") + "\t" +
                String.format("%-20s", "PREÇO") + "\t" +
                String.format("%-20s", "QUANTIDADE ESTOQUE"));

        for (Item item : listaItens.getListaDeitens()){
            if (item instanceof Eletronico) {
                System.out.println(String.format("%-10s", ((Eletronico) item).getTipoDeProduto()) + "\t" +
                        String.format("%-20s", ((Eletronico) item).getMarca()) + "\t" +
                        String.format("%-20s", ((Eletronico) item).getModelo()) + "\t" +
                        String.format("%-20s", ((Eletronico) item).getVoltagem()) + "\t" +
                        String.format("%-20s", item.getPreco()) + "\t" +
                        String.format("%-20s", ((Eletronico) item).getQuantidade()));
            }
        }
    }
}
