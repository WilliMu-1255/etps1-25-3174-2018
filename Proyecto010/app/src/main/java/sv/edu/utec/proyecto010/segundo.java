package sv.edu.utec.proyecto010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class segundo extends AppCompatActivity {

     EditText edNumero;
     Button btnEnviar;

    Button btP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        btP2=findViewById(R.id.btnPrin2);

        edNumero = findViewById(R.id.edNumero);
        btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                // Obtener el valor ingresado por el usuario
                String numeroStr = edNumero.getText().toString();
                if (numeroStr.isEmpty()) {
                    Toast.makeText(segundo.this, "Debe ingresar un número", Toast.LENGTH_SHORT).show();
                    return; // Salir del evento de clic sin continuar
                }

                // Validar que el valor ingresado es un número de hasta 3 cifras
                if (numeroStr.length() <= 3) {
                    // Convertir el valor a un entero
                    int numero = Integer.parseInt(numeroStr);

                    // Determinar cuántas cifras tiene el número
                    if (numero >= 0 && numero <= 9) {
                        Toast.makeText(segundo.this, "", Toast.LENGTH_LONG).show();
                        Toast.makeText(segundo.this, "El número tiene 1 cifra", Toast.LENGTH_LONG).show();
                    } else if (numero >= 10 && numero <= 99) {
                        Toast.makeText(segundo.this, "El número tiene 2 cifras", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(segundo.this, "El número tiene 3 cifras", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(segundo.this, "El número ingresado tiene más de 3 cifras", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void pantalla(View v) {
        finish();
    }

       /* btP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }*/
}