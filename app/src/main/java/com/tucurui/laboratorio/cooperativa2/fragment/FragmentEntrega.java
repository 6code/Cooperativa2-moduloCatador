package com.tucurui.laboratorio.cooperativa2.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.tucurui.laboratorio.cooperativa2.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentEntrega extends Fragment {

    private Context context;
    private AlertDialog alert;

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


        ListView listView = v.findViewById(R.id.s);

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

        Button btn = v.findViewById(R.id.id_btn_verEstoque);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alert();
            }
        });


        return v;
    }


    public void alert() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.fragment_estoque, null);

        ListView listView = view.findViewById(R.id.id_Historico_de_Estoque);

        List<String> list = new ArrayList<>();
        list.add("Ferro - 10kg");
        list.add("Aluminio- 20kg");
        list.add("Papelão - 30kg");
        list.add("Plśtico - 40kg");
        list.add("Cobre - 20kg");
        list.add("Zinco - 2kg");
        list.add("Vidro - 1kg");
        list.add("exemplo - 3kg");
        list.add("exemplo - 4kg");
        list.add("exemplo - 0.5 kg");
        list.add("exemplo - 1.2kg");
        list.add("exemplo - 3.5kg");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, R.layout.support_simple_spinner_dropdown_item, list);
        listView.setAdapter(adapter);

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Meu estoque: ");
        builder.setView(view);
        alert = builder.create();
        alert.show();

    }


}
