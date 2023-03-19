package sv.edu.utec.proyecto010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btA,btW,bt1,bt2,bt3,bt4,bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btA=findViewById(R.id.btnA);
        btW=findViewById(R.id.btnW);
        bt1=findViewById(R.id.btnE1);
        bt2=findViewById(R.id.btnE2);
        bt3=findViewById(R.id.btnE3);
        bt4=findViewById(R.id.btnE4);
        bt5=findViewById(R.id.btnE5);


        btA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), AcercaDe.class);
                i.putExtra("usuario","-Muñoz Raymundo William Ernesto 25-3174-2018\n" +
                        "-Rivas Hernández Pedro Alberto 25-4037-2018\n" +
                        "-Ramírez Hernández José David 25-0591-2017(Lider)\n" +
                        "-Castellón Mazariego Ever Enrique 25-0567-2018");
                startActivity(i);


            }
        });
        btW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), WebView.class);
                startActivity(i);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), primero.class);
                startActivity(i);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), segundo.class);
                startActivity(i);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), tercero.class);
                startActivity(i);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), cuarto.class);
                startActivity(i);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), quinto.class);
                startActivity(i);
            }
        });




    }


}