package bridge.uber;

import bridge.navigation.NavigationImpl;

public class UberEats extends Uber {
    private final String restaurantName;

    public UberEats(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public void navigate(String destination) {
        System.out.print("Uber eats with restaurant " + restaurantName + " navigate to " + destination + " using ");
        this.navigationImpl.navigateTo(destination);
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    @Override
    public void setNavigationImpl(NavigationImpl navigationImpl) {
        this.navigationImpl = navigationImpl;
    }
}
