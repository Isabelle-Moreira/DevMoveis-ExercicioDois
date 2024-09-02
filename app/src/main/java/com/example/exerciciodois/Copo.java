package com.example.exerciciodois;

public class Copo {
    private int volumeMl;
    private boolean cheio;

    public Copo(int volumeMl) {
        this.volumeMl = volumeMl;
        this.cheio = true;
    }

    public boolean isCheio() {
        return cheio;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public void beber() {
        this.cheio = false;
    }

    public void desfazer() {
        this.cheio = true;
    }
}