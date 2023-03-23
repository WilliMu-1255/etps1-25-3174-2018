package sv.edu.utec.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] paises={"Belice", "Guatemala", "Honduras","El Salvador", "Nicaragua","Costa Rica","Panamá"};
    ListView lvstPais;
    Integer []ImgPais={
            R.drawable.belice,
            R.drawable.guatemala,
            R.drawable.elsalvador,
            R.drawable.honduras,
            R.drawable.nicaragua,
            R.drawable.costa,
            R.drawable.pana
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorPais adaptador = new AdaptadorPais (  this, paises, ImgPais);
        lvstPais = findViewById(R.id.list1);
        lvstPais.setAdapter(adaptador);

    }
}





