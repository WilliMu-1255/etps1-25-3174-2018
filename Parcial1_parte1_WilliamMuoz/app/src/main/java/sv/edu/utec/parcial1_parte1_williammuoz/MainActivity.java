package sv.edu.utec.parcial1_parte1_williammuoz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNom, edtCon;
    Button btnL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnL=findViewById(R.id.btnLogin);
        edtNom=findViewById(R.id.edtUsuario);
        edtCon=findViewById(R.id.edtContraseña);
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = edtNom.getText().toString();
                String pass = edtCon.getText().toString();

                if (user.equals("parcialETps1") &&  pass.equals("p4rC14l#tp$"))
                {
                    Intent intento=new Intent(getApplicationContext(),Login.class);
                    startActivity(intento);
                }
                else
                {
                    Toast mensaje= Toast.makeText( MainActivity.this,"contraseña y usuario no son correctos",Toast.LENGTH_SHORT);
                    mensaje.show();
                }
            }
        });

    }
}