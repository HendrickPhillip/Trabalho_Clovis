package com.clovis;

public class Pecas {
    MyBuilder meuBuilder;

    public void montar(MyBuilder builder) {
        meuBuilder = builder;
        meuBuilder.montaLataria();
        meuBuilder.inserePneus();
        meuBuilder.insereFarois();
        meuBuilder.inserePortas();
        meuBuilder.insereJanelas();
        meuBuilder.inserePortaMalas();
        meuBuilder.insereRetrovisor();
        meuBuilder.insereTankCombustivel();

    }
}
