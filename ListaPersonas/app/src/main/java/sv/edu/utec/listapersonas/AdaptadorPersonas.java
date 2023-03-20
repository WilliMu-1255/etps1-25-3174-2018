package sv.edu.utec.listapersonas;

import androidx.appcompat.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class AdaptadorPersonas extends ArrayAdapter<Personas> {

    AppCompatActivity appCompatActivity;
    ArrayList<Personas> listapersonas;
     Integer[] ImgPpersonas;

    AdaptadorPersonas(AppCompatActivity context, ArrayList<Personas> listapersonas, Integer[] ImgPpersonas) {
        super(context, R.layout.personas, listapersonas);
        appCompatActivity = context;
        this.listapersonas = listapersonas;
        this.ImgPpersonas = ImgPpersonas;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = appCompatActivity.getLayoutInflater();
        View item = inflater.inflate(R.layout.personas, null);
        TextView textView1 = item.findViewById(R.id.tvNombre);
        textView1.setText(listapersonas.get(position).getNombre());

        ImageView imageView1 = item.findViewById(R.id.imvFoto);
        imageView1.setImageResource(ImgPpersonas[position]);
        return(item);
    }
}
