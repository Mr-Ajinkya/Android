package com.example.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {


    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_menu, container, false);
        final ListView listView = ((ListView) rootView.findViewById(R.id.listView));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                loadFragment(""+listView.getAdapter().getItem(i));
            }
        });
        return rootView;

    }

    private void loadFragment(String s) {
        MainActivity hostActivity = (MainActivity) getActivity();

        if(s.equals("ic_robo")) hostActivity.loadFragment(R.drawable.ic_robo);
        else if(s.equals("ic_roboto_Logo")) hostActivity.loadFragment(R.drawable.ic_roboto_logo);
        else hostActivity.loadFragment(R.drawable.ic_robot);

    }


}
