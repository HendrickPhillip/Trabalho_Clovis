package com.hendrick.Armada;

import com.hendrick.Exercito;
import com.hendrick.Builders.TerrestreBuilder;

public class Tank implements TerrestreBuilder {
    private Exercito exercito = new Exercito();

    @Override
    public void blindagem() {
        exercito.adicionar("Blindagem.");
    }

    @Override
    public void canhaoPrincipal() {
        exercito.adicionar("Canhão Principal.");
    }

    @Override
    public void metralhadoras() {
        exercito.adicionar("Metralhadoras.");
    }

    @Override
    public void misseis() {
        exercito.adicionar("Misseis.");
    }

    @Override
    public Exercito getTank() {
        return exercito;
    }

}
