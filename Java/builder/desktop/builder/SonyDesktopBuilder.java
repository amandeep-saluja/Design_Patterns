package builder.desktop.builder;

public class SonyDesktopBuilder extends DesktopBuilder {
    @Override
    public void buildMotherboard() {
        this.desktop.setMotherboard("Sony Motherboard");
    }

    @Override
    public void buildProcessor() {
        this.desktop.setProcessor("Sony Processor");
    }

    @Override
    public void buildMemory() {
        this.desktop.setMemory("Sony 12GB RAM");
    }

    @Override
    public void buildStorage() {
        this.desktop.setStorage("1TB HDD");
    }

    @Override
    public void buildGraphicCard() {
        this.desktop.setGraphicCard("50GB Virtual Graphics");
    }
}
