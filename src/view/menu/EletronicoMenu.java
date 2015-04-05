package view.menu;

/**
 * Created by marcus.rodrigues on 05/04/2015.
 */
public class EletronicoMenu {
    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;
    public static final int OP_VOLTAR = 0;

    public static String getOpcoes(){

        return ("\n===============================================\n" +
                "\t1 - Cadastrar Eletrônico\n" +
                "\t2 - Listar Eletrônicos\n" +
                "\t0 - Voltar" +
                "\n===============================================\n");
    }
}