package co.paulfran.paulfranco.bakingtimeapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import co.paulfran.paulfranco.bakingtimeapp.Listeners.RecipeClickListener;

import java.util.ArrayList;

import co.paulfran.paulfranco.bakingtimeapp.R;
import co.paulfran.paulfranco.bakingtimeapp.model.Recipe;

public class RecipeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    // Initialize List of Recipe objects
    private ArrayList<Recipe> recipes;
    // Initialize Strings
    private String recipeImageUrl;
    private String recipeName;
    // Initialize listener
    private RecipeClickListener recipeClickListener;

    public RecipeAdapter(Context context, ArrayList<Recipe> recipes , RecipeClickListener recipeClickListener) {
        this.context = context;
        this.recipes = recipes;
        this.recipeClickListener = recipeClickListener;
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recipe_layout,viewGroup , false);
        Item item = new Item(view , recipeClickListener);

        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        recipeName = recipes.get(i).getName();
        recipeImageUrl = recipes.get(i).getImage();


        ((Item)viewHolder).recipeName.setText(recipeName);


        Glide.with(context).load("https://images.pexels.com/" +
                "photos/242429/pexels-photo-242429.jpeg?auto=compress&" +
                "cs=tinysrgb&h=350").into(((Item)viewHolder).recipeImage);


    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }
    public class Item extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView recipeImage;
        private TextView recipeName;
        private RecipeClickListener mRecipeClickListener;

        public Item(@NonNull View itemView , RecipeClickListener recipeClickListener) {
            super(itemView);
            recipeImage = itemView.findViewById(R.id.recipeImage);
            recipeName  = itemView.findViewById(R.id.recipeName);
            mRecipeClickListener = recipeClickListener;
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int click = getAdapterPosition();
            mRecipeClickListener.onRecipeClick(click);

        }
    }
}