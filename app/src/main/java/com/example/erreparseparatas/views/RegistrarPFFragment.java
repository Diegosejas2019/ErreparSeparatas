package com.example.erreparseparatas.views;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.erreparseparatas.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class RegistrarPFFragment extends Fragment {

    @BindView(R.id.btnRegister)
    Button mContinuar;

    private static final String ARG_PARAM1 = "email";
    private static final String ARG_PARAM2 = "password";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public RegistrarPFFragment() {
        // Required empty public constructor
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
        View view = inflater.inflate(R.layout.fragment_registrar_p_f, container, false);

        ButterKnife.bind(this,view);


        mContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*CodesFragment nextFrag= new CodesFragment();
                Bundle bundle=new Bundle();
                bundle.putString("idUser", mParam1);
                bundle.putString("Password", mParam2);
                nextFrag.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();*/
            }
        });

        return view;
    }
}