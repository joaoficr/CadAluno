package net.joaoficr.cadaluno.ui.alunoLista;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import net.joaoficr.cadaluno.entity.AlunoEntity;

import java.util.List;

public class AlunoListaViewModel extends ViewModel {

    private MutableLiveData<List<AlunoEntity>> lista;

    public AlunoListaViewModel() {
        lista = new MutableLiveData<>();
    }

    public LiveData<List<AlunoEntity>> getLista() {
        return lista;
    }
}