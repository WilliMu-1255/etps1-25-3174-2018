package sv.edu.utec.parcial2_2531742018;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mrecyclerView;
    Adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrecyclerView = findViewById(R.id.rvPer);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adaptador = new Adaptador(this, getListado());
        mrecyclerView.setAdapter(adaptador);

        adaptador.setOnItemClickListener(new Adaptador.OnItemClickListener() {
            @Override
            public void onItemClick(Modelo modelo) {
                Intent intent = new Intent(MainActivity.this, datos.class);
                intent.putExtra("nombre", modelo.getNombrePer());
                intent.putExtra("car", modelo.getCar());
                intent.putExtra("com", modelo.getCom());
                intent.putExtra("img", modelo.getImgPer());
                startActivity(intent);
            }
        });


    }

    private ArrayList<Modelo> getListado(){
        ArrayList<Modelo> modelos=new ArrayList<>();
        Modelo modelista = new Modelo();

        modelista.setNombrePer("Alexander Pierrot");
        modelista.setCar("CEO");
        modelista.setCom("Insures S.O.");
        modelista.setImgPer(R.drawable.lead_photo_1);

        modelos.add(modelista);


        modelista = new Modelo();
        modelista.setNombrePer("Carlos Lopez");
        modelista.setCar("Asistente");
        modelista.setCom("Hospital Blue");
        modelista.setImgPer(R.drawable.lead_photo_2);

        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNombrePer("Sara Bonz");
        modelista.setCar("Directora de Marketing");
        modelista.setCom("Ciencia ficcion");
        modelista.setImgPer(R.drawable.lead_photo_3);

        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNombrePer("Liliana Clarence");
        modelista.setCar("Diseñadora de Producto");
        modelista.setCom("Creativa Appn");
        modelista.setImgPer(R.drawable.lead_photo_4);

        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNombrePer("Benito Peralta");
        modelista.setCar("Supervisor de Ventas");
        modelista.setCom("Neumáticos Press");
        modelista.setImgPer(R.drawable.lead_photo_5);

        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNombrePer("Juan Jaramillo");
        modelista.setCar("CEO");
        modelista.setCom("Banco Nacional");
        modelista.setImgPer(R.drawable.lead_photo_6);

        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNombrePer("Christian Steps");
        modelista.setCar("CTO");
        modelista.setCom("Cooperativa Verde");
        modelista.setImgPer(R.drawable.lead_photo_7);

        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNombrePer("Alexa Giraldo");
        modelista.setCar("Lead Programmer");
        modelista.setCom("Frutisofy");
        modelista.setImgPer(R.drawable.lead_photo_8);

        modelos.add(modelista);


        modelista = new Modelo();
        modelista.setNombrePer("Linda Murillo");
        modelista.setCar("Directora de Marketing");
        modelista.setCom("Seguros Boliver");
        modelista.setImgPer(R.drawable.lead_photo_9);

        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNombrePer("Lizeth Astrada");
        modelista.setCar("CEO");
        modelista.setCom("Concesionario Motolox");
        modelista.setImgPer(R.drawable.lead_photo_10);

        modelos.add(modelista);



        return modelos;
    }



}