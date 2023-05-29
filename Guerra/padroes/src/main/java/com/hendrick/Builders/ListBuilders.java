package com.hendrick.Builders;

public class ListBuilders {
    SoldadoBuilder soldadoBuilder;
    NavalBuilder navalBuilder;
    AereoBuilder aereoBuilder;
    TerrestreBuilder terrestreBuilder;

    public void montSold(SoldadoBuilder sBuilder) {
        soldadoBuilder = sBuilder;
        soldadoBuilder.uniformeCombate();
        soldadoBuilder.armasFogo();
        soldadoBuilder.equipComunicação();
        soldadoBuilder.mochilasTransporte();
        soldadoBuilder.equipTaticos();
        soldadoBuilder.ferramentasCombate();
    }

    public void montNaval(NavalBuilder nBuilder) {
        navalBuilder = nBuilder;
        navalBuilder.armasFogo();
        navalBuilder.misseisDefesa();
        navalBuilder.defesaAntiaerea();
        navalBuilder.sistemaSonar();

    }

    public void montAreo(AereoBuilder aBuilder) {
        aereoBuilder = aBuilder;
        aereoBuilder.armasFogo();
        aereoBuilder.bombas();
        aereoBuilder.misseisArAr();
        aereoBuilder.tanquesCombustívelExternos();
    }

    public void montTank(TerrestreBuilder tBuilder) {
        terrestreBuilder = tBuilder;
        terrestreBuilder.blindagem();
        terrestreBuilder.canhaoPrincipal();
        terrestreBuilder.metralhadoras();
        terrestreBuilder.misseis();
    }

}
