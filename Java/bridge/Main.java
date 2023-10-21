package bridge;

import bridge.navigation.AppleMaps;
import bridge.navigation.GoogleMaps;
import bridge.uber.UberEats;
import bridge.uber.UberRide;

public class Main {
    public static void main(String[] args) {

        // Create an Uber Ride with a driver
        UberRide uberRide = new UberRide("Rahul");

        // Create an Uber Eats delivery
        UberEats uberEats = new UberEats("Ganesh restaurant");

        // Create different navigation Implementations
        GoogleMaps googleMaps = new GoogleMaps();
        AppleMaps appleMaps = new AppleMaps();

        // Set the navigation implementation for UberRide
        uberRide.setNavigationImpl(googleMaps);

        // Request an Uber ride with Google Maps navigation
        uberRide.navigate("Central Park");

        // Switch to Apple Maps navigation for uberEats
        uberEats.setNavigationImpl(appleMaps);

        // Request an Uber Eats delivery with Apple Maps navigation
        uberEats.navigate("123 HSR");
    }
}
