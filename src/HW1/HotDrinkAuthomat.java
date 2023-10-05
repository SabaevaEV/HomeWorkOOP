package HW1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkAuthomat implements VendingAuthomat {

    protected List <HotDrinks> drinks = new ArrayList<>();
    @Override
    public void initProduct(List<HotDrinks> list) {
        this.drinks = list;
    }

    @Override
    public void getProduct(String name) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getName().equals(name)){
                System.out.println(drinks.get(i));
            }
        }

    }
}
