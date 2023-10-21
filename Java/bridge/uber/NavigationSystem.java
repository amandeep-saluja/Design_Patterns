package bridge.uber;

import bridge.navigation.NavigationImpl;

public abstract class NavigationSystem {

    protected NavigationImpl navigationImpl;

    public abstract void navigate(String destination);
}
