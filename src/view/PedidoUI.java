package view;

import model.Cliente;
import model.Item;
import model.Pedido;
import repositorio.RepositorioCliente;
import repositorio.RepositorioItem;
import repositorio.RepositorioPedido;
import view.menu.PedidoMenu;

/**
 * Created by marcus.rodrigues on 06/04/2015.
 */
public class PedidoUI {

    private RepositorioPedido listaDePedidos;
    private RepositorioItem listaDeItens;
    private RepositorioCliente listaDeClientes;

    public PedidoUI(RepositorioItem listaDeItens, RepositorioCliente listaDeClientes) {
        this.listaDePedidos = listaDePedidos;
        this.listaDeItens = listaDeItens;
        this.listaDeClientes = listaDeClientes;
    }

    public void executar(){

        int opcao = 0;
        do{
            System.out.println(PedidoMenu.getOpcoes());
            opcao = 1;
            switch (opcao){
                case PedidoMenu.OP_CADASTRAR:{

                    cadastrarPedido();
                    break;
                }
                case PedidoMenu.OP_LISTAR:{

                    break;
                }
                case PedidoMenu.OP_VOLTAR:{
                    System.out.println("Retornando ao menu principal!!!");
                    break;
                }
                default:
                    System.out.println("Opção inválida!!!");
            }
        }while (opcao != PedidoMenu.OP_VOLTAR);
    }

    public void cadastrarPedido(){
        //Print para mostrar o Pedido sendo cadastrado...
        System.out.println("Nome Cliente : Marcus Rodrigues" +
                "\nItem 1: Livro Lone Survivor" +
                "\nItem 2: Eletronico - Multifuncional" +
                "\nItem 3: DVD - Joe Bonamassa");

        Cliente cliente = listaDeClientes.buscaClienteCpf("8270752xxxx");
        Item item1 = listaDeItens.buscaLivroPorTitulo("Lone Survivor");
        Item item2 = listaDeItens.buscaEletronicoPorMarca("HP");
        Item item3 = listaDeItens.buscaDVDporTitulo("Joe Bonamassa - Tour de Force Live in London");
        Pedido pedido = new Pedido(cliente);
        pedido.adicionaItemNoCarrinho(item1);
        pedido.adicionaItemNoCarrinho(item2);
        pedido.adicionaItemNoCarrinho(item3);
        System.out.println("Tamanho do carrinho: "+ pedido.getListaCarrinho().size());
        this.listaDePedidos.adicionarPedido(pedido);
    }
}
