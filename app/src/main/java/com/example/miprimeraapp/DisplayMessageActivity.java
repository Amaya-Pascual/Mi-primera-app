package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="com.example.miprimeraapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        //Obtiene el intent que empieza esta actividad y recoge el string
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //captura el layout del TextView de la segunda actividad y pone el string en el
        TextView textView=findViewById((R.id.textView));
        textView.setText(message);

    }
    /**Llamado cuando el usuario toca el botón Siguiente pantalla*/
    public void showSomething(ImageView imageView)
    {
        Intent intent2;
        intent2 = new Intent(this, activity_show_somethig.class);
        ImageView entry = (ImageView) findViewById(R.id.imageView);

        entry.setImageResource(R.drawable.castrourdiales);
        //String message= editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent2);

    }
}
