package main.java.model;

public class ItemNota {
    private long id;
    private double vrUnitario;
    private double quantidade;

    private Produto produto;
    private Nota nota;

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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return  "Item Nota:" +
                "\nID: " + id +
                "\nValor Unitário: " + vrUnitario +
                "\nQuantidade: " + quantidade;
    }
}
