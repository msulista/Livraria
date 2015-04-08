package livraria;



import repositorio.RepositorioCliente;
import repositorio.RepositorioItem;
import repositorio.RepositorioPedido;
import view.*;

/**
 * Created by marcus.rodrigues on 04/04/2015.
 */
public class Livraria {
    public static void main(String[] args) {

        RepositorioCliente listaClientes = new RepositorioCliente();
        RepositorioPedido listaPedidos = new RepositorioPedido();
        RepositorioItem listaItens = new RepositorioItem();

        System.out.println("\t\tMODO DEMONSTRAÇÃO" +
                "\n==============================================\n");
        //Cadastrando cliente
        System.out.println("\t\tCADASTRANDO CLIENTE\n");
        ClienteUI clienteUI = new ClienteUI(listaClientes);
        clienteUI.cadastrarCliente();
        System.out.println("============================================\n");

        //Cadastrando Item
        System.out.println("\t\tCADASTRANDO LIVRO\n");
        LivroUI livroUI = new LivroUI(listaItens);
        livroUI.cadastrarLivro();
        System.out.println("============================================\n");

        //Cadastrando Item
        System.out.println("\t\tCADASTRANDO DVD\n");
        DvdUI dvdUI = new DvdUI(listaItens);
        dvdUI.cadastrarDVD();
        System.out.println("============================================\n");

        //Cadastrando Item
        System.out.println("\t\tCADASTRANDO ELETRONICO\n");
        EletronicoUI eletronicoUI = new EletronicoUI(listaItens);
        eletronicoUI.cadastrarEletronico();
        System.out.println("============================================\n");

        //Efetuando um pedido
        System.out.println("\t\tCADASTRANDO PEDIDO\n");
        PedidoUI pedidoUi = new PedidoUI(listaItens, listaClientes);
        pedidoUi.cadastrarPedido();
        System.out.println("============================================\n");


    }
}
