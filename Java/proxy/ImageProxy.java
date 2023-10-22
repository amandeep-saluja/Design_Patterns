package proxy;

public class ImageProxy implements Image {

    private String fileName;
    private RealImage realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(null == realImage) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
