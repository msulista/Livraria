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
    public int hashcodeOne(String isbn) {
        int hashOne = 0;
        hashOne = Integer.parseInt(isbn);
        hashOne = hashOne % livrosHash.length;
        return hashOne;
    }

    @Override
    public int hashcodeTwo(String isbn) {
        int hashTwo = 0;
        String stringMd5 = md5(isbn).substring(1,7);
       // System.out.println("substring " + stringMd5);
        hashTwo = Integer.parseInt(stringMd5)%livrosHash.length;
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

        if (livrosHash[hashcodeOne(livro.getIsbn())] == null){
            int hashCode1 = hashcodeOne(livro.getIsbn());
            int hashCode2 = hashcodeTwo(livro.getIsbn());
            int key = Integer.parseInt(livro.getIsbn());
            livrosHash[hashCode1] = criaLivroHash(livro, hashCode1, hashCode2, key);

        }else if (hashcodeOne(livrosHash[hashcodeOne(livro.getIsbn())].getIsbn())  == hashcodeOne(livro.getIsbn()) && (!pilhaDeHashs.contains(hashcodeOne(livro.getIsbn())))){
            //Novo livro na posição
            int hashCode1 = hashcodeOne(livro.getIsbn());
            Livro livroNovo = criaLivroHash(livro, hashCode1, hashcodeTwo(livro.getIsbn()), Integer.parseInt(livro.getIsbn()));

            //livro antigo na posição
            Livro livroAntigo = livrosHash[hashcodeOne(livro.getIsbn())];
            livrosHash[hashCode1] = livroNovo; //Adicionei o livro novo na sua posição de hash1
            coocko(livroAntigo, livroNovo);
        }

    }

    @Override
    public Livro buscaLivroHash(int isbn) {
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

    //Testa qual o hash ésta sendo utilizado
    public void coocko(Livro livroAntigo, Livro livroNovo) {

        if (hashcodeOne(livroAntigo.getIsbn()) == hashcodeOne(livroNovo.getIsbn())) { //Verifica se o livro antigo esta na posição HashCodeOne

            if (!pilhaDeHashs.contains(hashcodeTwo(livroAntigo.getIsbn()))){ //Verifica se a pilha já contem a posição pra onde ele vai.

                if (livrosHash[hashcodeTwo(livroAntigo.getIsbn())] == null) { //Se a nova posição vazia adiciona e zera pilha

                    livrosHash[hashcodeTwo(livroAntigo.getIsbn())] = livroAntigo;
                        pilhaDeHashs.clear();
                    }else {                                     // Se não copia livro antigo na posição  adiciona o novo e refaz o coocko

                        Livro livroAntigoCoocko = livrosHash[hashcodeTwo(livroAntigo.getIsbn())];
                    livrosHash[hashcodeTwo(livroAntigo.getIsbn())] = livroAntigo;
                    pilhaDeHashs.add(hashcodeTwo(livroAntigo.getIsbn()));
                        coocko(livrosHash[hashcodeTwo(livroAntigo.getIsbn())], livroAntigo);
                    }
                }else {                                             //Caso já tenha na pilha deveria ser feito o ReHash mas encerra o programa
                    System.out.println("Não é possivel adicionar, deve realizar o Rehash!!!");
                    //break;
                }

            }else if(hashcodeTwo(livroAntigo.getIsbn()) == hashcodeTwo(livroNovo.getIsbn())){  //Verifica se o livro antigo esta na posição HashCodeTwo

                if (!pilhaDeHashs.contains(hashcodeOne(livroAntigo.getIsbn()))) { //Verifica se a pilha já contem a posição pra onde ele vai.

                    if (livrosHash[hashcodeOne(livroAntigo.getIsbn())] == null) { //Se a nova posição vazia adiciona e zera pilha

                        livrosHash[hashcodeOne(livroAntigo.getIsbn())] = livroAntigo;
                        pilhaDeHashs.clear();
                    }else {                                         // Se não copia livro antigo na posição  adiciona o novo e refaz o coocko

                        Livro livroAntigoCoocko = livrosHash[hashcodeOne(livroAntigo.getIsbn())];
                        livrosHash[hashcodeOne(livroAntigo.getIsbn())] = livroAntigo;
                        pilhaDeHashs.add(hashcodeOne(livroAntigo.getIsbn()));
                        coocko(livroAntigoCoocko, livroAntigo);
                    }
                }else {                                             //Caso já tenha na pilha deveria ser feito o ReHash mas encerra o programa
                    System.out.println("Não é possivel adicionar, deve realizar o Rehash!!!");
                    //break;
                }
            }
    }

/*
    public static int verificaChave(List<Integer> pilhaDeHashs, Livro livro){
        int key = 0;

        if (!pilhaDeHashs.contains(livro.getKey())){
            pilhaDeHashs.add(livro.getKey())
        }

        return key;
    }
*/
}
