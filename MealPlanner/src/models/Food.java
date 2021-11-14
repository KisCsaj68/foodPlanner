package models;

import java.util.ArrayList;
import java.util.List;

public class Food {
	private String name;
	private List<RecipeComponent> components;
	private CourseType type;

	public Food(String name, CourseType type) {
		this.name = name;
		this.components = new ArrayList<>();
		this.type = type;

	}

	public void addComponent(RecipeComponent componentToAdd) {
		components.add(componentToAdd);
	}

	public CourseType getCourseType() {
		return this.type;
	}

	public double calculateKcal() {
		double result = 0.0;
		for (RecipeComponent comp : components) {
			result += comp.scaleIngredientKcal();
		}
		return result;
	}

	public Macro calculateMacro() {
		Macro result = new Macro(0.0, 0.0, 0.0);
		for (RecipeComponent comp : components) {
			Macro scaledMacro = comp.getIngredient().getMacro().scale(comp.getAmount());
			result = result.sum(scaledMacro);
		}
		return result;
	}

	public List<RecipeComponent> getComponents() {
		return this.components;
	}

	@Override
	public String toString() {
		return "Food: " + name + ", Kcal: " + calculateKcal() + ", Macro: " + calculateMacro() + "]";
	}
}
