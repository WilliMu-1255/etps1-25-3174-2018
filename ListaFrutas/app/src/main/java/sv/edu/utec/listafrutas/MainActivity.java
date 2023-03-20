package sv.edu.utec.listafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<frutas> listafrutas;
    ListView lv1;

    Integer[]ImgPpersonas={
            R.drawable.ana,
            R.drawable.carlos,
            R.drawable.fernanda,
            R.drawable.gustavo,
            R.drawable.jose,
            R.drawable.juan,
            R.drawable.karla,
            R.drawable.luis,
            R.drawable.maria,
            R.drawable.marta,
            R.drawable.pedro,
            R.drawable.ana,
            R.drawable.carlos,
            R.drawable.fernanda,
            R.drawable.gustavo,
            R.drawable.jose,
            R.drawable.juan,
            R.drawable.karla,
            R.drawable.luis,
            R.drawable.maria,
            R.drawable.marta,
            R.drawable.pedro,
            R.drawable.marta,
            R.drawable.pedro,
            R.drawable.silvia
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listafrutas=new ArrayList<frutas>();
        listafrutas.add(new frutas("manzana", "Una fruta redonda y dulce, de piel suave y color rojo o verde."));
        listafrutas.add(new frutas("plátano", "Una fruta alargada y amarilla con pulpa suave y dulce."));
        listafrutas.add(new frutas("naranja", "Una fruta redonda y anaranjada, con pulpa jugosa y ácida."));
        listafrutas.add(new frutas("limón", "Una fruta pequeña y ovalada, con pulpa ácida y jugosa y piel amarilla."));
        listafrutas.add(new frutas("fresa", "Una fruta pequeña y roja con un sabor dulce y ligeramente ácido."));
        listafrutas.add(new frutas("melón", "Una fruta grande y redonda con pulpa dulce y jugosa."));
        listafrutas.add(new frutas("sandía", "Una fruta grande y redonda con pulpa jugosa y refrescante."));
        listafrutas.add(new frutas("piña", "Una fruta grande y cilíndrica con una pulpa dulce y fibrosa."));
        listafrutas.add(new frutas("uva", "Una fruta pequeña y redonda con pulpa jugosa y dulce, que crece en racimos."));
        listafrutas.add(new frutas("cereza", "Una fruta pequeña y roja con un sabor dulce y ligeramente ácido."));
        listafrutas.add(new frutas("kiwi", "Una fruta pequeña y ovalada con piel marrón y pulpa verde, dulce y ácida."));
        listafrutas.add(new frutas("mango", "Una fruta grande y ovalada con piel amarilla y pulpa dulce y jugosa."));
        listafrutas.add(new frutas("maracuyá", "Una fruta pequeña y redonda con pulpa amarilla y sabor agridulce."));
        listafrutas.add(new frutas("papaya", "Una fruta grande y ovalada con piel amarilla y pulpa dulce y suave."));
        listafrutas.add(new frutas("coco", "Una fruta grande y marrón con pulpa blanca y jugosa."));
        listafrutas.add(new frutas("guayaba", "Una fruta pequeña y redonda con piel verde y pulpa dulce y aromática."));
        listafrutas.add(new frutas("higo", "Una fruta pequeña y ovalada con piel marrón y pulpa dulce y suave."));
        listafrutas.add(new frutas("ciruela", "Una fruta pequeña y redonda con piel morada y pulpa dulce y jugosa."));
        listafrutas.add(new frutas("granada", "Una fruta grande y redonda con pulpa dulce y jugosa y una piel gruesa."));
        listafrutas.add(new frutas("mandarina", "Una fruta pequeña y redonda con piel naranja y pulpa jugosa y dulce."));
        listafrutas.add(new frutas("toronja", "Una fruta grande y redonda con piel amarilla y pulpa ácida y jugosa."));
        listafrutas.add(new frutas("pera", "Una fruta alargada y dulce con piel suave y lisa."));
        listafrutas.add(new frutas("guanábana", "Una fruta grande y verde con una pulpa blanca y cremosa, con un sabor dulce y ácido."));
        listafrutas.add(new frutas("mandarino", "Una fruta pequeña y redonda con piel verde y pulpa jugosa y dulce, similar a la mandarina."));
        listafrutas.add(new frutas("zarzamora", "Una fruta pequeña y redonda con piel morada y una pulpa jugosa y dulce, utilizada en postres y mermeladas."));

        adaptador adaptador = new adaptador(this, listafrutas,ImgPpersonas);
        lv1 = findViewById(R.id.lsvFrutas);
        lv1.setAdapter(adaptador);
    }

}