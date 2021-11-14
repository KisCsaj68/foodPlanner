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

	public Macro sum(Macro other) {
		double protein = other.getProtein() + this.protein;
		double fat = other.getFat() + this.fat;
		double carb = other.getCarboHydrate() + this.carboHydrate;
		return new Macro(protein, carb, fat);
	}

	public Macro scale(int amount) {
		double prot = this.protein * amount / 100.0;
		double carb = this.carboHydrate * amount / 100.0;
		double fatt = this.fat * amount / 100.0;

		return new Macro(prot, carb, fatt);
	}

	@Override
	public String toString() {
		return "protein: " + protein + ", carboHydrate: " + carboHydrate + ", fat: " + fat + "]";
	}

}
