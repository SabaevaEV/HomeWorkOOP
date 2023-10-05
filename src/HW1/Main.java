package HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            Tea greenTea = new Tea("Зеленый чай", 100, 120, 70);
            Tea blackTea = new Tea("Черный чай", 50, 70, 70);

            List<HotDrinks> menu= new ArrayList<>(List.of(greenTea, blackTea));

            HotDrinkAuthomat authomat = new HotDrinkAuthomat();

            authomat.initProduct(menu);
            System.out.println(menu);

            authomat.getProduct("Зеленый чай");








    }
}