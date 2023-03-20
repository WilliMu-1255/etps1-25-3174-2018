package sv.edu.utec.recicleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Elementos extends RecyclerView.ViewHolder{
    static ImageView imvimgPel;
       static TextView tvnomPel,tvgenPel;

    public Elementos(@NonNull View itemView) {

        super(itemView);
        imvimgPel=itemView.findViewById(R.id.imvPelicula);
        tvnomPel=itemView.findViewById(R.id.tvTitulo);
        tvgenPel=itemView.findViewById(R.id.tvGenero);


    }
}
