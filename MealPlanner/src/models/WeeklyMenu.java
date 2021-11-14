package models;

import java.util.ArrayList;
import java.util.List;

public class WeeklyMenu {
	private List<DailyMenu> dailyMenus;

	public WeeklyMenu() {
		this.dailyMenus = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "WeeklyMenu [dailyMenu=" + dailyMenus + "]";
	}

	public void addDailyMenu(DailyMenu menu) {
		dailyMenus.add(menu);
	}
	
	public List<DailyMenu> getDailyMenus() {
		return this.dailyMenus;
	}
	
	

}
