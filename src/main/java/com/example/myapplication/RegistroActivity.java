package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RegistroActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        this.mViewHolder.imageArrowback = findViewById(R.id.imageBackarrow);
        this.mViewHolder.buttonRegistrar = findViewById(R.id.buttonRegistrar);
        this.mViewHolder.textEntrar = findViewById(R.id.textMember_clickable);

        this.mViewHolder.buttonRegistrar.setOnClickListener(this);
        this.mViewHolder.textEntrar.setOnClickListener(this);
        this.mViewHolder.imageArrowback.setOnClickListener(this);
    }

    private static class ViewHolder {
        Button buttonRegistrar;
        TextView textEntrar;
        ImageView imageArrowback;

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonEntrar) {
            Intent login = new Intent(this, LoginActivity.class);
            startActivity(login);
        } else if (v.getId() == R.id.textMember_clickable) {
            Intent login = new Intent(this, LoginActivity.class);
            startActivity(login);
        } else if (v.getId() == R.id.imageBackarrow) {
            Intent login = new Intent(this, LoginActivity.class);
            startActivity(login);
        }
    }


}
