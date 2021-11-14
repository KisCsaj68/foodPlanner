package models;

import java.util.ArrayList;
import java.util.List;

public class DailyMenu {
	private List<Food> courses;

	public DailyMenu() {
		this.courses = new ArrayList<>();
	}

	public void addFood(Food dish) {
		courses.add(dish);
	}

	@Override
	public String toString() {
		return "DailyMenu: [ " + courses + " ]";
	}
	
	public List<Food> getCourses() {
		return this.courses;
	}
}
