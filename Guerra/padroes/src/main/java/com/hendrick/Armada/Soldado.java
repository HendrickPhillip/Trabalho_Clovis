package com.hendrick.Armada;

import com.hendrick.Exercito;
import com.hendrick.Builders.SoldadoBuilder;

public class Soldado implements SoldadoBuilder {
    private Exercito exercito = new Exercito();

    public void uniformeCombate() {
        exercito.adicionar("Roupas camuflada, capacetes.");
    }

    public void armasFogo() {
        exercito.adicionar("Rifles de assalto, metralhadoras, pistolas.");
    }

    public void equipComunicação() {
        exercito.adicionar("");
    }

    public void mochilasTransporte() {
        exercito.adicionar("");
    }

    public void equipTaticos() {
        exercito.adicionar("");
    }

    public void ferramentasCombate() {
        exercito.adicionar("");
    }

    public Exercito getSoldado() {
        return exercito;
    }
}
