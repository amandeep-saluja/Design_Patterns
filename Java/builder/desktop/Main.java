package builder.desktop;

import builder.desktop.builder.DellDesktopBuilder;
import builder.desktop.builder.HPDesktopBuilder;
import builder.desktop.director.DesktopDirector;
import builder.desktop.product.Desktop;

public class Main {
    public static void main(String[] args) {
        DesktopDirector director = new DesktopDirector();

        DellDesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
        Desktop dellDesktop = director.construct(dellDesktopBuilder);

        HPDesktopBuilder hpDesktopBuilder = new HPDesktopBuilder();
        Desktop hpDesktop = director.construct(hpDesktopBuilder);

        dellDesktop.display();
        hpDesktop.display();
    }
}
