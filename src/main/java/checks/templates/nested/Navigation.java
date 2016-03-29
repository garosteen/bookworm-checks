package checks.templates.nested;

import org.watertemplate.Template;

import java.util.ArrayList;
import java.util.Collection;

public class Navigation extends Template {
    private static final Collection<NavItem> navItems = new ArrayList<>();

    public Navigation() {
        //navItems.add(new NavItem("Home", "/"));

        addCollection("navItems", navItems, (nav, map) -> {
            map.add("label", nav.label);
            map.add("link", nav.link);
        });
    }

    public void addNavItem(String label, String link) {
        navItems.add(new NavItem(label, link));
    }

    @Override
    protected String getFilePath() {
        return "nested/nav.html";
    }
}

class NavItem {
    public final String label, link;

    public NavItem(String label, String link) {
        this.label = label;
        this.link = link;
    }
}