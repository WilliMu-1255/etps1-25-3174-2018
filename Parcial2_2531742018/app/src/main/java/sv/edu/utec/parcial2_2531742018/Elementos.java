package sv.edu.utec.parcial2_2531742018;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Elementos extends RecyclerView.ViewHolder {//ViewHolder permite poner una clase sobre otra
    static ImageView imgPer;
    static TextView tvnombrePer, tvCar, tvCom;
    public Elementos(@NonNull View itemView) {
        super(itemView);

        imgPer = itemView.findViewById(R.id.imageView);
        tvnombrePer = itemView.findViewById(R.id.txvNombre);
        tvCar = itemView.findViewById(R.id.tvxCargo);
        tvCom = itemView.findViewById(R.id.tvxCompañia);
    }

}
