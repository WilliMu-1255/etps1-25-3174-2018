package sv.edu.utec.listafrutas;

import androidx.appcompat.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class adaptador extends ArrayAdapter<frutas> {

    AppCompatActivity appCompatActivity;
    ArrayList<frutas> listafrutas;

    Integer[] ImgPpersonas;


    adaptador(AppCompatActivity context, ArrayList<frutas> listafrutas, Integer[] ImgPpersonas) {
        super(context, R.layout.lista_frutas, listafrutas);
        appCompatActivity = context;
        this.listafrutas = listafrutas;
        this.ImgPpersonas = ImgPpersonas;

    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = appCompatActivity.getLayoutInflater();
        View item = inflater.inflate(R.layout.lista_frutas, null);
        TextView textView1 = item.findViewById(R.id.tvNombre);
        textView1.setText(listafrutas.get(position).getNombre());
        TextView textView2 = item.findViewById(R.id.tvDesc);
        textView2.setText(listafrutas.get(position).getDesc());
        ImageView imageView1 = item.findViewById(R.id.imvFoto);
        imageView1.setImageResource(ImgPpersonas[position]);

        return(item);
    }
}
