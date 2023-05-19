package com.clovis.Facade;

public class veiculoFacade {
    private Chave chave = null;
    private Gps gps = null;
    private Farois farois = null;

    int ADDRESS = 1;
    int SIZE = 1;
    int SECTOR = 0;

    public veiculoFacade(Chave chave, Gps gps, Farois farois) {
        this.chave = chave;
        this.gps = gps;
        this.farois = farois;
    }

    public void ligarVeiculor() {
        Chave CHAVE = new Chave();
        CHAVE.iniciar();
        Gps GPS = new Gps();
        String caminho = GPS.lendo(SECTOR, SIZE);
        Farois FAROIS = new Farois();
        FAROIS.ligandoFarois(ADDRESS, caminho);
        CHAVE.ligandoMotor();
        FAROIS.prontoFarois(ADDRESS, caminho);
        CHAVE.pronto();
    }
}
