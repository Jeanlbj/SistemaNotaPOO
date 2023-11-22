package main.java;

import main.java.model.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        // Instanciação Empresa
        Empresa empresa1 = new Empresa();
        empresa1.setId(1);
        empresa1.setCodigo(32);
        empresa1.setRazaoSocial("CES/JF");
        empresa1.setEndereco("Rua Halfed, Centro");
        empresa1.setCnpj("25.101.1231/0001-15");

        // Instanciando Nota
        Nota nota1 = new Nota();
        nota1.setId(510);
        nota1.setData(new GregorianCalendar(2023, Calendar.APRIL, 25).getTime());
        nota1.setNumero(5001);

        Nota nota2 = new Nota();
        nota2.setId(310);
        nota2.setData(new GregorianCalendar(2023, Calendar.JANUARY, 12).getTime());
        nota2.setNumero(2001);

        // Instanciando Participante
        Participante participante1 = new Participante();
        participante1.setId(12);
        participante1.setCodigo(1415);
        participante1.setRazaoSocial("Eletônicos do Murilo");
        participante1.setCnpj("25.101.1231/0001-15");

        // Instanciando ItemNota
        ItemNota item1 = new ItemNota();
        item1.setId(91);
        item1.setVrUnitario(100.00);
        item1.setQuantidade(2);

        ItemNota item2 = new ItemNota();
        item2.setId(12);
        item2.setVrUnitario(50.00);
        item2.setQuantidade(4);

        // Instanciando Produto
        Produto produto1 = new Produto();
        produto1.setId(41);
        produto1.setCodigo(213);
        produto1.setDescricao("Mouse Logitech");

        Produto produto2 = new Produto();
        produto2.setId(81);
        produto2.setCodigo(316);
        produto2.setDescricao("Maousepad");

        // Associação: Nota recebe um objeto Empresa
        nota1.setEmpresa(empresa1);
        nota2.setEmpresa(empresa1);

        // Associação: Nota recebe um objeto ItemNota
        nota1.addItensNotas(item1);
        nota2.addItensNotas(item2);

        // Associação: Nota recebe um objeto Participante
        nota1.setParticipante(participante1);
        nota2.setParticipante(participante1);

        // Associação: Participante recebe um objeto Nota
        participante1.addNota(nota1);
        participante1.addNota(nota2);

        // Associação: ItemNota recebe um objeto Nota
        item1.setNota(nota1);
        item2.setNota(nota2);

        // Associação: ItemNota recebe um objeto Produto
        item1.setProduto(produto1);
        item2.setProduto(produto2);

        // Associação: Produto recebe um objeto ItemNota
        produto1.addItenNota(item1);
        produto2.addItenNota(item2);

        // Associação: Empresa recebe um produto Nota
        empresa1.addNota(nota1);
        empresa1.addNota(nota2);

        System.out.println(empresa1);

        System.out.println();

        System.out.println(nota1);

        System.out.println();

        System.out.println(nota2);

        System.out.println();

        System.out.println(participante1);

        System.out.println();

        System.out.println(item1);

        System.out.println(item2);

        System.out.println();

        System.out.println(produto1);

        System.out.println(produto2);

    }
}
