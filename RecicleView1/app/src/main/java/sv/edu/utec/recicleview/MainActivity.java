package sv.edu.utec.recicleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    Adaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrecyclerView = findViewById(R.id.rvPeliculas);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adaptador = new Adaptador(this, getListado());
        mrecyclerView.setAdapter(adaptador);

        /*mrecyclerView.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Toast.makeText(getApplicationContext(), "prueba",Toast.LENGTH_LONG).show();
                                             }
                                         });
*/
        mrecyclerView.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View v, MotionEvent event) {
                Toast.makeText(getApplicationContext(),"Selecionar",Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }


    private ArrayList<Modelo> getListado(){
        ArrayList<Modelo>modelos=new ArrayList<>();
        Modelo modelista = new Modelo();
        modelista.setNoombPeli("Ex Maquina");
        modelista.setDirecPeli("Juan Perez");
        modelista.setGeneroPeli("Ciencia Ficcion");
        modelista.setImgPeli(R.drawable.ex_maquina);
        modelista.setClasificar(3.45);
        modelista.setDuraPeli("108 min");
        modelista.setAnioPeli("2018");
        modelos.add(modelista);



        modelista = new Modelo();
        modelista.setNoombPeli("Jumanji");
        modelista.setDirecPeli("Juan Perez");
        modelista.setGeneroPeli("Ciencia Ficcion");
        modelista.setImgPeli(R.drawable.jumanji);
        modelista.setClasificar(3.45);
        modelista.setDuraPeli("108 min");
        modelista.setAnioPeli("2018");
        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNoombPeli("Intelestelar");
        modelista.setDirecPeli("Juan Perez");
        modelista.setGeneroPeli("Ciencia Ficcion");
        modelista.setImgPeli(R.drawable.interestelar);
        modelista.setClasificar(3.45);
        modelista.setDuraPeli("108 min");
        modelista.setAnioPeli("2018");
        modelos.add(modelista);


        modelista = new Modelo();
        modelista.setNoombPeli("La Llegada");
        modelista.setDirecPeli("Juan Perez");
        modelista.setGeneroPeli("Ciencia Ficcion");
        modelista.setImgPeli(R.drawable.la_llegada);
        modelista.setClasificar(3.45);
        modelista.setDuraPeli("108 min");
        modelista.setAnioPeli("2018");
        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNoombPeli("El extraordinario");
        modelista.setDirecPeli("Juan Perez");
        modelista.setGeneroPeli("Ciencia Ficcion");
        modelista.setImgPeli(R.drawable.extraordinario);
        modelista.setClasificar(3.45);
        modelista.setDuraPeli("108 min");
        modelista.setAnioPeli("2018");
        modelos.add(modelista);


        return modelos;
    }
}