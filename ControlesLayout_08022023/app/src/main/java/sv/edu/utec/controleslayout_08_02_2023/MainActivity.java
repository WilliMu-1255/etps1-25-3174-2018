package sv.edu.utec.controleslayout_08_02_2023;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spPais;
    EditText etNombres, etApellidos,etInfo;
    RadioButton rbFem, rbMasc, rbOtr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //edit text
        etNombres=findViewById(R.id.edtNombres);
        etApellidos=findViewById(R.id.edtApellidos);
        etInfo=findViewById(R.id.editTextTextMultiLine);
        //Spinner
        spPais=findViewById(R.id.spnPais);
        //Radiobuttons
        rbFem=findViewById(R.id.rbFemenino);
        rbMasc=findViewById(R.id.rbMasculino);
        rbOtr=findViewById(R.id.rbOtros);


/*      Forma 1
        String[]opciones={"Seleccione un pais","Guatemala","El Salvador","Honduras","Nicaragua","Costa Rica","Panamá"};
        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,opciones);
        spPais.setAdapter(adaptador);*/

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item)
        {

            public View getView(int posicion,  View contenido, ViewGroup parent) {
                View vista=super.getView(posicion,contenido,parent);
                if (posicion==getCount())
                {
                    ((TextView)vista.findViewById(android.R.id.text1)).setText("");
                    ((TextView)vista.findViewById(android.R.id.text1)).setHint(getItem(getCount()));
                }
                return vista;
            }

            public int getCount()
            {
                return super.getCount()-1;
            }
        };

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adaptador.add("Guatemala");
        adaptador.add("El Salvador");
        adaptador.add("Honduras");
        adaptador.add("Nicaragua");
        adaptador.add("Costa Rica");
        adaptador.add("Panamá");
        adaptador.add("Seleccione un pais");//este es el elemento a quitar del spinner
        spPais.setAdapter(adaptador);
        spPais.setSelection(adaptador.getCount());


        String[]opciones={"Seleccione un pais","Guatemala","El Salvador","Honduras","Nicaragua","Costa Rica","Panamá"};
        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,opciones);
        spPais.setAdapter(adaptador);


    }

    public void Almacenar(View v){
        String datos="";
        String seleccion = spPais.getSelectedItem().toString();

        //Get Traer
        //Set Enviar

        String nombre=etNombres.getText().toString();
        String apellido=etApellidos.getText().toString();
        String genero="";
        String info;


        if (rbMasc.isChecked()==false && rbFem.isChecked()==false && rbOtr.isChecked()==false) {
            Toast mensaje= Toast.makeText(this,"Seleccione un genero",Toast.LENGTH_LONG);
            mensaje.show();
        }else {

        if (rbMasc.isChecked()==true)
        {
            genero="Masculino";
        }else if (rbFem.isChecked()==true)
        {
            genero="Femenino";
        }else
        {
            genero="otros";
        }
        }


        if (seleccion.equals("Seleccione un pais")){
            datos="No selecciono ningun pais";
            etInfo.append(datos);

        }
        else if (seleccion.equals("Guatemala")){
                datos="Guatemala";
            etInfo.append(datos);
        }

        else if (seleccion.equals("El Salvador")){
            datos="El Salvador";
            etInfo.append(datos);
        }
        else if (seleccion.equals("Honduras"))
        {
        else if (seleccion.equals("Guatemala")){
            datos="El Salvador";
            etInfo.append(datos);
        }
        else if (seleccion.equals("Guatemala")){

            datos="Honduras";
            etInfo.append(datos);
        }

        info= "Los datos ingresados son los siguientes \n"+
                "Nombre     : "+nombre+"\n"+
                "Apellido   : "+apellido+"\n"+
                "Genero     : "+genero+"\n"+
                "Pais     : "+datos+"\n";

        etInfo.append(info);

    }
}