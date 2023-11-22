package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private long id;
    private int codigo;
    private String descricao;
    private List<ItemNota> itensNota = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ItemNota> getItensNota() {
        return itensNota;
    }

    public void addItenNota(ItemNota itemNota) {
        this.itensNota.add(itemNota);
    }

    public void removerItenNota(ItemNota itemNota) {
        this.itensNota.remove(itemNota);
    }

    @Override
    public String toString() {
        return  "Produto:" +
                "\nID: " + id +
                "\nCódigo: " + codigo +
                "\nDescrição: " + descricao;
    }
}
