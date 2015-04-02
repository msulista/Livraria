package model;

/**
 * Created by marcus.rodrigues on 02/04/2015.
 */
public class Item {

    private String departamento;

    public Item(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
