package sv.edu.utec.proyecto010;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tercero extends AppCompatActivity {
    Button btP3;

     EditText edNumeros;
     Button btnCalcular;
     TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercero);
        btP3=findViewById(R.id.btnPrin3);

            edNumeros = findViewById(R.id.edNumeros);
            btnCalcular = findViewById(R.id.btnCalcular);
            tvResultado = findViewById(R.id.tvResultado);

            btnCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Obtener los números ingresados por el usuario
                    String numerosStr = edNumeros.getText().toString().trim();
                    if (numerosStr.isEmpty()) {
                        Toast.makeText(tercero.this, "Debe ingresar un número", Toast.LENGTH_SHORT).show();
                        return; // Salir del evento de clic sin continuar
                    }
                    String[] numerosArr = numerosStr.split(",");

                    // Verificar que se hayan ingresado 10 números
                    if (numerosArr.length != 10) {
                        tvResultado.setText("Debe ingresar 10 números");
                        return;
                    }

                    // Calcular la suma de los últimos 5 valores
                    int suma = 0;
                    for (int i = 5; i < 10; i++) {
                        suma += Integer.parseInt(numerosArr[i].trim());
                    }

                    // Mostrar el resultado en el TextView
                    tvResultado.setText("La suma de los últimos 5 valores es: " + suma);
                }
            });
    }




    public void pantalla(View v) {
        finish();
    }
}