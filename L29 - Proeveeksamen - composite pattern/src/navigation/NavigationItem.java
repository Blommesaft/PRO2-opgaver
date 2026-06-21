package navigation;

public class NavigationItem extends NavigationComponent
{
    private String name;
    private String link;

    public NavigationItem(String name, String link)
    {
        this.name = name;
        this.link = link;
    }



    @Override
    public void print(String indent) {
        System.out.println(indent + "- " + getName() + " (" + getLink() + ")");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLink() {
        return this.link;
    }
}
