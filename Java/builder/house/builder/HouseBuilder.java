package builder.house.builder;

import builder.house.product.House;

public abstract class HouseBuilder {
    protected House house = new House();
    
    public abstract HouseBuilder buildFloor();
    
    public abstract HouseBuilder buildWalls();
    
    public abstract HouseBuilder buildRoof();
    
    public abstract HouseBuilder buildDoor();
    
    public abstract HouseBuilder buildWindows();
    
    public House build() {
        return this.house;
    }
}
