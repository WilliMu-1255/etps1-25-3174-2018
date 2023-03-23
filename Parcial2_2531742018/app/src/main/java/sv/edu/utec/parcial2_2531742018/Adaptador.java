package sv.edu.utec.parcial2_2531742018;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Elementos> {
    Context contexto;

    private OnItemClickListener listener;
    ArrayList<Modelo> modelos;//el array lo genero en base al Modelo y le pongo de nombre modelo

    public Adaptador(Context context, ArrayList<Modelo> modelos) {
        this.contexto = context;
        this.modelos = modelos;
    }

    @NonNull
    @Override
    public Elementos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contexto.getApplicationContext()).inflate(R.layout.empleados,null);
        return new Elementos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Elementos holder, int position) {
        holder.tvnombrePer.setText(modelos.get(position).getNombrePer());
        holder.tvCar.setText(modelos.get(position).getCar());
        holder.tvCom.setText(modelos.get(position).getCom());
        holder.imgPer.setImageResource(modelos.get(position).getImgPer());
        /*Elementos.tvnombrePel.setText(modelos.get(position).getNombrePeli());
        Elementos.tvnombrePel.setText(modelos.get(position).getNombrePeli());
        Elementos.tvnombrePel.setText(modelos.get(position).getNombrePeli());
        Elementos.tvnombrePel.setText(modelos.get(position).getNombrePeli());
        Elementos.tvnombrePel.setText(modelos.get(position).getNombrePeli());
        Elementos.tvnombrePel.setText(modelos.get(position).getNombrePeli());*/
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onItemClick(modelos.get(position));
                }
            }
        });
    }

    public interface OnItemClickListener {
        void onItemClick(Modelo modelo);
    }



    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }


    @Override
    public int getItemCount() { //para que cuente los items
        return modelos.size();
    }
}




























