package HW5.View;

import HW5.Controller.Controller;
import HW5.Data.HotDrinks;
import HW5.Data.Tea;

public class View {
    Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void viewHotDrink(HotDrinks hotDrinks) {

        System.out.println("Горячий напиток - " + hotDrinks.getName() + "\nОбъем - " + hotDrinks.getVolume() +
                "\nСтоимость - " + hotDrinks.getCost());
        System.out.println("-".repeat(20));
    }

    public void viewTea(String name, int volume, int temperature, int cost) {
        System.out.printf("Чай - " + name + "\nОбъем - " + volume +
                "\nТемпература - " + temperature + "\nСтоимость - " + cost + "\n");
        System.out.println("-".repeat(20));

    }

//    public void viewTea(String name, int volume, int temperature, int cost) {
//        Tea teaList = controller.getCupOfTea(name, volume, temperature, cost);
//        System.out.printf("Чай - " + name + "\nОбъем - " + volume +
//                "\nТемпература - " + temperature + "\nСтоимость - " + cost + "\n");
//        System.out.println("-".repeat(20));
//        System.out.printf("Чай - " + teaList.getName() + "\nОбъем - " + teaList.getVolume() +
//                "\nТемпература - " + teaList.getTemperature()+ "\nСтоимость - " + teaList.getCost() + "\n");
//    }
//    public void viewTea(Tea tea) {
//        System.out.printf("Горячий напиток - " + tea.getName() + "\nОбъем - " + tea.getVolume() +
//                "\n Температура - " +tea.getTemperature() + "\nСтоимость - " + tea.getCost());
//        System.out.println("-".repeat(20));
//    }
}
