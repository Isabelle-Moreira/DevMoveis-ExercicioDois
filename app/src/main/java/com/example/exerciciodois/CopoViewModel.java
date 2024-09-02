package com.example.exerciciodois;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CopoViewModel extends ViewModel {
    private MutableLiveData<Integer> imagemCopo;
    private final int volumeMl;
    private boolean bebido;

    public CopoViewModel(int volumeMl) {
        this.volumeMl = volumeMl;
        this.bebido = false;
        imagemCopo = new MutableLiveData<>(R.drawable.copo_cheio);
    }

    public LiveData<Integer> getImagemCopo() {
        return imagemCopo;
    }

    public String getVolume() {
        return volumeMl + " ml";
    }

    public boolean isBebido() {
        return bebido;
    }

    public void beber() {
        this.bebido = true;
        imagemCopo.setValue(R.drawable.copo_vazio);
    }

    public void desfazer() {
        this.bebido = false;
        imagemCopo.setValue(R.drawable.copo_cheio);
    }
}