package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Participante {
    private long id;
    private int codigo;
    private String razaoSocial;
    private String cnpj;
    private List<Nota> notas = new ArrayList<>();

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

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void addNota(Nota nota) {
        this.notas.add(nota);
    }

    public void removerNota(Nota nota) {
        this.notas.remove(nota);
    }

    @Override
    public String toString() {
        return  "Participante" +
                "\nID: " + id +
                "\nCódigo Participante: " + codigo +
                "\nRazão Social: " + razaoSocial +
                "\nCNPJ: " + cnpj;
    }
}
