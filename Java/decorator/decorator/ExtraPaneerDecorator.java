package decorator.decorator;

import decorator.food.FoodItem;

public class ExtraPaneerDecorator extends Decorator {

    private Double price;

    public ExtraPaneerDecorator(FoodItem foodItem, Double price) {
        super(foodItem);
        this.price = price;
    }

    @Override
    public String getDescription() {
        return this.foodItem.getDescription() + " with extra Paneer";
    }

    @Override
    public Double getPrice() {
        return this.foodItem.getPrice() + price;
    }
}
