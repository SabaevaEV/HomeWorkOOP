package HW5;

import HW5.Controller.Controller;
import HW5.Data.Model;
import HW5.Data.Tea;
import HW5.View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);

        controller.createHotDrink("Чай1", 100, 80);
        controller.createHotDrink("Чай2", 200, 180);
        controller.createHotDrink("Чай3", 300, 280);
        controller.createCupOfTea("Зеленый чай", 250, 50, 133);
        controller.createCupOfTea("Черный чай", 350, 60, 183);


        view.viewHotDrink(controller.getHotDrink("Чай1", 100,80));
        view.viewHotDrink(controller.getHotDrink("Чай2", 200, 180));
        view.viewHotDrink(controller.getHotDrink("Чай3", 300, 280));

        view.viewTea("Зеленый чай", 250, 50, 133);
        view.viewTea("Черный чай", 350, 60, 183);





//        view.viewTea(controller.getCupOfTea("Зеленый чай", 250, 50, 133));
//        view.viewTea(controller.getCupOfTea("Черный чай", 350, 60, 183));

    }
}
