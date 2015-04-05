package view.menu;

/**
 * Created by marcus.rodrigues on 04/04/2015.
 */
public class ClienteMenu {
    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;
    public static final int OP_VOLTAR = 0;

    public static String getOpcoes(){

        return ("\n===============================================\n" +
                "\t1 - Cadastrar Cliente\n" +
                "\t2 - Listar Clientes\n" +
                "\t0 - Voltar" +
                "\n===============================================\n");
    }
}
