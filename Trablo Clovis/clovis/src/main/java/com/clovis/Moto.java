package com.clovis;

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
        montadora.add("Tank Combustivel de 18 litros da Moto");
    }

    public void insereRetrovisor() {
        montadora.add("2 Retrovisores da Moto");
    }

    public Montadora getVeiculo() {
        return montadora;
    }

}
