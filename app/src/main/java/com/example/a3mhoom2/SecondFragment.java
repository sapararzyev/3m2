package com.example.a3mhoom2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SectionIndexer;
import android.widget.TextView;


public class SecondFragment extends Fragment implements View.OnClickListener {
     View rootView;
     TextView text;
     EditText editText2;
     Button button2;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_second, container, false);
        initView();
        text = rootView.findViewById(R.id.textV);

        Bundle bundle = this.getArguments();
        String myUsername = bundle.getString("user");

        text.setText(myUsername);


        return rootView;
    }

    private void initView() {
        editText2 = rootView.findViewById(R.id.et_text2);
        button2 = rootView.findViewById(R.id.btn_next2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_next2){
            Bundle bundle = new Bundle();
            String myEtText2 = editText2.getText().toString();
            bundle.putString("user1",myEtText2);
            ThirdFragment thirdFragment = new ThirdFragment();
            thirdFragment.setArguments(bundle);
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment1,thirdFragment).commit();

    }
}}
