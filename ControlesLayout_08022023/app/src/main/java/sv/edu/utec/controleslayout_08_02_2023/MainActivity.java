package sv.edu.utec.controleslayout_08_02_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spPais;
    EditText etNombres, etApelliodos,etInfo;
    RadioButton rbFem, rbMasc, rbOtr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombres=findViewById(R.id.edtNombres);
        etApelliodos=findViewById(R.id.edtApellidos);
        etInfo=findViewById(R.id.editTextTextMultiLine);
        spPais=findViewById(R.id.spnPais);

        String[]opciones={"Seleccione un pais","Guatemala","El Salvador","Honduras","Nicaragua","Costa Rica","Panamá"};
        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,opciones);
        spPais.setAdapter(adaptador);

    }

    public void Almacenar(View v){
        String datos="";
        String seleccion = spPais.getSelectedItem().toString();
        if (seleccion.equals("Seleccione un pais")){
            datos="No selecciono ningun pais";
            etInfo.append(datos);

        }
        else if (seleccion.equals("Guatemala")){
                datos="Guatemala";
            etInfo.append(datos);
        }
        else if (seleccion.equals("Guatemala")){
            datos="El Salvador";
            etInfo.append(datos);
        }
        else if (seleccion.equals("Guatemala")){
            datos="Honduras";
            etInfo.append(datos);
        }


    }
}