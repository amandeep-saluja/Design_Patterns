package decorator.decorator;

import decorator.food.FoodItem;

public abstract class Decorator implements FoodItem {
    protected FoodItem foodItem;

    public Decorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }
}
