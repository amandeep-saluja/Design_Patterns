package proxy;

public class Main {
    public static void main(String[] args) {
        // Create an Image Proxy for a high-resolution image.
        Image proxy = new ImageProxy("high-resolution-image.jpeg");

        // Display the image (loading it on-demand)
        proxy.display();

        // The Image is not loaded again if we display it multiple times
        proxy.display();
    }
}
