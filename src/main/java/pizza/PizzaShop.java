package pizza;

import java.util.ArrayList;

public class PizzaShop {

    public static ArrayList<Pizza> pizzas;

    public static void main(String[] args) {

        ArrayList<Pizza> pizzaStack1 = makePizzas();
        ArrayList<Pizza> pizzaStack2 = makePizzas();

        printPizzas(pizzaStack1);
        printPizzas(pizzaStack2);
    }

    public static ArrayList<Pizza> makePizzas() {
        Pizza pizza1 = new Pizza("Pepperoni", "Large", "Thin");
        Pizza pizza2 = new Pizza("Cheese", "Small", "Hand-Tossed");
        Pizza pizza3 = new Pizza("Supreme", "Extra-Large", "Pan");

        pizzas = new ArrayList<>();
        pizzas.add(pizza1);
        pizzas.add(pizza2);
        pizzas.add(pizza3);

        return pizzas;

    }
    private static void printPizzas(ArrayList<Pizza> pizzas) {
        System.out.println("We currently have the following pizza's for sale: ");


        for(Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}
