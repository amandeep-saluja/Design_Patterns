package builder.desktop.builder;

public class HPDesktopBuilder extends DesktopBuilder {
    @Override
    public void buildMotherboard() {
        this.desktop.setMotherboard("HP Motherboard");
    }

    @Override
    public void buildProcessor() {
        this.desktop.setProcessor("HP Processor");
    }

    @Override
    public void buildMemory() {
        this.desktop.setMemory("16GB RAM");
    }

    @Override
    public void buildStorage() {
        this.desktop.setStorage("500GB SSD");
    }

    @Override
    public void buildGraphicCard() {
        this.desktop.setGraphicCard("AMD Graphics");
    }
}
