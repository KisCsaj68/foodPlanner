package models;

public class Macro {
	private final double protein;
	private final double carboHydrate;
	private final double fat;

	public Macro(double protein, double carboHydrate, double fat) {
		this.protein = protein;
		this.carboHydrate = carboHydrate;
		this.fat = fat;
	}

	public double getProtein() {
		return protein;
	}

	public double getCarboHydrate() {
		return carboHydrate;
	}

	public double getFat() {
		return fat;
	}

	public Macro sumMacro(Macro other) {
		double protein = other.getProtein() + this.protein;
		double fat = other.getFat() + this.fat;
		double carb = other.getCarboHydrate() + this.carboHydrate;
		return new Macro(protein, carb, fat);

	}

	@Override
	public String toString() {
		return "Macro [protein: " + protein + ", carboHydrate: " + carboHydrate + ", fat: " + fat + "]";
	}

}
