package hashtable;

import model.Livro;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcus.rodrigues on 27/05/2015.
 */
public class HashTableLivro implements IhashTableLivro{

    private Livro[] livrosHash = new Livro[5000];

    private List<Integer> pilhaDeHashs = new ArrayList<Integer>();

    @Override
    public long hashcodeOne(String isbn) {
        long hashOne = 0;
        try {
            hashOne = Long.parseLong(isbn);
        }catch (NumberFormatException nfe){
            System.out.println("É já éras exception");
        }
        hashOne = hashOne % livrosHash.length;
        return hashOne;
    }

    @Override
    public long hashcodeTwo(String isbn) {
        long hashTwo = 0;
        String stringMd5 = md5(isbn).substring(1,7);
       // System.out.println("substring " + stringMd5);
        try {
            hashTwo = Long.parseLong(stringMd5)%livrosHash.length;
        }catch (NumberFormatException nfe){
            System.out.println("É já éras exception");
        }
        return hashTwo;
    }

    @Override
    public void recebeListaLivros(List<Livro> livroList) {

        for (int i = 0; i < livroList.size()-1; i++) {
            insereLivroNoHashList(livroList.get(i));
        }
    }

    @Override
    public Livro criaLivroHash(Livro livro, int hash1, int hash2, int key) {
        Livro livroHash = new Livro(livro.getTitulo(), livro.getAutor(), livro.getIsbn(), key);
        return livroHash;
    }

    @Override
    public void insereLivroNoHashList(Livro livro) {

        if (livrosHash[(int)hashcodeOne(livro.getIsbn())] == null){

            int hashCode1 = (int)hashcodeOne(livro.getIsbn());
            int hashCode2 = (int)hashcodeTwo(livro.getIsbn());
            System.out.println("Aqui tudo ok");
            int key = 0;
            try {
                key = Integer.parseInt(livro.getIsbn());
                System.out.println(key);
            }catch (NumberFormatException nfe){

                System.out.println("É já éras exception");
            }
            livrosHash[hashCode1] = criaLivroHash(livro, hashCode1, hashCode2, key);

        }else if (hashcodeOne(livrosHash[(int)hashcodeOne(livro.getIsbn())].getIsbn())  == hashcodeOne(livro.getIsbn()) && (!pilhaDeHashs.contains(hashcodeOne(livro.getIsbn())))){
            //Novo livro na posição
            int hashCode1 = (int)hashcodeOne(livro.getIsbn());
            int key = 0;
            try {
                key = Integer.parseInt(livro.getIsbn());
                System.out.println(key);
            }catch (NumberFormatException nfe){

                System.out.println("É já éras exception");
            }
            Livro livroNovo = criaLivroHash(livro, hashCode1, (int)hashcodeTwo(livro.getIsbn()), key);

            //livro antigo na posição
            Livro livroAntigo = livrosHash[(int)hashcodeOne(livro.getIsbn())];
            livrosHash[hashCode1] = livroNovo; //Adicionei o livro novo na sua posição de hash1
            coocko(livroAntigo, livroNovo);
        }

    }


    //Testa qual o hash ésta sendo utilizado
    @Override
    public void coocko(Livro livroAntigo, Livro livroNovo) {

        if (hashcodeOne(livroAntigo.getIsbn()) == hashcodeOne(livroNovo.getIsbn())) { //Verifica se o livro antigo esta na posição HashCodeOne

            if (!pilhaDeHashs.contains((int)hashcodeTwo(livroAntigo.getIsbn()))){ //Verifica se a pilha já contem a posição pra onde ele vai.

                if (livrosHash[(int)hashcodeTwo(livroAntigo.getIsbn())] == null) { //Se a nova posição vazia adiciona e zera pilha

                    livrosHash[(int)hashcodeTwo(livroAntigo.getIsbn())] = livroAntigo;
                        pilhaDeHashs.clear();
                    }else {                                     // Se não copia livro antigo na posição  adiciona o novo e refaz o coocko

                        Livro livroAntigoCoocko = livrosHash[(int)hashcodeTwo(livroAntigo.getIsbn())];
                    livrosHash[(int)hashcodeTwo(livroAntigo.getIsbn())] = livroAntigo;
                    pilhaDeHashs.add((int)hashcodeTwo(livroAntigo.getIsbn()));
                    coocko(livroAntigoCoocko, livroAntigo);  //Aqui chamo o metodo novamente só que desta vez mudo os livros
                    }
                }else {                                             //Caso já tenha na pilha deveria ser feito o ReHash mas encerra o programa
                    System.out.println("Não é possivel adicionar, deve realizar o Rehash!!!");
                    //break;
                }

            }else if(hashcodeTwo(livroAntigo.getIsbn()) == hashcodeTwo(livroNovo.getIsbn())){  //Verifica se o livro antigo esta na posição HashCodeTwo

                if (!pilhaDeHashs.contains((int)hashcodeOne(livroAntigo.getIsbn()))) { //Verifica se a pilha já contem a posição pra onde ele vai.

                    if (livrosHash[(int)hashcodeOne(livroAntigo.getIsbn())] == null) { //Se a nova posição vazia adiciona e zera pilha

                        livrosHash[(int)hashcodeOne(livroAntigo.getIsbn())] = livroAntigo;
                        pilhaDeHashs.clear();
                    }else {                                         // Se não copia livro antigo na posição  adiciona o novo e refaz o coocko

                        Livro livroAntigoCoocko = livrosHash[(int)hashcodeOne(livroAntigo.getIsbn())];
                        livrosHash[(int)hashcodeOne(livroAntigo.getIsbn())] = livroAntigo;
                        pilhaDeHashs.add((int)hashcodeOne(livroAntigo.getIsbn()));
                        coocko(livroAntigoCoocko, livroAntigo);  //Recursividade apenas mudo os livros.
                    }
                }else {                                             //Caso já tenha na pilha deveria ser feito o ReHash mas encerra o programa
                    System.out.println("Não é possivel adicionar, deve realizar o Rehash!!!");
                    //break;
                }
            }
    }

    @Override
    public Livro buscaLivroHash(long isbn) {
        for (int i = 0; i < livrosHash.length; i++) {

            //não implementado
        }
        return null;
    }

    //Chamo só na hora de criaar meu hashTwo
    public static String md5(String isbn){
        String hashMd5 = "";
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        BigInteger hash = new BigInteger(1, md.digest(isbn.getBytes()));
        hashMd5 = hash.toString(9);
        return hashMd5;
    }
}
