package model;

/**
 * Created by marcus.rodrigues on 29/04/2015.
 */
public class Estoque {

    Item[] vetItem;
    int count;

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
        moveItens(indice);
        vetItem[indice] = item;
        count++;
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
}
