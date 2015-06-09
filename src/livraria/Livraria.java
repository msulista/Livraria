package livraria;
import model.*;
import util.Console;
import view.menu.LivrariaMenu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;


/**
 * Created by marcus.rodrigues on 04/04/2015.
 */
public class Livraria {
    public static void main(String[] args) throws IOException {

        Estoque estoque = new Estoque();

        //Criando cliente
        Cliente cliente = new Cliente("Marcus", "123456789", "95887354");

        //lendo arquivo csv e criando objetos e adicionando no vetor Estoque
        try {
            lerArquivo(estoque);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //Mostra Estoque ordenado
        for (int i = 0; i < 5000; i++){

            System.out.println("Tipo: " + estoque.getIndice(i).getClass() + " - Item "+ i+1 + ": " + estoque.getIndice(i).getTitulo());
        }

        //livrariaView.telaInicial();

        int opcao;
        Item item;

        do {

            System.out.println(LivrariaMenu.getOpcoes());
            opcao = Console.lerInt("Digite opção desejada: ");

            switch (opcao){
                case LivrariaMenu.OP_BUSCA_LINEAR: {
                    System.out.println("\t\tBUSCA LINEAR\n");
                    item = estoque.buscaPorTituloLinear(Console.lerString("Digite Titulo: "));
                    if (item != null){
                        System.out.println("Resultado - Tipo: "+ "" + item.getClass().getTypeName() + " - Titulo: " + item.getTitulo());
                    }else{
                        System.out.println("\n Titulo não encontrado!!!");
                    }
                    break;
                }
                case LivrariaMenu.OP_COMPRA_OTIMIZADA:{
                    System.out.println("\t\tBUSCA OTIMIZADA\n");
                    item = estoque.buscaPorTituloBinaria(Console.lerString("Digite Titulo: "));
                    if (item != null){
                        System.out.println("Resultado - Tipo: "+ "" + item.getClass().getTypeName() + " - Titulo: " + item.getTitulo());
                    }else{
                        System.out.println("\n Titulo não encontrado!!!");
                    }

                    break;
                }
                case LivrariaMenu.OP_SAIR:{
                    System.out.println("Voltar ao menu principal!!!");
                    break;
                }
                default:
                    System.out.println("Digite uma opção válida!!!");
            }
        }while (opcao != LivrariaMenu.OP_SAIR);


        System.out.println("\n\nFim do Programa!!!");
    }


//Metodos para ler, separar, criar objetos e adicionar ao estoque
    public static void lerArquivo(Estoque estoque) throws IOException {
        String[] itens = new String[6425];

        //Abre arquivo .cvs
        FileReader arquicoCSV = new FileReader("C:\\Users\\marcus.rodrigues\\Desktop\\dados.txt");
        BufferedReader myBuffer = new BufferedReader(arquicoCSV);

        //Le linhas do arquivo
        String linha = myBuffer.readLine();
        for (int i = 0; i < itens.length; i++){
            itens[i] = linha;
            criaObjetosDeItem(linha, estoque);
            linha = myBuffer.readLine();//Não sei por que isso esta funcionando mas esta, então deixa assim
            //System.out.println(i + " - " + itens[i]);
        }
        arquicoCSV.close();
    }
    public static void criaObjetosDeItem(String linha, Estoque estoque){
        String[] item = new String[20]; //Pra colocar a linha

        String titulo = "";
        String isbn = "";
        String autor = "";
        String genero = "";
        int ano = 0;

        //Separa os ; de cada linha
        item = linha.split(Pattern.quote(";"));

        if (item[0].equalsIgnoreCase("livro")) {
            Livro livro;
            titulo = item[1];
            isbn = item[2];
            if (item.length > 3){
                for (int indice = 3; indice < item.length; indice++) {
                    autor = autor.concat(item[indice]);
                }
            }
            livro = new Livro(titulo, autor, isbn);
            adicionaEstoque(estoque, livro);


        }else if(item[0].equalsIgnoreCase("dvd")){
            DVD dvd;
            titulo = item[1];
            //ano = Integer.parseInt(item[2]);
            genero = item[3];
            dvd = new DVD(titulo, genero);
            adicionaEstoque(estoque, dvd);

        }else if (item[0].equalsIgnoreCase("eletronico")){
            Eletronico eletronico;
        }
    }

    public static void adicionaEstoque(Estoque estoque, Item item){

        estoque.add(item);
    }

    public void telaInicial(Estoque estoque){

        int opcao;
        Item item;

        do {

            System.out.println(LivrariaMenu.getOpcoes());
            opcao = Console.lerInt("Digite opção desejada: ");

            switch (opcao){
                case LivrariaMenu.OP_BUSCA_LINEAR: {
                    System.out.println("\t\tBUSCA LINEAR\n");
                    item = estoque.buscaPorTituloLinear(Console.lerString("Digite Titulo: "));
                    if (item != null){
                        System.out.println("Tipo: "+ "" + item.getClass().getTypeName() + " - Titulo: " + item.getTitulo());
                    }else{
                        System.out.println("\n Titulo não encontrado!!!");
                    }
                    break;
                }
                case LivrariaMenu.OP_COMPRA_OTIMIZADA:{
                    System.out.println("\t\tBUSCA OTIMIZADA\n");
                    item = estoque.buscaPorTituloBinaria(Console.lerString("Digite Titulo: "));
                    if (item != null){
                        System.out.println("Tipo: "+ "" + item.getClass().getTypeName() + " - Titulo: " + item.getTitulo());
                    }else{
                        System.out.println("\n Titulo não encontrado!!!");
                    }

                    break;
                }
                case LivrariaMenu.OP_SAIR:{
                    System.out.println("Voltar ao menu principal!!!");
                    break;
                }
                default:
                    System.out.println("Digite uma opção válida!!!");
            }
        }while (opcao != LivrariaMenu.OP_SAIR);
    }

}
