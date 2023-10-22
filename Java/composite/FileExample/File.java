package composite.FileExample;

public class File implements FileComponentSystem {

    private final String name;
    private final Integer size;

    public File(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void listContents() {
        System.out.println("|--- F: " + name);
    }

    @Override
    public Integer getSize() {
        return size;
    }
}
