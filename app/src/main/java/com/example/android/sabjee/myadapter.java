package com.example.android.sabjee;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.selection.ItemKeyProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.net.CookieHandler;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter extends FirebaseRecyclerAdapter <model,myadapter.myviewholder>
{
    Context context;

    public myadapter(@NonNull FirebaseRecyclerOptions<model> options, Context context) {
        super(options);
        this.context = context;
    }

    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }





    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model)
    {




        holder.price.setText(model.getPrice().toString());
        holder.vegetable.setText(model.getVegname());
        Glide.with(holder.img.getContext()).load(model.getPurl()).into(holder.img);



       holder.img.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                Intent intent=new Intent(context,cartview.class);
                intent.putExtra("price",model.getPrice().toString());
               context.startActivity(intent);
           }
       });










    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {




        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);




    }

    class myviewholder extends RecyclerView.ViewHolder{
        CircleImageView img;
        TextView vegetable,price;


        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img=(CircleImageView)itemView.findViewById(R.id.img);
            vegetable=(TextView)itemView.findViewById(R.id.vegetbale);
            price=(TextView)itemView.findViewById(R.id.price);




        }
    }

}