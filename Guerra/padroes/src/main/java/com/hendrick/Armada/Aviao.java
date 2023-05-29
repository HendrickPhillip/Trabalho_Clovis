package com.hendrick.Armada;

import com.hendrick.Exercito;
import com.hendrick.Builders.AereoBuilder;

public class Aviao implements AereoBuilder {
    private Exercito exercito = new Exercito();

    public void armasFogo() {
        exercito.adicionar("Metralhadoras e sistemas de artilharia.");
    }

    public void bombas() {
        exercito.adicionar("Bombas guiadas a laser, bombas de penetração e bombas de alta precisão.");
    }

    public void tanquesCombustívelExternos() {
        exercito.adicionar("Tanques de combustível externos.");
    }

    public void misseisArAr() {
        exercito.adicionar("Misseis orientação infravermelha.");
    }

    public Exercito getAereo() {
        return exercito;
    }

}
