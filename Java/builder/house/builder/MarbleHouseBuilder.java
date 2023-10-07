package builder.house.builder;

public class MarbleHouseBuilder extends HouseBuilder {
    @Override
    public HouseBuilder buildFloor() {
        this.house.setFloor("building marble house floor");
        return this;
    }

    @Override
    public HouseBuilder buildWalls() {
        this.house.setWalls("building marble house walls");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        this.house.setRoof("building marble house roof");
        return this;
    }

    @Override
    public HouseBuilder buildDoor() {
        this.house.setDoor("building marble house door");
        return this;
    }

    @Override
    public HouseBuilder buildWindows() {
        this.house.setWindow("building marble house window");
        return this;
    }
}
