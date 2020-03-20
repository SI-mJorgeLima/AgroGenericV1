package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.mViewHolder.buttonEntrar = findViewById(R.id.buttonEntrar);
        this.mViewHolder.textRegistrar = findViewById(R.id.textMember_clickable);

        this.mViewHolder.buttonEntrar.setOnClickListener(this);
        this.mViewHolder.textRegistrar.setOnClickListener(this);


    }

    private static class ViewHolder {
        Button buttonEntrar;
        TextView textRegistrar;

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonEntrar) {
            Intent login_page = new Intent(this, LoginActivity.class);
            startActivity(login_page);
        } else if (v.getId() == R.id.textMember_clickable) {
            Intent registro = new Intent(this, RegistroActivity.class);
            startActivity(registro);
        }
    }



}



