package com.clovis.Veiculos;

import com.clovis.Montadora;
import com.clovis.MyBuilder;

public class Caminhao implements MyBuilder {
    private Montadora montadora = new Montadora();

    public void montaLataria() {
        montadora.add("Lataria do Caminhão");
    }

    public void inserePneus() {
        montadora.add("6 Pneus do Caminhão");
    }

    public void insereFarois() {
        montadora.add("4 Farois do Caminhão");
    }

    public void insereTankCombustivel() {
        montadora.add("Tank Combustivel de 30 litros do Caminhão");
    }

    public void insereRetrovisor() {
        montadora.add("2 Retrovisores do Caminhão");
    }

    public void inserePortas() {
        montadora.add("2 Portas do Caminhão");
    }

    public void insereJanelas() {
        montadora.add("2 Janelas do Caminhão");
    }

    public void inserePortaMalas() {
        // Não tem
    }

    public Montadora getVeiculo() {
        return montadora;
    }
}
