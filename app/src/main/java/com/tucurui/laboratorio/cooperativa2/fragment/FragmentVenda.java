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

public class FragmentVenda extends Fragment {

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
        View v = inflater.inflate(R.layout.fragment_venda, container, false);


        ListView listView = v.findViewById(R.id.id_listVenda);

        List<String> list = new ArrayList<>();
        list.add("Ferro: 1kg - Data: 10/05/2018 - R$: 2,00");
        list.add("Aluminio: 15kg - Data: 10/05/2018 - R$: 4,00");
        list.add("Zinco: 16kg - Data: 10/05/2018 - R$: 2,00");
        list.add("Cobre: 17kg - Data: 10/05/2018 - R$: 20,00");
        list.add("Papelaão: 1kg - Data: 10/05/2018 - R$: 30,00");
        list.add("Vidro: 5kg - Data: 10/05/2018 - R$: 2,00");
        list.add("Cobre: 4kg - Data: 10/05/2018 - R$: 30,00");
        list.add("Ferro: 3kg - Data: 10/05/2018 - R$: 40,00");
        list.add("Zinco: 11kg - Data: 10/05/2018 - R$: 50,00");
        list.add("Ferro: 12kg - Data: 10/05/2018 - R$: 60,00");
        list.add("Ferro: 1kg - Data: 10/05/2018 - R$: 70,00");
        list.add("Ferro: 10kg - Data: 10/05/2018  - R$: 20,00");



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, R.layout.support_simple_spinner_dropdown_item, list);
        listView.setAdapter(adapter);


        return v;
    }

}
