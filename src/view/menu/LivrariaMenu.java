package view.menu;

/**
 * Created by marcus.rodrigues on 06/05/2015.
 */
public class LivrariaMenu {
    public static final int OP_BUSCA_LINEAR = 1;
    public static final int OP_COMPRA_OTIMIZADA = 2;
    public static final int OP_SAIR = 0;

    public static String getOpcoes() {
        return ("\n----------------------------------------\n" +
                "\t\t###LIVRARIA FARROUPILHA###" +
                "\n--------------------------------------\n"
                + "1- Menu Busca Linear\n"
                + "2- Menu Busca Binaria\n"
                + "0- Sair da Aplicação"
                + "\n--------------------------------------");
    }
}
