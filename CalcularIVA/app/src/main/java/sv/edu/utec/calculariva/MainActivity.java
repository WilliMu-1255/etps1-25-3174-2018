package sv.edu.utec.calculariva;

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
        etCant=findViewById(R.id.edtCantidad);
        tvResultado=findViewById(R.id.txvResultado);
    }

    public void Iva (View v)
    {
        String result = tvResultado.getText().toString();
        double valor = Double.parseDouble(result);



    }
}