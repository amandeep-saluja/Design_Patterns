package bridge.uber;

import bridge.navigation.NavigationImpl;

public abstract class Uber extends NavigationSystem {

    public abstract void setNavigationImpl(NavigationImpl navigationImpl);
}
