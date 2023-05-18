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

    // Métodos da interface não utilizados

    public void inserePortas() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'inserePortas'");
    }

    public void insereJanelas() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'insereJanelas'");
    }

    public void inserePortaMalas() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'inserePortaMalas'");
    }

}
