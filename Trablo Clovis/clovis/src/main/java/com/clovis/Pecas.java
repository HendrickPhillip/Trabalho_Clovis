package com.clovis;

import java.lang.module.ModuleDescriptor.Builder;

public class Pecas {
    Builder meuBuilder;

    public void montar(Builder builder) {
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
