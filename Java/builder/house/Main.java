package builder.house;

import builder.house.builder.IglooHouseBuilder;
import builder.house.builder.MarbleHouseBuilder;
import builder.house.builder.WoodenHouseBuilder;
import builder.house.director.CivilEngineer;
import builder.house.product.House;

public class Main {
    public static void main(String[] args) {
        CivilEngineer engineer = new CivilEngineer();

        // building wooden house
        WoodenHouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        House woodenHouse = engineer.construct(woodenHouseBuilder);
        System.out.println(woodenHouse);

        // building marble house
        MarbleHouseBuilder marbleHouseBuilder = new MarbleHouseBuilder();
        House marbleHouse = engineer.construct(marbleHouseBuilder);
        System.out.println(marbleHouse);

        // building igloo house
        IglooHouseBuilder iglooHouseBuilder = new IglooHouseBuilder();
        House iglooHouse = engineer.construct(iglooHouseBuilder);
        System.out.println(iglooHouse);
    }
}
