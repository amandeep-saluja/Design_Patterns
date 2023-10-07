package builder.desktop.builder;

public class DellDesktopBuilder extends DesktopBuilder {
    @Override
    public void buildMotherboard() {
        this.desktop.setMotherboard("Dell Motherboard");
    }

    @Override
    public void buildProcessor() {
        this.desktop.setProcessor("Dell Processor");
    }

    @Override
    public void buildMemory() {
        this.desktop.setMemory("32GB DDR4 RAM");
    }

    @Override
    public void buildStorage() {
        this.desktop.setStorage("250 GB NVMe M.2 SSD");
    }

    @Override
    public void buildGraphicCard() {
        this.desktop.setGraphicCard("NVIDIA GeForce RTX 40 Graphic Card");
    }
}
