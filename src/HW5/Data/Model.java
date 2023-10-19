package HW5.Data;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List<HotDrinks> hotDrinksList = new ArrayList<>();
    List<Tea> cupOfTea = new ArrayList<>();


    public void addHotDrink(HotDrinks hotDrinks) {
        hotDrinksList.add(hotDrinks);
    }

    public HotDrinks getHotDrink(String name, int volume, int cost) {
        for (HotDrinks hotDrinks : hotDrinksList) {
            if (hotDrinks.getName().equalsIgnoreCase(name) && hotDrinks.getVolume() == volume) {
                return hotDrinks;
            }
        }
        return null;
    }

    public void addTea(Tea tea) {
        cupOfTea.add(tea);
    }

    public Tea getCupOfTea(String name, int volume, int temperature, int cost) {
        for (Tea tea : cupOfTea) {
            if (tea.getName().equals(name)
                    && tea.getVolume() == volume
                    && tea.getTemperature() == temperature) {
                return tea;
            }
        }
        return null;
    }


}
