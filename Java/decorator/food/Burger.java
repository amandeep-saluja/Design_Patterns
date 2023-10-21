package decorator.food;

public class Burger implements FoodItem {
    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public Double getPrice() {
        return 150.0;
    }
}
