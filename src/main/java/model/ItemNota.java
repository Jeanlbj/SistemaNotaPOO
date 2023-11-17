package main.java.model;

public class ItemNota {
    private long id;
    private double vrUnitario;
    private double quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getVrUnitario() {
        return vrUnitario;
    }

    public void setVrUnitario(double vrUnitario) {
        this.vrUnitario = vrUnitario;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemNota{" +
                "id=" + id +
                ", vrUnitario=" + vrUnitario +
                ", quantidade=" + quantidade +
                '}';
    }
}
