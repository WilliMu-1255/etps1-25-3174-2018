package sv.edu.utec.ejercicio2_parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etP, etA;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etP=findViewById(R.id.edtP);
        etA=findViewById(R.id.edtA);

        tvResultado=findViewById(R.id.txvMensaje);
    }

    public void Imc(View v)
    {
        float peso=Float.parseFloat(etP.getText().toString());
        float altura=Float.parseFloat(etA.getText().toString());
        /*altura=altura/100;*/

        float IMC = (peso/(altura * altura));


        if (IMC>0 && IMC<=10.5){
            tvResultado.setText(" Críticamente Bajo de Peso");

        }
        else if (IMC>10.5 && IMC<=15.9){
            tvResultado.setText(String.valueOf((IMC))+" Severamente Bajo de Peso");
        }
        else if (IMC>15.9 && IMC<=18.5){
            tvResultado.setText(String.valueOf((IMC))+" Bajo de Peso");
        }

        else if (IMC>18.5 && IMC<=25){
            tvResultado.setText(String.valueOf((IMC))+" Normal (peso saludable)");
        }
        else if (IMC>25 && IMC<=30)
        {
            tvResultado.setText(String.valueOf((IMC))+" Sobrepeso");
        }
        else if (IMC>30 && IMC<=35){

            tvResultado.setText(String.valueOf((IMC))+" Obesidad Clase 1 - Moderadamente Obeso");
        }
        else if (IMC>35 && IMC<=40){

            tvResultado.setText(String.valueOf((IMC))+" Obesidad Clase 2 - Severamente Obeso");
        }
        else if (IMC>50){

            tvResultado.setText(String.valueOf((IMC))+" Obesidad Clase 3 - Críticamente Obeso");
        }

    }
}