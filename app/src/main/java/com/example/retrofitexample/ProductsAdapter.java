package com.example.retrofitexample;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitexample.apiresponse.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {
    Context context;
    List<Product> list;

    ProductsAdapter(Context context, List<Product> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_product, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsAdapter.ViewHolder holder, int position) {
        holder.tvTitle.setText(list.get(position).getTitle());
        holder.tvType.setText(list.get(position).getImageType());
        holder.tvId.setText("" + list.get(position).getId());
        Picasso.get().load(list.get(position).getImage()).into(holder.ivImage);

        holder.itemView.setOnClickListener(v ->
                Toast.makeText(context, list.get(position).getTitle(), Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvId, tvType;
        ImageView ivImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvId = itemView.findViewById(R.id.tv_id);
            tvType = itemView.findViewById(R.id.tv_type);
            ivImage = itemView.findViewById(R.id.iv_image);
        }
    }
}
