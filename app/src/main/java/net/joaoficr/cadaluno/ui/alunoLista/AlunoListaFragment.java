package net.joaoficr.cadaluno.ui.alunoLista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import net.joaoficr.cadaluno.R;
import net.joaoficr.cadaluno.entity.AlunoEntity;

import java.util.List;

public class AlunoListaFragment extends Fragment {

    private AlunoListaViewModel model;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        model =
                ViewModelProviders.of(this).get(AlunoListaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_aluno_lista, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        model.getLista().observe(getViewLifecycleOwner(), new Observer<List<AlunoEntity>>() {
            @Override
            public void onChanged(@Nullable List<AlunoEntity> lista) {
                //textView.setText(s);
            }
        });
        return root;
    }
}
