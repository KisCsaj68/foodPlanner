package models;

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

}
