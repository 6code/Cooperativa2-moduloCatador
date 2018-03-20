package com.tucurui.laboratorio.cooperativa2;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.tucurui.laboratorio.cooperativa2.fragment.FragmentEntrega;
import com.tucurui.laboratorio.cooperativa2.fragment.FragmentPagamento;
import com.tucurui.laboratorio.cooperativa2.fragment.FragmentPageAdapter;
import com.tucurui.laboratorio.cooperativa2.fragment.FragmentVenda;


public class TabActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        //recupero pelo id
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);

        FragmentPageAdapter adapter = new FragmentPageAdapter(getSupportFragmentManager());

        //adiciono meu fragments no adpter
        adapter.addFragment(new FragmentEntrega(), "Entrega");
        adapter.addFragment(new FragmentVenda(), "Venda");
        adapter.addFragment(new FragmentPagamento(), "Pagamento");

        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);

        mTabLayout.getTabAt(0).setIcon(R.drawable.estoque);
        mTabLayout.getTabAt(1).setIcon(R.drawable.a);
        mTabLayout.getTabAt(2).setIcon(R.drawable.money);

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.mover_esquerda,R.anim.saida);
    }
}
