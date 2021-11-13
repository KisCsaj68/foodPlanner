package models;

import java.util.ArrayList;
import java.util.List;

public class Food {
	private String name;
	private List<RecipeComponent> components;
	private int portion;

	public Food(String name) {
		this.name = name;
		this.components = new ArrayList<>();
		this.portion = 1;
	}

	public void addComponent(RecipeComponent componentToAdd) {
		components.add(componentToAdd);
	}

	public void setPortion(int portion) {
		this.portion = portion;
	}

	@Override
	public String toString() {
		return "Food [name: " + name + ", components: " + components + ", portion: " + portion + "]";
	}

}
