package composite.FileExample;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("Root");

        FileComponentSystem file1 = new File("Document.txt", 100);
        FileComponentSystem file2 = new File("Image.jpg", 200);

        Directory subDirectory = new Directory("SubDirectory");
        FileComponentSystem file3 = new File("Data.csv", 150);

        subDirectory.addContent(file3);

        root.addContent(file1);
        root.addContent(file2);
        root.addContent(subDirectory);

        // List contents and calculate total size for the directory structure
        root.listContents();

        int totalSize = root.getSize();
        System.out.println("Total Size: " + totalSize + " KB");
    }
}
