package sv.edu.utec.recicleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

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
        adaptador=new Adaptador(this,getListado());
        mrecyclerView.setAdapter(adaptador);

        mrecyclerView.setOnClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

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
        modelista.setNoombPeli("Ex Maquina");
        modelista.setDirecPeli("Juan Perez");
        modelista.setGeneroPeli("Ciencia Ficcion");
        modelista.setImgPeli(R.drawable.jumanji);
        modelista.setClasificar(3.45);
        modelista.setDuraPeli("108 min");
        modelista.setAnioPeli("2018");
        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNoombPeli("Ex Maquina");
        modelista.setDirecPeli("Juan Perez");
        modelista.setGeneroPeli("Ciencia Ficcion");
        modelista.setImgPeli(R.drawable.interestelar);
        modelista.setClasificar(3.45);
        modelista.setDuraPeli("108 min");
        modelista.setAnioPeli("2018");
        modelos.add(modelista);


        modelista = new Modelo();
        modelista.setNoombPeli("Ex Maquina");
        modelista.setDirecPeli("Juan Perez");
        modelista.setGeneroPeli("Ciencia Ficcion");
        modelista.setImgPeli(R.drawable.la_llegada);
        modelista.setClasificar(3.45);
        modelista.setDuraPeli("108 min");
        modelista.setAnioPeli("2018");
        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNoombPeli("Ex Maquina");
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