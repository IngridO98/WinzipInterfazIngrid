package com.example.winzipinterfazingrid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorMyFiles extends RecyclerView.Adapter<AdaptadorMyFiles.ViewHolderMyFiles> {

    ArrayList<MyFiles> listaMyFiles;

    public AdaptadorMyFiles(ArrayList<MyFiles> lista) {
        this.listaMyFiles = lista;
    }


    @Override
    public ViewHolderMyFiles onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fila_ejemplo,null,false);
        return new ViewHolderMyFiles(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderMyFiles holder, int position) {
        holder.txtNombre.setText(listaMyFiles.get(position).getNombre());
        holder.txtDescripcion.setText(listaMyFiles.get(position).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return listaMyFiles.size();
    }

    public class ViewHolderMyFiles extends RecyclerView.ViewHolder {
        TextView  txtNombre, txtDescripcion ;

        public ViewHolderMyFiles(View itemView) {
            super(itemView);
            txtNombre=(TextView)itemView.findViewById(R.id.MyfilesNombre);
            txtDescripcion=(TextView)itemView.findViewById(R.id.MyfilesDescripcion);
        }
    }
}
