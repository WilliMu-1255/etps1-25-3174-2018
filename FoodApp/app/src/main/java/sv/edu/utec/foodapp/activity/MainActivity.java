package sv.edu.utec.foodapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import sv.edu.utec.foodapp.R;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout btnIncial;
    EditText edtUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIncial=findViewById(R.id.btnInicio);
        edtUser = findViewById(R.id.edtUs);

        btnIncial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), principal.class);
                i.putExtra("usuario",edtUser.getText().toString());
                startActivity(i);
            }
        });
    }
}