package decorator;

import decorator.decorator.ExtraCheeseDecorator;
import decorator.decorator.ExtraPaneerDecorator;
import decorator.food.Burger;
import decorator.food.FoodItem;
import decorator.food.Pizza;

public class Main {
    public static void main(String[] args) {
        // Order a Pizza and a Burger
        FoodItem pizzaOrder = new Pizza();
        FoodItem burgerOrder = new Burger();

        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder, 45.0);
        pizzaOrder = new ExtraPaneerDecorator(pizzaOrder, 33.0);

        burgerOrder = new ExtraPaneerDecorator(burgerOrder, 65.0);
        burgerOrder = new ExtraCheeseDecorator(burgerOrder, 35.0);

        System.out.println("Description of pizza order is "+pizzaOrder.getDescription());
        System.out.println("Price of pizza order is "+pizzaOrder.getPrice());

        System.out.println("-------------------------------------------------------------");

        System.out.println("Description of burger order is "+burgerOrder.getDescription());
        System.out.println("Price of burger order is "+burgerOrder.getPrice());
    }
}
