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

public class FragmentPagamento extends Fragment {

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
        View v = inflater.inflate(R.layout.fragment_pagamento, container, false);


        ListView listView = (ListView) v.findViewById(R.id.id_listPagamento);

        List<String> list = new ArrayList<>();
        list.add("Data: 10/05/2018 - Hora: 10:12 - R$: 20,00");
        list.add("Data: 20/06/2018 - Hora: 11:14- R$: 40,00");
        list.add("Data: 30/07/2018 - Hora: 12:15 - R$: 50,00");
        list.add("Data: 10/08/2018 - Hora: 13:57 - R$: 60,00");
        list.add("Data: 12/09/2018 - Hora: 14:15 - R$: 70,00");
        list.add("Data: 13/10/2018 - Hora: 15:45 - R$: 80,00");
        list.add("Data: 14/11/2018 - Hora: 16:35 - R$: 90,00");
        list.add("Data: 15/12/2018 - Hora: 17:55 - R$: 220,00");
        list.add("Data: 16/13/2018 - Hora: 18:25 - R$: 320,00");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, R.layout.support_simple_spinner_dropdown_item, list);
        listView.setAdapter(adapter);


        return v;
    }


}
