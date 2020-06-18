package com.example.navigationactivitymenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
public class DishListAdapter extends RecyclerView.Adapter<DishListAdapter.ViewHolder>{
    private LayoutInflater inflater;

    private List<DishItem> pizzas;
    public DishListAdapter(Context context, List<DishItem> pizzas) {

        this.pizzas = pizzas;

        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public DishListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.dish_block, parent, false);
        return new ViewHolder(view);}
    @Override
    public void onBindViewHolder(DishListAdapter.ViewHolder holder, int position) {
        DishItem pizza = pizzas.get(position);

        Picasso.get().load(pizza.getResImage()).fit().centerCrop().into(holder.imageView);
//        holder.imageView.setImageResource(pizza.getResImage());

        holder.nameView.setText(pizza.getFood_name());

        holder.priceView.setText(pizza.getFood_price());

        holder.weightView.setText(pizza.getWeight());
        holder.orderBtn.setVisibility(View.GONE);

    }
    @Override
    public int getItemCount() {
        return pizzas.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        final AppCompatImageView imageView;
        final AppCompatTextView nameView, priceView, weightView, countBtn;
        final AppCompatImageButton minusBtn, plusBtn;
        final AppCompatButton orderBtn;
        ViewHolder(View view){
            super(view);
            imageView = (AppCompatImageView) view.findViewById(R.id.imageViewDish);
            nameView = (AppCompatTextView) view.findViewById(R.id.dishname);
            priceView = (AppCompatTextView) view.findViewById(R.id.textViewPrice);
            weightView=(AppCompatTextView)view.findViewById(R.id.textViewGram);
            countBtn=(AppCompatTextView)view.findViewById(R.id.countTextView);
            minusBtn=(AppCompatImageButton) view.findViewById(R.id.minusBtn);
            plusBtn=(AppCompatImageButton) view.findViewById(R.id.plusBtn);
            orderBtn=(AppCompatButton) view.findViewById(R.id.orderBtn);

        }
    }
}
