package main.java.model;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public class Nota {
    private long id;
    private Date data;
    private int numero;
    private Empresa empresa;
    private Participante participante;
    private List<ItemNota> itensNotas = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(this.data);
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public List<ItemNota> getListaItensNotas() {
        return itensNotas;
    }

    public void addItensNotas(ItemNota itemNota) {
        this.itensNotas.add(itemNota);
    }

    public void removerItensNotas(ItemNota itemNota) {
        this.itensNotas.remove(itemNota);
    }

    private String getVrTotal() {
        double vrTotal = 0;
        for (ItemNota itemNota : itensNotas) {
            vrTotal += itemNota.getVrUnitario() * itemNota.getQuantidade();
        }
        return String.format("%.2f", vrTotal);
    }

    @Override
    public String toString() {
        return "Nota:" +
                "\nID: " + id +
                "\nData: " + this.getData() +
                "\nNúmero: " + numero +
                "\nVrTotal: " + this.getVrTotal();

    }
}
