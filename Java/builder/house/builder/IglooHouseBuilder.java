package builder.house.builder;

public class IglooHouseBuilder extends HouseBuilder {
    @Override
    public HouseBuilder buildFloor() {
        this.house.setFloor("building ice house floor");
        return this;
    }

    @Override
    public HouseBuilder buildWalls() {
        this.house.setWalls("building ice house walls");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        this.house.setRoof("building ice house roof");
        return this;
    }

    @Override
    public HouseBuilder buildDoor() {
        this.house.setDoor("building ice house door");
        return this;
    }

    @Override
    public HouseBuilder buildWindows() {
        this.house.setWindow("building ice house window");
        return this;
    }
}
