package models;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
	private int portion;
	private Map<String, Integer> items;

	public ShoppingList(int portion) {
		this.items = new HashMap<>();
		this.portion = portion;
	}

	public void addItem(RecipeComponent item) {
		String name = item.getIngredient().getName();
		int amount = item.getAmount() * portion;
		if (items.containsKey(name)) {
			int amountOfItem = items.get(name);
			amountOfItem += amount;
			items.put(name, amountOfItem);
		} else {
			items.put(name, amount);
		}
	}

	public void generateWeeklyShoppingList(WeeklyMenu weeklyMenu) {
		for (DailyMenu dailyMenu : weeklyMenu.getDailyMenus()) {
			for (Food dish : dailyMenu.getCourses()) {
				for (RecipeComponent component : dish.getComponents()) {
					this.addItem(component);
				}
			}
		}
	}
}
