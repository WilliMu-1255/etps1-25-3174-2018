package sv.edu.utec.proyecto010;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class quinto extends AppCompatActivity {

     EditText etLado1, etLado2, etLado3;
     Button btnCalcular,btP5;
     ImageView imgResultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinto);

        btP5=findViewById(R.id.btnPrin5);

        etLado1 = findViewById(R.id.et_lado1);
        etLado2 = findViewById(R.id.et_lado2);
        etLado3 = findViewById(R.id.et_lado3);
        btnCalcular = findViewById(R.id.btn_calcular);
        imgResultado = findViewById(R.id.imvTriangulo);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Capturamos los valores ingresados por el usuario
                String strLado1 = etLado1.getText().toString();
                String strLado2 = etLado2.getText().toString();
                String strLado3 = etLado3.getText().toString();
                if (strLado1.isEmpty()) {
                    Toast.makeText(quinto.this, "Debe ingresar un número", Toast.LENGTH_SHORT).show();
                    return; // Salir del evento de clic sin continuar
                }else if (strLado2.isEmpty()){
                    Toast.makeText(quinto.this, "Debe ingresar un número", Toast.LENGTH_SHORT).show();
                    return; // Salir del evento de clic sin continuar
                } else if (strLado3.isEmpty()) {
                    Toast.makeText(quinto.this, "Debe ingresar un número", Toast.LENGTH_SHORT).show();
                    return; // Salir del evento de clic sin continuar
                }

                // Convertimos los valores a números enteros
                int lado1 = Integer.parseInt(strLado1);
                int lado2 = Integer.parseInt(strLado2);
                int lado3 = Integer.parseInt(strLado3);

                // Verificamos el tipo de triángulo y mostramos la imagen correspondiente
                if (lado1 == lado2 && lado2 == lado3) {
                    imgResultado.setImageResource(R.drawable.equilatero);
                    Toast.makeText(quinto.this, "Triángulo equilátero", Toast.LENGTH_SHORT).show();
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    imgResultado.setImageResource(R.drawable.isosceles);
                    Toast.makeText(quinto.this, "Triángulo isósceles", Toast.LENGTH_SHORT).show();
                } else {
                    imgResultado.setImageResource(R.drawable.escaleno);
                    Toast.makeText(quinto.this, "Triángulo escaleno", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void pantalla(View v) {
        finish();
    }
}