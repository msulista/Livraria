package hashtable;

import model.Item;
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
    public Livro criaLivroHash(Livro livro, int key) {
        int hash1 = hashcodeOne(livro.getIsbn());
        int hash2 = hashcodeTwo(livro.getIsbn());
        Livro livro1 = new Livro(livro.getTitulo(), livro.getAutor(), livro.getIsbn(), hash1, hash2, key);
        return null;
    }

    @Override
    public void insereLivroNoHashList(Livro livro) {

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

    public static int verificaChave(List<Integer> pilhaDeHashs, Livro livro){
        int key = 0;

        if (!pilhaDeHashs.contains()){
            pilhaDeHashs.add(livro.getKey())
        }

        return key;
    }
}
