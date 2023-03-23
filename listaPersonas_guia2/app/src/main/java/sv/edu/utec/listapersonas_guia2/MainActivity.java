package sv.edu.utec.listapersonas_guia2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Personas> listapersonas;
    ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listapersonas = new ArrayList<Personas>();
        listapersonas.add(new Personas("ana","18","San Salvador"));
        listapersonas.add(new Personas("carlos","22","San Salvador"));
        listapersonas.add(new Personas("fernanda","33","San Salvador"));
        listapersonas.add(new Personas("gustavo","22","San Salvador"));
        listapersonas.add(new Personas("jose","31","San Salvador"));
        listapersonas.add(new Personas("Juan", "20","San Salvador"));
        listapersonas.add(new Personas("karla","50","San Salvador"));
        listapersonas.add(new Personas("luis","19","San Salvador"));
        listapersonas.add(new Personas("maria","25","San Salvador"));
        listapersonas.add(new Personas("marta","27","San Salvador"));
        listapersonas.add(new Personas("pedro","28","San Salvador"));
        listapersonas.add(new Personas("silvia","29","San Salvador"));

        Adapter adaptador = new Adapter(this, listapersonas);
        lv1 = findViewById(R.id.lsvPersonas);
        lv1.setAdapter(adaptador);
    }

}