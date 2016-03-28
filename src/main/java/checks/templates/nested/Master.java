package checks.templates.nested;

import org.watertemplate.Template;
import org.watertemplate.TemplateMap;

public class Master extends Template {
    private final String title;
    private final Navigation navMenu;

    public Master(final String title, final Navigation navMenu) {
        this.title = title;
        this.navMenu = navMenu;
    }

    @Override
    protected void addSubTemplates(TemplateMap.SubTemplates subTemplates) {
        subTemplates.add("header", new Header(title, navMenu));
        subTemplates.add("footer", new Footer());
    }

    @Override
    protected String getFilePath() {
        return "nested/master.html";
    }
}
