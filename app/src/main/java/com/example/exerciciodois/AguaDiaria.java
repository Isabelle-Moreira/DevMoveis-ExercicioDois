package com.example.exerciciodois;

import java.util.ArrayList;
import java.util.List;

public class AguaDiaria {
    private List<Copo> copos;
    private int volumeCopoMl;

    public AguaDiaria(int peso, int volumeCopoMl) {
        this.volumeCopoMl = volumeCopoMl;
        calcularMeta(peso);
    }

    private void calcularMeta(int peso) {
        int totalMl = peso * 35;
        int numCopos = (int) Math.ceil((double) totalMl / volumeCopoMl);
        copos = new ArrayList<>();
        for (int i = 0; i < numCopos; i++) {
            copos.add(new Copo(volumeCopoMl));
        }
    }

    public List<Copo> getCopos() {
        return copos;
    }

    public float mlBebidosAteAgora() {
        float mlBebidos = 0;
        for (Copo copo : copos) {
            if (!copo.isCheio()) {
                mlBebidos += copo.getVolumeMl();
            }
        }
        return mlBebidos;
    }
    public float totalMl() {
        float totalMl = 0;
        for (Copo copo : copos) {
            totalMl += copo.getVolumeMl();
        }
        return totalMl;
    }

}