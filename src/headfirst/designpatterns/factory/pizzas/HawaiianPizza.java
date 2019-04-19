package headfirst.designpatterns.factory.pizzas;

public class HawaiianPizza extends Pizza{

    public HawaiianPizza(){
        name = "Hawaiian Pizza";
        dough = "Crust";
        sauce = "Hawaiian sauce";
        toppings.add("Pineapple");
        toppings.add("Grated parmesan cheese");
        toppings.add("Fresh Mozzarella");
    }

}
