package com.example.primeractividad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private Button _btnsumar;
    private TextView _numeromostrar;
    private int _valores, _resultado;
    private int _reseteo=0;
    private Button _btnrestar;
    private Button _btnzoommas;
    private Button _btnzoommenos;
    private Button _btnresetear;
    private Button _btnocultar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _btnsumar=(Button)findViewById(R.id.sumar);
        _numeromostrar=findViewById(R.id.textView);

        _btnrestar=(Button)findViewById(R.id.restar);
        _btnzoommas=(Button)findViewById(R.id.zoommas);
        _btnzoommenos=(Button)findViewById(R.id.zoommenos);
        _btnresetear=(Button)findViewById(R.id.reset);
        _btnocultar=(Button)findViewById(R.id.ocultar);

        _btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                _valores = Integer.parseInt(_numeromostrar.getText().toString());
                _resultado = _valores + 1;
                _numeromostrar.setText(Integer.toString(_resultado));


            }
        });
        _btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _valores = Integer.parseInt(_numeromostrar.getText().toString());
                _resultado = _valores - 1;
                _numeromostrar.setText(Integer.toString(_resultado));
            }
        });
        _btnresetear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _valores = Integer.parseInt(_numeromostrar.getText().toString());
                _numeromostrar.setText(Integer.toString(_reseteo));
            }
        });


    }



}
