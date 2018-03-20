package com.tucurui.laboratorio.cooperativa2.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.tucurui.laboratorio.cooperativa2.R;

import java.util.ArrayList;
import java.util.List;

import it.sephiroth.android.library.widget.HListView;

public class FragmentEstoque extends Fragment {

    private Context context;

    //captura o contexto de quem me chamou
    @Override
    public void onAttach(Context context) {
        this.context = context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_estoque, container, false);


        ListView listView = (ListView) v.findViewById(R.id.id_Historico_de_Estoque);

        List<String>list = new ArrayList<>();
        list.add("Ferro: 24kg");
        list.add("Aluminio: 12kg");
        list.add("Papelão: 5kg");
        list.add("Vidro: 0.5kg");
        list.add("Plástico: 3kg");
        list.add("Cobre: 2kg");
        list.add("Zinco: 1kg");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, R.layout.support_simple_spinner_dropdown_item, list);
        listView.setAdapter(adapter);



        return v;
    }


}
