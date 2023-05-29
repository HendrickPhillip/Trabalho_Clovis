package com.hendrick.Builders;

import com.hendrick.Exercito;

public interface NavalBuilder {
    void armasFogo();

    void misseisDefesa();

    void defesaAntiaerea();

    void sistemaSonar();

    Exercito getNaval();
}
