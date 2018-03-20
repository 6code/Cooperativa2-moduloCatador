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

public class FragmentEntrega extends Fragment {

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
        View v = inflater.inflate(R.layout.fragment_entrega, container, false);


        ListView listView = (ListView) v.findViewById(R.id.id_list_entrega);

        List<String> list2 = new ArrayList<>();
        list2.add("Ferro: 1kg - Data: 10/05/2018");
        list2.add("Aluminio: 15kg - Data: 10/05/2018");
        list2.add("Zinco: 16kg - Data: 10/05/2018");
        list2.add("Cobre: 17kg - Data: 10/05/2018");
        list2.add("Papelaão: 1kg - Data: 10/05/2018");
        list2.add("Vidro: 5kg - Data: 10/05/2018");
        list2.add("Cobre: 4kg - Data: 10/05/2018");
        list2.add("Ferro: 3kg - Data: 10/05/2018");
        list2.add("Zinco: 11kg - Data: 10/05/20180");
        list2.add("Ferro: 12kg - Data: 10/05/2018");
        list2.add("Ferro: 1kg - Data: 10/05/2018");
        list2.add("Ferro: 10kg - Data: 10/05/2018");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(context, R.layout.support_simple_spinner_dropdown_item, list2);
        listView.setAdapter(adapter2);



        return v;
    }


}
