package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.mViewHolder.imageArrowback = findViewById(R.id.imageBackarrow);
        this.mViewHolder.buttonEntrar = findViewById(R.id.buttonEntrar);
        this.mViewHolder.textRegistrar = findViewById(R.id.textMember_clickable);
        this.mViewHolder.editUsername = findViewById(R.id.editUsername);
        this.mViewHolder.editPassword = findViewById(R.id.editPassword);

        this.mViewHolder.buttonEntrar.setOnClickListener(this);
        this.mViewHolder.textRegistrar.setOnClickListener(this);
        this.mViewHolder.imageArrowback.setOnClickListener(this);
        this.mViewHolder.editUsername.setOnClickListener(this);
        this.mViewHolder.editPassword.setOnClickListener(this);
    }

    private static class ViewHolder {
        Button buttonEntrar;
        TextView textRegistrar;
        ImageView imageArrowback;
        EditText editUsername;
        EditText editPassword;

    }



    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonEntrar) {
            Intent loading = new Intent(this, LoadingActivity.class);
            startActivity(loading);
        } else if (v.getId() == R.id.textMember_clickable) {
            Intent registro = new Intent(this, RegistroActivity.class);
            startActivity(registro);
        } else if (v.getId() == R.id.imageBackarrow) {
            Intent home = new Intent(this, HomeActivity.class);
            startActivity(home);
        }
    }
}
