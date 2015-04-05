package view;

import model.Cliente;
import repositorio.RepositorioCliente;
import util.DateUtil;
import view.menu.ClienteMenu;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by marcus.rodrigues on 04/04/2015.
 */
public class ClienteUI {

    private RepositorioCliente listaClientes;
    private Date dataNasc;

    public ClienteUI(RepositorioCliente listaClientes) {
        this.listaClientes = listaClientes;
        this.dataNasc = dataNasc;
    }

    public void executar(){

        int opcao = 0;
        do{
            System.out.println(ClienteMenu.getOpcoes());
            //Para cadastrar 1 paciente setarei direto a opção de cadastrar
            //
            opcao = 1;
            switch (opcao){
                case ClienteMenu.OP_CADASTRAR:{

                    cadastrarCliente();
                    opcao = 0;
                    break;
                }
                case ClienteMenu.OP_LISTAR:{
                    
                    break;
                }
                case ClienteMenu.OP_VOLTAR:{
                    System.out.println("Retornando ao menu principal!!!");
                    break;
                }
                default:
                    System.out.println("Opção inválida!!!");
            }
        }while (opcao != ClienteMenu.OP_VOLTAR);
    }

    private void cadastrarCliente(){
        //Print para mostrar o cliente sendo cadastrado...
        System.out.println("Nome : Marcus Rodrigues" +
                "\nCPF: 8270752xxxx" +
                "\nTelefone: 95887354" +
                "\nData de Nascimento: 03/04/1981" +
                "\nEndereço: Joaquim Nabuco" +
                "\nCidade: Porto Alegre" +
                "\nUF: RS");
        String cpf = "8270752xxxx";
        if (listaClientes.existeClienteCpf(cpf)){
            System.out.println("CPF já cadastro no sistema!!!");
        }else{
            String nome = "Marcus Rodrigues";
            String telefone = "95887354";
            String dataNascimento = "03/04/1981";
            if (DateUtil.verificaData(dataNascimento)){
                try {
                    dataNasc = DateUtil.stringToDate(dataNascimento);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("Data inválida!!!");
            }
            String endereco = "Joaquim Nabuco";
            String cidade = "Porto Alegre";
            String uf = "RS";
            listaClientes.adicionaCliente(new Cliente(nome, cpf, telefone, dataNasc, endereco, cidade, uf));
            System.out.println("Cliente " + nome + " cadastrado com sucesso!!!");
        }

    }
}
