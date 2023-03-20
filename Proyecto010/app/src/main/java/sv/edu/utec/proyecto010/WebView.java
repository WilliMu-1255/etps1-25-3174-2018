package sv.edu.utec.proyecto010;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class WebView extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        et1=findViewById(R.id.et1);
    }
    public void ver (View v) {
        String LINK = et1.getText().toString();
        if (LINK.isEmpty()) {
            Toast.makeText(WebView.this, "Debe ingresar una direccion web", Toast.LENGTH_SHORT).show();
            return; // Salir del evento de clic sin continuar
        }
        Intent i=new Intent(this,Actividad2.class);
        i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }

    public void pantalla(View v) {
        finish();
    }
}
