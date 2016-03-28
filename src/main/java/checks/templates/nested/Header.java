package checks.templates.nested;

import org.watertemplate.Template;
import org.watertemplate.TemplateMap;

public class Header extends Template {
    private final Navigation navMenu;

    public Header(final String title, final Navigation navMenu) {
        add("title", title);
        this.navMenu = navMenu;
    }

    @Override
    protected void addSubTemplates(TemplateMap.SubTemplates subTemplates) {
        subTemplates.add("navigation", navMenu);
    }

    @Override
    protected String getFilePath() {
        return "nested/header.html";
    }
}
