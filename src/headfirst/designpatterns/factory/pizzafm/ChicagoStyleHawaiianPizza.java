package headfirst.designpatterns.factory.pizzafm;

public class ChicagoStyleHawaiianPizza extends Pizza{

    public ChicagoStyleHawaiianPizza(){
        name = "Chicago Style Hawaiian Pizza";
        dough = "Thick Crust Dough";
        sauce = "Hawaiian Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Pineapple");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
