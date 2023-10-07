package builder.house.product;

public class House {
    private String floor;
    private String walls;
    private String roof;
    private String door;
    private String window;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "House{" +
                "\nfloor='" + floor + '\'' +
                ", \nwalls='" + walls + '\'' +
                ", \nroof='" + roof + '\'' +
                ", \ndoor='" + door + '\'' +
                ", \nwindow='" + window + '\'' + "\n" +
                '}' ;
    }
}
