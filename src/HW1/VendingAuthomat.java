package HW1;

import HW1.HotDrinks;

import java.util.List;

public interface VendingAuthomat {

    public void initProduct (List<HotDrinks> list);

    public void getProduct(String name);
}
