package com.hendrick;

import java.util.Random;

import com.hendrick.Armada.Aviao;
import com.hendrick.Armada.Navio;
import com.hendrick.Armada.Soldado;
import com.hendrick.Armada.Tank;
import com.hendrick.Builders.AereoBuilder;
import com.hendrick.Builders.ListBuilders;
import com.hendrick.Builders.NavalBuilder;
import com.hendrick.Builders.SoldadoBuilder;
import com.hendrick.Builders.TerrestreBuilder;

public final class Guerra {

    public static void main(String[] args) {

        ListBuilders listBuilders = new ListBuilders();
        SoldadoBuilder soldado = new Soldado();
        AereoBuilder aviao = new Aviao();
        NavalBuilder navio = new Navio();
        TerrestreBuilder tank = new Tank();

        Random random = new Random();
        int soldQnt = random.nextInt(20000);
        int tankQnt = random.nextInt(440);
        int navQnt = random.nextInt(90);
        int avQnt = random.nextInt(120);
        int soldQntI = random.nextInt(20000);
        int tankQntI = random.nextInt(440);
        int navQntI = random.nextInt(90);
        int avQntI = random.nextInt(120);

        System.out.println("xxxxxxx INFANTARIA xxxxxxx");
        listBuilders.montSold(soldado);
        Exercito sold = soldado.getSoldado();
        sold.exibir();
        System.out.println("xxxxxxxxxxxxxx\n");

        System.out.println("xxxxxxx ESQUADRILHA xxxxxxx");
        listBuilders.montAreo(aviao);
        Exercito av = aviao.getAereo();
        av.exibir();
        System.out.println("xxxxxxxxxxxxxx\n");

        System.out.println("xxxxxxx FROTA xxxxxxx");
        listBuilders.montNaval(navio);
        Exercito nav = navio.getNaval();
        nav.exibir();
        System.out.println("xxxxxxxxxxxxxx\n");

        System.out.println("xxxxxxx TANKS xxxxxxx");
        listBuilders.montTank(tank);
        Exercito tan = tank.getTank();
        tan.exibir();
        System.out.println("xxxxxxxxxxxxxx\n");

        System.out.println("Seu exercito");
        System.out.println("Soldados: " + soldQnt);
        System.out.println("Tanks: " + tankQnt);
        System.out.println("Navios: " + navQnt);
        System.out.println("Aviões: " + avQnt);

        System.out.println("\nExercito inimigo");
        System.out.println("Soldados: " + soldQntI);
        System.out.println("Tanks: " + tankQntI);
        System.out.println("Navios: " + navQntI);
        System.out.println("Aviões: " + avQntI);
    }

}
