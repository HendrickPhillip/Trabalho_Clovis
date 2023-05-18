package com.clovis;

import java.util.LinkedList;

public class Montadora {
    private LinkedList<String> partesVeiculo;

    public Montadora() {
        partesVeiculo = new LinkedList<String>();
    }

    public void add(String parteVeiculo) {
        partesVeiculo.addLast(parteVeiculo);
    }

    public void exibir() {
        System.out.println("\n Produto Finalizado: ");
        for (int i = 0; i < partesVeiculo.size(); i++) {
            System.out.println(partesVeiculo.get(i));
        }
    }
}
