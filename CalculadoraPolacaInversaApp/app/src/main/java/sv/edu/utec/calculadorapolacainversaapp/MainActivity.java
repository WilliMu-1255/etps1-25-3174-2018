package sv.edu.utec.calculadorapolacainversaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2, etSigno;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1=findViewById(R.id.edtNumero);
        etNum2=findViewById(R.id.edtNumero2);
        etSigno=findViewById(R.id.edtSigno);
        tvResult=findViewById(R.id.txvResult);


    }
    public void Calc (View v)
    {
        double dato1, dato2, resultado;
        String sign=etSigno.getText().toString();

        dato1=Double.parseDouble(etNum1.getText().toString());
        dato2=Double.parseDouble(etNum2.getText().toString());


        if (sign.equals("+")){
            resultado=dato1+dato2;
            tvResult.setText("El resultado de la suma es: "+String.valueOf(resultado));

        }
        else if (sign.equals("-")){
            resultado=dato1-dato2;
            tvResult.setText("El resultado de la Resta es: "+String.valueOf(resultado));

        }

        else if (sign.equals("*")){
            resultado=dato1*dato2;
            tvResult.setText("El resultado de la Multiplicacion es: "+String.valueOf(resultado));

        }
        else if (sign.equals("/")){
            resultado=dato1/dato2;
            tvResult.setText("El resultado de la Division es: "+String.valueOf(resultado));

        }

    }
}