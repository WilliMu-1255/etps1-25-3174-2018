package sv.edu.utec.parcial2_2531742018;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class datos extends AppCompatActivity {

    private ImageView imgPer;
    private TextView tvnombrePer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        imgPer = findViewById(R.id.imgEmpl);
        tvnombrePer = findViewById(R.id.txvNEmpleado);


        Intent intent = getIntent();
        if (intent != null) {
            String nombre = intent.getStringExtra("nombre");
            String car = intent.getStringExtra("car");
            String com = intent.getStringExtra("com");
            int img = intent.getIntExtra("img", 0);

            tvnombrePer.setText(nombre);
            imgPer.setImageResource(img);
        }
    }

    public void pantalla(View v) {
        finish();
    }
}