package sv.edu.utec.valores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText etValor;
        TextView tvResult1, tvResult2, tvResult3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etValor=findViewById(R.id.edtValorN);
        tvResult1=findViewById(R.id.txvR1);
        tvResult2=findViewById(R.id.txvR2);
        tvResult3=findViewById(R.id.txvR3);
    }

    public void Resultado(View v)
    {

        int N = 0, valor;
        valor=Integer.parseInt(etValor.getText().toString());;
        N=valor+77;

        tvResult1.setText("N + 77 ="+String.valueOf(N));

        N=N-3;

        tvResult2.setText("N - 3 ="+String.valueOf(N));

        N=N*2;

        tvResult3.setText("N * 2 ="+String.valueOf(N));

    }
}