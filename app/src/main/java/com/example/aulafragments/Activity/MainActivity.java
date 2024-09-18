package com.example.aulafragments.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aulafragments.Fragment.LojasFragment;
import com.example.aulafragments.Fragment.ProdutosFragment;
import com.example.aulafragments.R;

public class MainActivity extends AppCompatActivity {

    private Button btnProdutos, btnLojas;
    private ProdutosFragment produtosFragment;
    private LojasFragment lojasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProdutos = findViewById(R.id.btnProdutos);
        btnLojas = findViewById(R.id.btnLojas);

        produtosFragment = new ProdutosFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameConteudo, produtosFragment);
        transaction.commit();

        btnLojas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lojasFragment = new LojasFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, lojasFragment);
                transaction.commit();
            }
        });

        btnProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                produtosFragment = new ProdutosFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, produtosFragment);
                transaction.commit();
            }
        });




    }
}