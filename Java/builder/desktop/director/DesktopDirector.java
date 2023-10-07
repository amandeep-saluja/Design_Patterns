package builder.desktop.director;

import builder.desktop.builder.DesktopBuilder;
import builder.desktop.product.Desktop;

public class DesktopDirector {
    public Desktop construct(DesktopBuilder builder) {
        builder.buildMotherboard();
        builder.buildProcessor();
        builder.buildMemory();
        builder.buildStorage();
        builder.buildGraphicCard();
        return builder.getDesktop();
    }
}
