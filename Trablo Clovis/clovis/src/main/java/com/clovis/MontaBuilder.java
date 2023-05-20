package com.clovis;

import java.util.Scanner;

import com.clovis.Facade.veiculoFacade;
import com.clovis.Veiculos.Caminhao;
import com.clovis.Veiculos.Carro;
import com.clovis.Veiculos.Moto;

//Builder implementa os veiculos

public class MontaBuilder {

    public static void main(String[] args) {
        Pecas pecas = new Pecas();
        MyBuilder motoBuilder = new Moto();
        MyBuilder carroBuilder = new Carro();
        MyBuilder caminhaoBuilder = new Caminhao();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual veiculo dejesa montar?");
        System.out.println("1 - Moto");
        System.out.println("2 - Carro");
        System.out.println("3 - Caminhão");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                pecas.montar(motoBuilder);
                Montadora veiMoto = motoBuilder.getVeiculo();
                veiMoto.exibir();
                break;
            case 2:
                pecas.montar(carroBuilder);
                Montadora veiCarro = carroBuilder.getVeiculo();
                veiCarro.exibir();
                break;
            case 3:
                pecas.montar(caminhaoBuilder);
                Montadora veiCaminhao = caminhaoBuilder.getVeiculo();
                veiCaminhao.exibir();
                break;
            default:
                System.out.println("Veiculo inexistente");
                break;
        }
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Deseja ligar o veiculo ?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        int opcao2 = scanner.nextInt();
        switch (opcao2) {
            case 1:
                veiculoFacade ligar = new veiculoFacade(null, null, null);
                ligar.ligarVeiculor();
                break;
            case 2:
                System.out.println("\nVeiculo está desligado");
                break;
            default:
                System.out.println("\nVeiculo Explodiu \\(°0°)/");
                break;
        }

    }
}
