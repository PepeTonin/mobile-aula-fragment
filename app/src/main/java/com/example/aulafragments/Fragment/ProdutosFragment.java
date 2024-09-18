package com.example.aulafragments.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.aulafragments.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProdutosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProdutosFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ListView listProdutos;
    private String[] produtos = {"Geladeira", "Fogão", "Micro-ondas", "Máquina de Lavar", "Aspirador de Pó", "Liquidificador", "Batedeira", "Ferro de Passar", "Ventilador", "Cafeteira", "Arroz", "Feijão", "Macarrão", "Óleo de Soja", "Açúcar", "Sal", "Café", "Leite", "Farinha de Trigo", "Manteiga", "Geladeira", "Fogão", "Micro-ondas", "Máquina de Lavar", "Aspirador de Pó", "Liquidificador", "Batedeira", "Ferro de Passar", "Ventilador", "Cafeteira", "Panela", "Talheres", "Pratos", "Copos", "Toalha de Mesa"};

    public ProdutosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ConversasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProdutosFragment newInstance(String param1, String param2) {
        ProdutosFragment fragment = new ProdutosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_produtos, container, false);

        listProdutos = view.findViewById(R.id.listProdutos);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                container.getContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                produtos
        );

        listProdutos.setAdapter(adapter);

        return view;
    }
}