package co.paulfran.paulfranco.bakingtimeapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.ArrayList;

public class Recipe {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("recipe")
    @Expose
    private String recipe;

    @SerializedName("ingredients")
    @Expose
    private ArrayList<Ingredient> ingredients = null;

    @SerializedName("steps")
    @Expose
    private ArrayList<Step> steps = null;

    @SerializedName("servings")
    @Expose
    private int servings;

    @SerializedName("image")
    @Expose
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<Step> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<Step> steps) {
        this.steps = steps;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
