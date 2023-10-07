package builder.house.builder;

public class WoodenHouseBuilder extends HouseBuilder {
    @Override
    public HouseBuilder buildFloor() {
        this.house.setFloor("building wooden house floor");
        return this;
    }

    @Override
    public HouseBuilder buildWalls() {
        this.house.setWalls("building wooden house walls");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        this.house.setRoof("building wooden house roof");
        return this;
    }

    @Override
    public HouseBuilder buildDoor() {
        this.house.setDoor("building wooden house door");
        return this;
    }

    @Override
    public HouseBuilder buildWindows() {
        this.house.setWindow("building wooden house window");
        return this;
    }
}
