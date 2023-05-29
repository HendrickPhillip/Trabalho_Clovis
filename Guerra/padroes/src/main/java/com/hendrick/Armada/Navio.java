package com.hendrick.Armada;

import com.hendrick.Exercito;
import com.hendrick.Builders.NavalBuilder;

public class Navio implements NavalBuilder {
    private Exercito exercito = new Exercito();

    @Override
    public void armasFogo() {
        exercito.adicionar("Armas Fogo.");
    }

    @Override
    public void misseisDefesa() {
        exercito.adicionar("Misseis Defesa.");
    }

    @Override
    public void defesaAntiaerea() {
        exercito.adicionar("Defesa Antiaerea.");
    }

    @Override
    public void sistemaSonar() {
        exercito.adicionar("Sistema Sonar.");
    }

    @Override
    public Exercito getNaval() {
        return exercito;
    }

}
