package com.clovis.Veiculos;

import com.clovis.Montadora;
import com.clovis.MyBuilder;

public class Carro implements MyBuilder {
    private Montadora montadora = new Montadora();

    public void montaLataria() {
        montadora.add("Lataria do Carro");
    }

    public void inserePneus() {
        montadora.add("4 Pneus do Carro");
    }

    public void insereFarois() {
        montadora.add("2 Farois do Carro");
    }

    public void insereTankCombustivel() {
        montadora.add("Tank Combustivel de 18 litros do Carro");
    }

    public void insereRetrovisor() {
        montadora.add("2 Retrovisores do Carro");
    }

    public void inserePortas() {
        montadora.add("4 Portas do Carro");
    }

    public void insereJanelas() {
        montadora.add("4 Janelas do Carro");
    }

    public void inserePortaMalas() {
        montadora.add("Porta malas de 285 litros do Carro");
    }

    public Montadora getVeiculo() {
        return montadora;
    }
}
