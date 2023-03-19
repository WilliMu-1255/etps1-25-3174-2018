package sv.edu.utec.proyecto010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity {

    TextView tvAutor;
    Button btSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
        btSalir=findViewById(R.id.btnSalir);




        Bundle bundle=getIntent().getExtras();
        tvAutor=findViewById(R.id.txvAutor);
        String inform = "Autores: \n"+bundle.getString("usuario");
        tvAutor.setText(inform);
    }

    public void pantalla(View v)
    {
        Intent i=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);

    }

    public void salir(View v) {
        finish();
    }
}