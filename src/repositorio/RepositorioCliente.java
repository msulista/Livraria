package repositorio;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsavel por guardar e manipular o cliente
 *
 * Created by marcus.rodrigues on 14/03/2015.
 *
 */
public class RepositorioCliente {

    private List<Cliente> listaDeclientes;

    /**
     * Metodo responsavel por inicializar a lista de clientes
     *
     * @param clietes = Lista de clientes
     */
    public RepositorioCliente() {
        this.listaDeclientes = new ArrayList<Cliente>();
    }

    /**
     * Metodo responsavel por adicionar um cliente na lista
     *
     * @param cliente
     */
    public void adicionaCliente(Cliente cliente){

        listaDeclientes.add(cliente);
    }

    /**
     * Metodo responsavel por retornar cliente
     *
     * @return
     */
    public List<Cliente> getClientes(){
        return listaDeclientes;
    }

    /**
     * Metodo responsavel por realizar uma busca por nome
     *
     * @param nome
     * @return cliente se existir, se não retorna null
     */
    public Cliente buscaClienteNome(String nome){
        for (Cliente cli: listaDeclientes) {
            if(cli.getNome().equalsIgnoreCase(nome)){
                return (cli);
            }
        }
        return (null);
    }
    /**
     * Metodo responsavel por testar se cliente já existe
     *
     * @param nome
     * @return false se cliente não existir e true se cliente já existir
     */
    public boolean existeClienteNome(String nome){
        if(this.buscaClienteNome(nome)==null){
            return (false);
        }
        return (true);
    }
    /**
     * Metodo responsavel por realizar uma busca por cpf
     *
     * @param cpf
     * @return cliente se existir, se não retorna null
     */
    public Cliente buscaClienteCpf(String cpf){
        for (Cliente cli: listaDeclientes) {
            if(cli.getCpf().equals(cpf)){
                return (cli);
            }
        }
        return (null);
    }
    /**
     * Metodo responsavel por testar se cliente já existe
     *
     * @param cpf
     * @return false se cliente não existir e true se cliente já existir
     */
    public boolean existeClienteCpf(String cpf){
        if(this.buscaClienteCpf(cpf)==null){
            return (false);
        }
        return (true);
    }
    /**
     * Metodo responsavel por realizar uma busca por fone
     *
     * @param fone
     * @return cliente se existir, se não retorna null
     */
    public Cliente buscaClienteFone(String fone){
        for (Cliente cli: listaDeclientes) {
            if(cli.getTelefone().equals(fone)){
                return (cli);
            }
        }
        return (null);
    }
    /**
     * Metodo responsavel por testar se cliente já existe
     *
     * @param fone
     * @return false se cliente não existir e true se cliente já existir
     */
    public boolean existeClienteFone(String fone){
        if(this.buscaClienteFone(fone)==null){
            return (false);
        }
        return (true);
    }
}
