package com.hendrick;

import java.util.LinkedList;

public class Exercito {
    private LinkedList<String> pelotaoDivisao;

    public Exercito() {
        pelotaoDivisao = new LinkedList<String>();
    }

    public void adicionar(String divisao) {
        pelotaoDivisao.addLast(divisao);
    }

    public void exibir() {
        for (int i = 0; i < pelotaoDivisao.size(); i++) {
            System.out.println(pelotaoDivisao.get(i));
        }
    }
}
