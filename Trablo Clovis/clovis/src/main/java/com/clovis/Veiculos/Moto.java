package com.clovis.Veiculos;

import com.clovis.Montadora;
import com.clovis.MyBuilder;

public class Moto implements MyBuilder {
    private Montadora montadora = new Montadora();

    public void montaLataria() {
        montadora.add("Lataria da Moto");
    }

    public void inserePneus() {
        montadora.add("Pneus da Moto");
    }

    public void insereFarois() {
        montadora.add("1 Farol da Moto");
    }

    public void insereTankCombustivel() {
        montadora.add("Tank Combustivel de 8 litros da Moto");
    }

    public void insereRetrovisor() {
        montadora.add("2 Retrovisores da Moto");
    }

    public Montadora getVeiculo() {
        return montadora;
    }

    public void inserePortas() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
    }

    public void insereJanelas() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
    }

    public void inserePortaMalas() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
    }
}
