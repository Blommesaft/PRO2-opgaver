package navigation;

import java.util.ArrayList;
import java.util.List;

public class NavigationMenu extends NavigationComponent
{
    private ArrayList<NavigationComponent> navigationComponentList = new ArrayList<>();
    private String name;

    public NavigationMenu(String name)
    {
        this.name = name;
    }

    @Override
    public void addChild(NavigationComponent navigationComponent) {
        if (!navigationComponentList.contains(navigationComponent)) {
            navigationComponentList.add(navigationComponent);
        }
    }

    @Override
    public ArrayList<NavigationComponent> getChildren() {
        return navigationComponentList;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "[" + getName() + "]");
        for (NavigationComponent n : navigationComponentList) {
            n.print(indent + "   ");
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
