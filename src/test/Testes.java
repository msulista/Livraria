package test;

import hashtable.HashTableLivro;

import java.util.regex.Pattern;

/**
 * Created by marcus.rodrigues on 03/05/2015.
 */
public class Testes {

    public static void main(String[] args) {

        HashTableLivro hashTableLivro = new HashTableLivro();

        String string = "123456789";
        System.out.println(hashTableLivro.hashcodeOne(string));
       System.out.println(hashTableLivro.hashcodeTwo(string));
    }

/*
    public static void main(String[] args) {

        String linha = "livro; Um Sonho de Liberdade; 123456789; Mark Virgil; autor 2; autor 3";

        String[] item = new String[20]; //Pra colocar a linha
        String tipo = "";
        String titulo = "";
        String isbn = "";
        String autor = "";
        String autores = "";


        item = linha.split(Pattern.quote(";"));



            if (item[0].equalsIgnoreCase("livro")) {
                titulo = item[1];
                isbn = item[2];
                if (item.length > 3){
                    for (int indice = 3; indice < item.length; indice++) {
                        autor = autor.concat(item[indice]);
                    }
                }
            }
            //System.out.println("\nItem " + i + ": " + item[i]);


            System.out.println("\n" + tipo);
            System.out.println("\n" + titulo);
            System.out.println("\n" + isbn);
            System.out.println("\n" + autor);
    }//fim psvm
    */
}

 /*
        System.out.println("\t\tMODO DEMONSTRAÇÃO" +
                "\n==============================================\n");
        //Cadastrando cliente
        System.out.println("\t\tCADASTRANDO CLIENTE\n");
        System.out.println("Nome : Marcus Rodrigues" +
                "\nCPF: 8270752xxxx" +
                "\nTelefone: 95887354" +
                "\nData de Nascimento: 03/04/1981" +
                "\nEndereço: Joaquim Nabuco" +
                "\nCidade: Porto Alegre" +
                "\nUF: RS");
        Cliente cliente = new Cliente("Marcus Rodrigues", "827075290xx", "95887354", "03/04/19081", "Joaquim Nabuco", "Porto Alegre", "RS" );
        System.out.println("\n Cliente " + cliente.getNome() + " cadastrado com sucesso!!!");
        System.out.println("============================================\n");

        //Cadastrando Item
        System.out.println("\t\tCADASTRANDO LIVRO\n");
        System.out.println("Titulo : Lone Survivor" +
                "\nAutor : Marcus Luttrell" +
                "\nIsbn: 978-0-316-06759-1" +
                "\nEditora: Little Brows" +
                "\nEdição: June 2007" +
                "\nQuantidade: 5" +
                "\nPreço: R$ 57,10");

        Livro livro = new Livro(57.10, 5, "Lone Survivor", "Marcus Luttrell", "978-0-316-06759-1", "Little Brows", "June 2007" );
        System.out.println("\nLivro " + livro.getTitulo() + " cadastrado com sucesso!!!");
        System.out.println("============================================\n");

        //Cadastrando Item
        System.out.println("\t\tCADASTRANDO DVD\n");
        System.out.println("Titulo: Joe Bonamassa - Tour de Force Live in London" +
                "\nCategoria: Blues" +
                "\nAno de Produção: 2013" +
                "\nDuração em minutos: 180" +
                "\nIdioma: Inglês" +
                "\nQuantidade: 7" +
                "\nPreço: R$54,90");
        DVD dvd = new DVD(54.90, 7, "Joe Bonamassa - Tour de Force Live in London", "Blues", 2013, 180, "Inglês");
        System.out.println("Dvd " + dvd.getTitulo() + " cadastrado com sucesso!!!");
        System.out.println("============================================\n");

        //Cadastrando Item
        System.out.println("\t\tCADASTRANDO ELETRONICO\n");
        System.out.println("Tipo de Produto : Multifuncional" +
                "\nMarca: HP" +
                "\nModelo: OfficeJet Pro 276dw Colorida Wi-Fi" +
                "\nVoltagem (V): 110" +
                "\nQuantidade: 2" +
                "\nPreço (R$): 1139.05");
        Eletronico eletronico = new Eletronico(1139.05, 2, "Multifuncional", "HP", "OfficeJet Pro 276dw Colorida Wi-Fi", 110);
        System.out.println("Eletrônico " + eletronico.getModelo() + " cadastrado com sucesso!!!");
        System.out.println("============================================\n");

        //Cliente escolhendo itens
        System.out.println("\t\tCLIENTE ADICIONANDO ITENS EM SEU CARRINHO\n");
        System.out.println("Cliente : Marcus Rodrigues" +
                "\nItem 1: Lone Survivor" +
                "\nItem 2: Joe Bonamassa - Tour de Force Live in London" +
                "\nItem 3: OfficeJet Pro 276dw Colorida Wi-Fi");
        Pedido pedido = new Pedido(cliente);
        pedido.adicionaItemNoCarrinho(livro);
        pedido.adicionaItemNoCarrinho(dvd);
        pedido.adicionaItemNoCarrinho(eletronico);
        System.out.println("Pedido numero " + pedido.getCodigo() + " cadastrado com sucesso!!!");
        System.out.println("============================================\n");

        //Efetuando a compra
        System.out.println("############################################\n");
        System.out.println("============================================\n");
        System.out.println("\t\t\tFINALIZANDO COMPRA\n");
        Pagamento pagamento = new Pagamento(cliente);
        pagamento.setTipoDePagamento("Boleto Bancario");
        Compra compra = new Compra(pedido, pagamento);
        compra.emitirNotaFiscalDaCompra(pedido);
        System.out.println("============================================\n");
        System.out.println("############################################\n");

        */

