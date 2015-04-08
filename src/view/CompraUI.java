package view;

import model.Item;
import model.Pagamento;
import model.Pedido;
import repositorio.RepositorioPedido;
import view.menu.CompraMenu;

/**
 * Created by marcus.rodrigues on 07/04/2015.
 */
public class CompraUI {

    private RepositorioPedido listaDePedidos;
    private Pagamento pagamento;

    public CompraUI(RepositorioPedido listaDePedidos, Pagamento pagamento) {
        this.listaDePedidos = listaDePedidos;
        this.pagamento = pagamento;
    }

    public void executar(){

        int opcao = 0;
        do{
            System.out.println(CompraMenu.getOpcoes());
            opcao = 1;
            switch (opcao){
                case CompraMenu.OP_CADASTRAR:{

                    //cadastrarCompra();
                    break;
                }
                case CompraMenu.OP_LISTAR:{

                    break;
                }
                case CompraMenu.OP_VOLTAR:{
                    System.out.println("Retornando ao menu principal!!!");
                    break;
                }
                default:
                    System.out.println("Opção inválida!!!");
            }
        }while (opcao != CompraMenu.OP_VOLTAR);
    }

    public void emitirNotaFiscalDaCompra(Pedido pedido){

        int contadorItens = 1;
        System.out.println("###NOTAFISCAL###\n" +
                "Cliente: " + pedido.getCliente().getNome() + "\n" +
                "CPF: " + pedido.getCliente().getCpf() +"\n" +
                "Numero Pedido: " + pedido.getCodigo() + "\n\n" +
                "==================================================" +
                "\n\n##Item   \tProduto      \t\tValor(R$)");
        for(Item item : pedido.getListaCarrinho()){
            System.out.println(contadorItens + " -\t " +  "");
        }
    }
}
