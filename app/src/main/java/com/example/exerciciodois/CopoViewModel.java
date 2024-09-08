package com.example.exerciciodois;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CopoViewModel extends ViewModel {
    private MutableLiveData<Integer> imagemCopo;
    private Copo copoobje;
    private boolean bebido;
    public CopoViewModel(Copo copoobje) {
        this.bebido = false;
        this.copoobje = copoobje;
        imagemCopo = new MutableLiveData<>(R.drawable.copo_cheio);
    }

    public void alternarEstadoCopo() {
        bebido = !bebido; // Inverte o estado atual
        atualizarImagemCopo();
    }

    public void atualizarImagemCopo() {
        imagemCopo.setValue(bebido ? R.drawable.copo_vazio : R.drawable.copo_cheio);
    }


    public LiveData<Integer> getImagemCopo() {
        return imagemCopo;
    }

    public String getVolume() {
        return copoobje.getVolumeMl() + " ml";
    }

    public boolean isBebido() {
        return bebido;
    }

    public void beber() {
        this.bebido = true;
        copoobje.setCheio(false);
        imagemCopo.setValue(R.drawable.copo_vazio);
    }

    public void desfazer() {
        this.bebido = false;
        copoobje.setCheio(true);
        imagemCopo.setValue(R.drawable.copo_cheio);
    }
}