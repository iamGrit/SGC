package com.gritlab.test2.ui.suv;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.gritlab.test2.R;
import com.gritlab.test2.SuvActivity;

public class suvFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private SuvViewModel shareViewModel;
    private String faculty;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shareViewModel =
                ViewModelProviders.of(this).get(SuvViewModel.class);
        View root = inflater.inflate(R.layout.fragment_suv, container, false);

        final DrawerLayout drawerLayout = getActivity().findViewById(R.id.main_drawer_layout);
        ImageView burger = root.findViewById(R.id.burger_suv);
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        Spinner myGroups = root.findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.my_groups, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myGroups.setAdapter(adapter);
        Spinner groups = root.findViewById(R.id.spinner2);
        groups.setAdapter(adapter);
        groups.setOnItemSelectedListener(this);

        Button goButton = root.findViewById(R.id.go_button);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SuvActivity.class);
                intent.putExtra("CLASS NAME", faculty);
                startActivity(intent);
            }
        });


        return root;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {
            case 0:
                faculty = parent.getItemAtPosition(position).toString();
                break;
            case 1:
                faculty = parent.getItemAtPosition(position).toString();
                break;
            case 2:
                faculty = parent.getItemAtPosition(position).toString();
                break;
            case 3:
                faculty = parent.getItemAtPosition(position).toString();
                break;
            case 4:
                faculty = parent.getItemAtPosition(position).toString();
                break;
            case 5:
                faculty = parent.getItemAtPosition(position).toString();
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}