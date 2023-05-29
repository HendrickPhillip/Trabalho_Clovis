package com.hendrick.Builders;

import com.hendrick.Exercito;

public interface SoldadoBuilder {
    void uniformeCombate();

    void armasFogo();

    void equipComunicação();

    void mochilasTransporte();

    void equipTaticos();

    void ferramentasCombate();

    Exercito getSoldado();
}
