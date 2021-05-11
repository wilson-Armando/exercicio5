package com.example.exercico5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_Calcular;
    EditText txt_Salario;
    TextView txt_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Calcular.findViewById(R.id.btn_calcular);
        txt_Salario.findViewById(R.id.txt_salario);
        txt_resultado.findViewById(R.id.txt_resultado);

        btn_Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               float descontos,gratificão,salario_líquido;

              float n=Float.parseFloat(txt_Salario.getText().toString());

              gratificão=n*(5/100);
              descontos=n*(7/100);
              salario_líquido=n+gratificão-descontos;

              txt_resultado.setText("O salario líquido é:"+ String.valueOf( salario_líquido));




            }
        });
    }
}