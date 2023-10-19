package HW5.Controller;

import HW5.Data.HotDrinks;
import HW5.Data.Model;
import HW5.Data.Tea;

public class Controller {
    protected Model model;

    public Controller(Model model) {
        this.model = model;
    }
    public void createHotDrink(String name, int volume, int cost) {

        if (name != null && !name.isEmpty()
                && volume > 0 && volume < 400) {
            model.addHotDrink(new HotDrinks(name, volume, cost));
        }
    }

    public HotDrinks getHotDrink(String name, int volume, int cost) {
        if (name != null && !name.isEmpty()
                && volume > 0 && volume < 400) {
            return model.getHotDrink(name, volume, cost);
        }
        return null;
    }

    public void createCupOfTea(String name, int volume, int temperature, int cost) {
        if (name != null && !name.isEmpty()
                && volume > 0 && volume < 400
                && temperature > -10 && temperature < 100) {
            model.addTea(new Tea(name, volume, temperature, cost));
        }
    }

    public Tea getCupOfTea(String name, int volume, int temperature, int cost) {
        if (name != null && !name.isEmpty()
                && volume > 0 && volume < 400
                && temperature > -10 && temperature < 100) {
            model.getCupOfTea(name, volume, temperature, cost);
        }
        return null;
    }
}
