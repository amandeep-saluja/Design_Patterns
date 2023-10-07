package builder.desktop.builder;

import builder.desktop.product.Desktop;

public abstract class DesktopBuilder {

    // Builder has a Product
    protected Desktop desktop = new Desktop();
    public abstract void buildMotherboard();

    public abstract void buildProcessor();

    public abstract void buildMemory();

    public abstract void buildStorage();

    public abstract void buildGraphicCard();

    public Desktop getDesktop() {
         return desktop;
    }
}
