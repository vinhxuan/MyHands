package com.example.myhands.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myhands.R;

public class LoginTabFragment extends Fragment {

    EditText username,password;
    TextView forgotpass;
    Button btnLogin;
    float v = 0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);

        username = root.findViewById(R.id.editUsernameSignup);
        password = root.findViewById(R.id.editPassword);
        forgotpass = root.findViewById(R.id.txtForgotPass);
        btnLogin = root.findViewById(R.id.btnSignup);

        username.setTranslationX(800);
        password.setTranslationX(800);
        forgotpass.setTranslationX(800);
        btnLogin.setTranslationX(800);

        username.setAlpha(v);
        password.setAlpha(v);
        forgotpass.setAlpha(v);
        btnLogin.setAlpha(v);

        username.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgotpass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        btnLogin.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();




        return root;
    }
}
