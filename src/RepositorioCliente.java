import java.util.ArrayList;

/**
 * Created by marcus.rodrigues on 14/03/2015.
 */
public class RepositorioCliente {

    ArrayList<Cliente> clientes;

    public RepositorioCliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void adicionaCliente(Cliente cliente){

        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes(){
        return clientes;
    }

    public Cliente buscaClienteNome(String nome){
        for (Cliente cli: clientes) {
            if(cli.getNome().equalsIgnoreCase(nome)){
                return (cli);
            }
        }
        return (null);
    }

    public boolean existeClienteNome(String nome){
        if(this.buscaClienteNome(nome)==null){
            return (false);
        }
        return (true);
    }

    public Cliente buscaClienteCpf(String cpf){
        for (Cliente cli: clientes) {
            if(cli.getNome().equals(cpf)){
                return (cli);
            }
        }
        return (null);
    }
    public boolean existeClienteCpf(String cpf){
        if(this.buscaClienteCpf(cpf)==null){
            return (false);
        }
        return (true);
    }

    public Cliente buscaClienteFone(String fone){
        for (Cliente cli: clientes) {
            if(cli.getNome().equals(fone)){
                return (cli);
            }
        }
        return (null);
    }

    public boolean existeClienteFone(String fone){
        if(this.buscaClienteFone(fone)==null){
            return (false);
        }
        return (true);
    }
}
