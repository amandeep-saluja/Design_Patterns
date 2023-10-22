package proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Display Image: " + fileName);
    }

    private void loadFromDisk() {
        System.out.println("Loading Image from disk: " + fileName);
    }
}
