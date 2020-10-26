package com.example.myhands.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myhands.R;

public class SignUpTabFragment extends Fragment {

    EditText email, name, pass, confirmpass;
    Button btnSignup;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment,container,false);
        email = root.findViewById(R.id.editEmailSignUp);
        name = root.findViewById(R.id.editUsernameSignup);
        pass = root.findViewById(R.id.editPassSignup);
        confirmpass = root.findViewById(R.id.editConfirmPassSignup);
        btnSignup = root.findViewById(R.id.btnSignup);


        return root;
    }
}