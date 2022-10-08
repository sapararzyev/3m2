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

public class MainFragment extends Fragment implements View.OnClickListener {
    View rootView;
    EditText editText;
    Button btnNext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        initview();
        return rootView;

    }

    private void initview() {
       editText = rootView.findViewById(R.id.et_Text);
       btnNext = rootView.findViewById(R.id.btn_next);
       btnNext.setOnClickListener(this);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


            }

    @Override
    public void onClick(View v) {
  if (v.getId()==R.id.btn_next){
      Bundle bundle = new Bundle();
      String myEtText = editText.getText().toString();
      bundle.putString("user",myEtText);
      SecondFragment secondFragment = new SecondFragment();
      secondFragment.setArguments(bundle);
      getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment1,secondFragment).commit();
  }
    }
}