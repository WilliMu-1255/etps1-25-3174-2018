package sv.edu.utec.activity_pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNombre;
    TextView twresultado;
    Button btnEnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        etNombre = findViewById(R.id.edtNombre);
        twresultado=findViewById(R.id.txvBienvenida);
    }

    public void Bienve(View v)
    {
        String nombre=etNombre.getText().toString();
        twresultado.setText("Bienvenido: "+nombre);

    }


}