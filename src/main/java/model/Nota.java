package main.java.model;

import java.util.Date;

public class Nota {
    private long id;
    private Date data;
    private int numero;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "id=" + id +
                ", data=" + data +
                ", numero=" + numero +
                '}';
    }
}
