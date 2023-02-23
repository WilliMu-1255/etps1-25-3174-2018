package sv.edu.utec.calculoiva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etCant;
    TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       etCant=findViewById(R.id.edtCifra);
        tvResultado=findViewById(R.id.txvResultado);
    }

    public void Iva (View v)
    {
        double num,IVA=0.134,dato1 ;
        dato1=Double.parseDouble(etCant.getText().toString());

        num = dato1+(dato1*IVA);


        tvResultado.setText("El precio con IVA es: "+String.valueOf(num));







     /*
        • IMC < 10.5 "Críticamente Bajo de Peso";
• IMC < 15.9 "Severamente Bajo de Peso";
• IMC < 18.5 "Bajo de Peso";
• IMC < 25 "Normal (peso saludable)";
• IMC < 30 "Sobrepeso";
• IMC < 35 "Obesidad Clase 1 - Moderadamente Obeso";
• IMC < 40 "Obesidad Clase 2 - Severamente Obeso";
• Arriba de 50 "Obesidad Clase 3 - Críticamente Obeso";
*/

    }
}