package models;
/**
 * This class scales 100g ingredient to exact amount that the recipe requires.
 * @author zsolnaiviki
 *
 */
public class RecipeComponent {
	private Ingredient ingredient;
	private int amount;

	public RecipeComponent(Ingredient ingredient, int amount) {
		this.ingredient = ingredient;
		this.amount = amount;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public int getAmount() {
		return amount;
	}
	
	public double scaleIngredientKcal() {
		double result = ingredient.getKcal() * this.amount / 100 ;
		return result;
	}
	
	

}
