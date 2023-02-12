package sv.edu.utec.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etVal1, etVal2;
    Button btCalculo;
    TextView twresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etVal1=findViewById(R.id.edtValor1);
        etVal2=findViewById(R.id.edtValors2);
        twresultado=findViewById(R.id.txvResultado);

    }

    public void Suma(View view)
    {
        double dato1, dato2, resultado;


        dato1=Double.parseDouble(etVal1.getText().toString());
        dato2=Double.parseDouble(etVal2.getText().toString());
        resultado=dato1+dato2;
        twresultado.setText("El resultado es: "+String.valueOf(resultado));

    }
}