package repositorio;

import model.Pedido;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcus.rodrigues on 03/04/2015.
 */
public class RepositorioPedido {

    private List<Pedido> listaPedidos;

    public RepositorioPedido() {
        this.listaPedidos = new ArrayList<Pedido>();
    }

    public void adicionarPedido(Pedido pedido){
        this.listaPedidos.add(pedido);
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public Pedido buscarPedidoPorCpfCliente(String cpf){
        for (Pedido pedido : listaPedidos){
            if (pedido.getCliente().getCpf().equalsIgnoreCase(cpf)){
                return pedido;
            }
        }
        return null;
    }
    public boolean existePedidoComCPF(String cpf){
        if (this.buscarPedidoPorCpfCliente(cpf) == null){
            return (false);
        }
        return (true);
    }

}
