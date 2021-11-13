package models;

public class Ingredient {
	private final String name;
	private final int kcal;
	private final Macro macro;

	public Ingredient(String name, int kcal, Macro macro) {
		this.name = name;
		this.kcal = kcal;
		this.macro = macro;

	}

	public String getName() {
		return name;
	}

	public int getKcal() {
		return kcal;
	}

	public Macro getMacro() {
		return macro;
	}

	@Override
	public String toString() {
		return "Ingredient [name: " + name + ", kcal: " + kcal + ", macro: " + macro + "]";
	}

}
