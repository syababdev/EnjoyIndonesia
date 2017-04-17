package com.zarslamgants25.enjoyindonesia.Popular;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zarslamgants25.enjoyindonesia.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Popular extends Fragment {

    private RecyclerView recyclerViewPopular;
    private RecyclerView.Adapter adapterPopular;
    private List<ListPopular> listPopular;

    public Popular() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_popular, container, false);
        // Inflate the layout for this fragment

        recyclerViewPopular = (RecyclerView)view.findViewById(R.id.recycler_popular);
        recyclerViewPopular.setHasFixedSize(true);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(getActivity()));

        listPopular = new ArrayList<>(  );


        return view ;
    }

}
