package com.hendrick.Builders;

import com.hendrick.Exercito;

public interface AereoBuilder {
    void armasFogo();

    void bombas();

    void tanquesCombustívelExternos();

    void misseisArAr();

    Exercito getAereo();
}
