package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    Button siguiente;
    //public static final String EXTRA_MESSAGE ="com.example.miprimeraapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        siguiente=(Button)findViewById(R.id.siguientepantalla);
        siguiente.setOnClickListener(new View.OnClickListener() {

            public void sgtepantalla(View v) {
                Intent siguiente =new Intent(DisplayMessageActivity.this,activity_show_somethig.class);
                startActivity(siguiente);
            }
        });
    }

    /**Llamado cuando el usuario toca el botón
    public void sgtepantalla(View view)
    {
        Intent intent;
        intent = new Intent(this, activity_show_somethig.class);
        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.imagen01);
        startActivity(intent);
    }*/
}
