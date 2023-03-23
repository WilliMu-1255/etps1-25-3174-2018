package sv.edu.utec.listapersonas_guia2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Personas> {

    AppCompatActivity appCompatActivity;
    ArrayList<Personas> listapersonas;

    Adapter(AppCompatActivity context, ArrayList<Personas> listapersonas) {
        super(context, R.layout.listadopersonas, listapersonas);
        appCompatActivity = context;
        this.listapersonas = listapersonas;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = appCompatActivity.getLayoutInflater();
        View item = inflater.inflate(R.layout.listadopersonas, null);
        TextView textView1 = item.findViewById(R.id.txvNombre);
        textView1.setText(listapersonas.get(position).getNombre());
        TextView textView2 = item.findViewById(R.id.txvEdad);
        textView2.setText(listapersonas.get(position).getEdad());
        TextView textView3 = item.findViewById(R.id.txvDireccion);
        textView3.setText(listapersonas.get(position).getDireccion());
        return item;
    }
}