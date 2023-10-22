package composite.FileExample;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponentSystem {

    private final String name;
    private List<FileComponentSystem> contents;

    public Directory(String name) {
        this.name = name;
    }

    public void addContent(FileComponentSystem component) {
        if (null == contents) {
            contents = new ArrayList<>();
        }
        this.contents.add(component);
    }

    public void removeContent(FileComponentSystem component) {
        if (null != contents) {
            this.contents.remove(component);
        }
    }

    @Override
    public void listContents() {
        System.out.println("|--- D: " + name);
        //System.out.print("|---");
        contents.forEach(FileComponentSystem::listContents);
    }

    @Override
    public Integer getSize() {
        return contents.stream().reduce(0, (previousSize, component) -> previousSize + component.getSize(), Integer::sum);
    }
}
