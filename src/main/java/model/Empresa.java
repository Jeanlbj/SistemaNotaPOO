package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private long id;
    private int codigo;
    private String razaoSocial;
    private String endereco;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
        return  "Empresa:" +
                "\nID Empresa: " + id +
                "\nCódigo: " + codigo +
                "\nRazão Social: " + razaoSocial +
                "\nEndereço: " + endereco +
                "\nCNPJ: " + cnpj;
    }
}


