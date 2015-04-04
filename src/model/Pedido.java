package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcus.rodrigues on 03/04/2015.
 */
public class Pedido {

    private static int CODIGO_PEDIDO = 1;
    private int codigo;
    private Cliente cliente;
    private List<Item> listaCarrinho;

    public Pedido(Cliente cliente) {
        this.codigo = generateCodigo();
        this.cliente = cliente;
        this.listaCarrinho = new ArrayList<Item>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getListaCarrinho() {
        return listaCarrinho;
    }

    public void adicionaItemNoCarrinho(Item item) {
        this.listaCarrinho.add(item);
    }
    public Item removeItemDoCarrinho(int posicao){
        return listaCarrinho.remove(posicao);
    }
    public boolean existeItemNoCarrinho(){
        if (listaCarrinho.size() == 0){
            return (false);
        }
        return (true);
    }

    private int generateCodigo(){
        return (CODIGO_PEDIDO++);
    }

}
