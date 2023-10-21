package decorator.decorator;

import decorator.food.FoodItem;

public class ExtraCheeseDecorator extends Decorator {

    private final Double price;

    public ExtraCheeseDecorator(FoodItem foodItem, Double price) {
        super(foodItem);
        this.price = price;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " with extra cheese";
    }

    @Override
    public Double getPrice() {
        return foodItem.getPrice() + price;
    }
}
