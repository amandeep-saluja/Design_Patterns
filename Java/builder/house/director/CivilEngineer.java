package builder.house.director;

import builder.house.builder.HouseBuilder;
import builder.house.product.House;

public class CivilEngineer {

    public House construct(HouseBuilder builder) {
        return builder.buildFloor().buildWalls().buildRoof().buildDoor().buildWindows().build();
    }
}
