package com.example.primeractividad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Conversor extends AppCompatActivity {
    private RadioButton _rDolar, _rEuro, _rReal;
    private Button btn_Convertir, btn_Reiniciar;
    private EditText txt_Monto;
    private TextView tv_Resultado;
    private Double _monto, _respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);

        _rDolar = (RadioButton) findViewById(R.id.rDolar);
        _rEuro = (RadioButton) findViewById(R.id.rEuro);
        _rReal = (RadioButton) findViewById(R.id.rReal);
        btn_Convertir = (Button) findViewById(R.id.btnConvertir);
        btn_Reiniciar = (Button) findViewById(R.id.btnReiniciar);
        txt_Monto = (EditText) findViewById(R.id.txtMonto);
        tv_Resultado = (TextView) findViewById(R.id.tvResultado);

        btn_Convertir.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String _ingreso = txt_Monto.getText().toString().replace(',', '.');
                String _moneda = "";
                if(! _ingreso.isEmpty()) {
                    _monto = Double.parseDouble(_ingreso);

                    if (_rDolar.isChecked()) {
                        Toast.makeText(Conversor.this, "Dolar", Toast.LENGTH_SHORT).show();
                        _respuesta = _monto / 153;
                        _moneda = " U$S";
                    }

                    if (_rEuro.isChecked()) {
                        Toast.makeText(Conversor.this, "Euro", Toast.LENGTH_SHORT).show();
                        _respuesta = _monto / 183;
                        _moneda = " €";
                    }

                    if (_rReal.isChecked()) {
                        Toast.makeText(Conversor.this, "Real", Toast.LENGTH_SHORT).show();
                        _respuesta = _monto / 13;
                        _moneda = " R$";
                    }

                    _ingreso = _respuesta.toString() + _moneda;
                    //String.format("%.2f", resultadofinal);
                    tv_Resultado.setText(String.format("%.3f" + _moneda, _respuesta).replace('.', ','));
                    //tv_Resultado.setText(_ingreso);
                    //tv_Resultado.setText(_respuesta.toString());
                }

            }
        });

        btn_Reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Monto.setText("");
                tv_Resultado.setText("");
            }
        });


    }
}