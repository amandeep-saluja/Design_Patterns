package bridge.uber;

import bridge.navigation.NavigationImpl;

public class UberRide extends Uber{

    private final String driverName;

    public UberRide(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void navigate(String destination) {
        System.out.print("Uber ride with driver " + driverName + " navigate to " + destination + " using ");
        this.navigationImpl.navigateTo(destination);
    }

    public String getDriverName() {
        return driverName;
    }

    @Override
    public void setNavigationImpl(NavigationImpl navigationImpl) {
        this.navigationImpl = navigationImpl;
    }
}
