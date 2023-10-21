package decorator.food;

public class Pizza implements FoodItem {
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public Double getPrice() {
        return 200.0;
    }
}
