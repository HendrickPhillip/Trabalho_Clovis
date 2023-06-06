package com.hendrick.Builders;

public class ListBuilders {
    SoldadoBuilder soldadoBuilder;
    NavalBuilder navalBuilder;
    AereoBuilder aereoBuilder;
    TerrestreBuilder terrestreBuilder;

    public void montSold(SoldadoBuilder sBuilder) {
        // Aqui é onde o padrão Singleton é aplicado
        if (navalBuilder == null) {
            System.out.println("Instância criada.");
            soldadoBuilder = sBuilder;
            soldadoBuilder.uniformeCombate();
            soldadoBuilder.armasFogo();
            soldadoBuilder.equipComunicação();
            soldadoBuilder.mochilasTransporte();
            soldadoBuilder.equipTaticos();
            soldadoBuilder.ferramentasCombate();
        } else {
            System.out.println("Instância já existente.");
        }

    }

    public void montNaval(NavalBuilder nBuilder) {
        // Aqui é onde o padrão Singleton é aplicado
        if (navalBuilder == null) {
            System.out.println("Instância criada.");
            navalBuilder = nBuilder;
            navalBuilder.armasFogo();
            navalBuilder.misseisDefesa();
            navalBuilder.defesaAntiaerea();
            navalBuilder.sistemaSonar();
        } else {
            System.out.println("Instância já existente.");
        }

    }

    public void montAreo(AereoBuilder aBuilder) {
        // Aqui é onde o padrão Singleton é aplicado
        if (navalBuilder == null) {
            System.out.println("Instância criada.");
            aereoBuilder = aBuilder;
            aereoBuilder.armasFogo();
            aereoBuilder.bombas();
            aereoBuilder.misseisArAr();
            aereoBuilder.tanquesCombustívelExternos();
        } else {
            System.out.println("Instância já existente.");
        }

    }

    public void montTank(TerrestreBuilder tBuilder) {
        // Aqui é onde o padrão Singleton é aplicado
        if (navalBuilder == null) {
            System.out.println("Instância criada.");
            terrestreBuilder = tBuilder;
            terrestreBuilder.blindagem();
            terrestreBuilder.canhaoPrincipal();
            terrestreBuilder.metralhadoras();
            terrestreBuilder.misseis();
        } else {
            System.out.println("Instância já existente.");
        }

    }


}
