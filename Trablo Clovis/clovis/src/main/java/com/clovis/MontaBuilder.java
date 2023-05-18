package com.clovis;

//Director
public class MontaBuilder {

    public static void main(String[] args) {
        Pecas pecas = new Pecas();
        MyBuilder motoBuilder = new Moto();

        pecas.montar(motoBuilder);
        Montadora veiMoto = motoBuilder.getVeiculo();
        veiMoto.exibir();
    }
}
