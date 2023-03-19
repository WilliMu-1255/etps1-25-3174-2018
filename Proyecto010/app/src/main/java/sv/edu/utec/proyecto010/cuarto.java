package sv.edu.utec.proyecto010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cuarto extends AppCompatActivity {

    EditText edNumeros;
    Button btnCalcular, btP;
    TextView tvResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarto);
        btP=findViewById(R.id.btnPrin4);

        edNumeros = findViewById(R.id.edNumeros);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
               /* EditText inputText = findViewById(R.id.inputText);
                TextView outputText = findViewById(R.id.outputText);*/

                String numerosStr = edNumeros.getText().toString();
                if (numerosStr.isEmpty()) {
                    Toast.makeText(cuarto.this, "Debe ingresar un número", Toast.LENGTH_SHORT).show();
                    return; // Salir del evento de clic sin continuar
                }

                String[] inputArray = numerosStr.split(",");

                int cantidadNegativos = 0;
                int cantidadPositivos = 0;
                int cantidadMultiplosDe15 = 0;
                int valorAcumuladoPares = 0;

                for (String numeroString : inputArray) {
                    int numero = Integer.parseInt(numeroString);

                    if (numero < 0) {
                        cantidadNegativos++;
                    } else if (numero > 0) {
                        cantidadPositivos++;
                    }

                    if (numero % 15 == 0) {
                        cantidadMultiplosDe15++;
                    }

                    if (numero % 2 == 0) {
                        valorAcumuladoPares += numero;
                    }
                }

                String resultado = "Cantidad de números negativos: " + cantidadNegativos + "\n" +
                        "Cantidad de números positivos: " + cantidadPositivos + "\n" +
                        "Cantidad de múltiplos de 15: " + cantidadMultiplosDe15 + "\n" +
                        "Valor acumulado de los números pares: " + valorAcumuladoPares;

                tvResultado.setText(resultado);
            }
        });

    }

    public void pantalla(View v) {
        finish();
    }
}