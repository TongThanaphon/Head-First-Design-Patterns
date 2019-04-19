package headfirst.designpatterns.factory.pizzafm;

public class NYStyleHawaiianPizza extends Pizza{

    public NYStyleHawaiianPizza(){
        name = "NY Style Hawaiian Pizza";
        dough = "Thin Crust Dough";
        sauce = "Hawaiian Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Pineapple");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
