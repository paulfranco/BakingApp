package co.paulfran.paulfranco.bakingtimeapp.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class RecipeList {
    @SerializedName("RecipeList")
    private ArrayList<Recipe> RecipeList;

    public ArrayList<Recipe> getRecipes() {
        return RecipeList;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.RecipeList = recipes;
    }
}