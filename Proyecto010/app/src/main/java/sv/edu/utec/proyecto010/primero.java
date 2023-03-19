package sv.edu.utec.proyecto010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class primero extends AppCompatActivity {

    TextView tvMensj;
    EditText edN;
    Button btP,btVeri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primero);
        btP=findViewById(R.id.btnPrin5);
        btVeri=findViewById(R.id.btnVeri);
        tvMensj=findViewById(R.id.tvMensaje);
        edN=findViewById(R.id.edtNum);

        btVeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String numeroStr = edN.getText().toString();
                if (numeroStr.isEmpty()) {
                    Toast.makeText(primero.this, "Debe ingresar un número", Toast.LENGTH_SHORT).show();
                    return; // Salir del evento de clic sin continuar
                }
                // Obtener el valor ingresado por el usuario
                double dato1, resultado;


                dato1=Integer.parseInt(edN.getText().toString());


                if (dato1>0) {

                    Toast.makeText(primero.this, String.format("El número: %d es positivo +", (int) dato1), Toast.LENGTH_LONG).show();
                }else if (dato1==0) {
                    Toast.makeText(primero.this, String.format("El número: %d es nulo 0", (int) dato1), Toast.LENGTH_LONG).show();
                }else if (dato1<0){
                        Toast.makeText(primero.this, String.format("El número: %d es negativo -", (int) dato1), Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(primero.this, "Ingrese un numero", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

    /*public void valor (View v)
    {


        double dato1, resultado;


        dato1=Integer.parseInt(edN.getText().toString());

        if (dato1>0){
            tvMensj.setText(String.format(, (int) dato1));
        }
        else if (dato1==0){
            tvMensj.setText(String.format(,""+ (int) dato1));
        }
        else if (dato1<0){
            tvMensj.setText(String.format("El número: %d es negativo -", (int) dato1))
        }
    }*/


    public void pantalla(View v) {
        finish();
    }
}