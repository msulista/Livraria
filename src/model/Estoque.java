package model;


/**
 * Created by marcus.rodrigues on 29/04/2015.
 */
public class Estoque {

    Item[] vetItem;
    int count;
    int indiceComparador;

    public Estoque() {
        this.vetItem =  new Item[1];
        this.count = 0;
    }

    public int getSize(){
        return count;
    }

    public int getCapacidade(){
        return vetItem.length;
    }

    public Item getIndice(int indice){
        if (indice < 0 || indice >= count){
            throw new ArrayIndexOutOfBoundsException("Indice inválido!!!");
        }
        return vetItem[indice];
    }

    public void add(Item item){
        insert(count, item);
    }

    public void insert(int indice, Item item){
        if (indice < 0 || indice > count){
            throw new ArrayIndexOutOfBoundsException("Indice inválido!!!");
        }
        if (isDataFull()){
            resizeArray();
        }
        if (count == 0){
            vetItem[indice] = item;
        }else if (count > 0){
            int indiceItemNovo = procuraposicaoParaAdicionarItemNovo(item);

            moveItens(indiceItemNovo);
            vetItem[indiceItemNovo] = item;
        }
        count++;
    }

    //Ordena binario não esta funcionando
    /*
    public int oredena(int indice){

        int esq = 0;
        int dir = vetItem.length - 1;

        int valorMeio;

        while (esq <= dir) {
            valorMeio = (esq + dir)/2;
            if (comparador(valorMeio, indice) < indice){
                esq = valorMeio + 1;
            }else if (comparador(valorMeio, indice) > indice){
                dir = valorMeio - 1;
            }else
                return valorMeio;
        }
        return -1;
    }

    public int comparador(int valorMeio, int indice){

        System.out.println("ValorMeio " + valorMeio);
        System.out.println("Indice " + indice);
        System.out.println("Vetor lenth " + vetItem.length);

        char[] charArray1 = vetItem[valorMeio].getTitulo().toCharArray();
        char[] charArray2 = vetItem[indice].getTitulo().toCharArray();
        int i = 0;
        while ((i < charArray1.length) && (i < charArray2.length)){
            if ((charArray1[i] == charArray2[i])){
                i++;
            }else if(charArray1[i] < charArray2[i]){
                return valorMeio;
            }else
                return indice;
        }
        return Integer.parseInt(null);
    }
    */
    public int procuraposicaoParaAdicionarItemNovo(Item itemNovo){

        int indice = 0;
        while ((indice < count) && (itemNovo.getTitulo().compareToIgnoreCase(vetItem[indice].getTitulo()) >= 0)) {
            /* redundante com a condição do while
            if (itemNovo.getTitulo().compareToIgnoreCase(vetItem[indice].getTitulo()) < 0){
                return indice;
            }
            */
            indice++;
        }
        return indice;
    }

    private boolean isDataFull(){
        return count == vetItem.length;
    }

    private void resizeArray(){
        Item[] new_array = new Item[vetItem.length * 2];
        System.arraycopy(vetItem, 0, new_array, 0, vetItem.length);
        vetItem = new_array;
    }

    private void moveItens(int indice){
        System.arraycopy(vetItem, indice, vetItem, indice+1, count - indice);
    }

    public void remove(int indice){
        if (indice < 0 || indice >= count){
            throw new ArrayIndexOutOfBoundsException("Indice inválido");
        }
        System.arraycopy(vetItem, indice, vetItem, indice-1, count - indice);
        count--;
    }

    public Item buscaPorTituloLinear(String titulo){

        for (int  i = 0; i <= count; i++){
            if (vetItem[i].getTitulo().equalsIgnoreCase(titulo)) {
                return vetItem[i];
            }
        }
        return null;//retorna null se não encontrar
    }

    public Item buscaPorTituloBinaria(String titulo){
        int esq = 0;
        int dir = count;

        int valorMeio;

        while ( esq <= dir ) {
            valorMeio = (esq + dir) / 2;
            if ( vetItem[valorMeio].getTitulo().compareToIgnoreCase(titulo) < 0) {
                esq = valorMeio + 1;
            } else if( vetItem[valorMeio].getTitulo().compareToIgnoreCase(titulo) > 0 ) {
                dir = valorMeio - 1;
            } else {
                return vetItem[valorMeio];
            }
        }
        return null;//retorna null se não encontrar
    }
}
