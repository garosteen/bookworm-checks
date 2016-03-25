package checks.templates.nested;

import org.watertemplate.Template;
import org.watertemplate.TemplateMap;

public class Master extends Template {
    private final String title;

    public Master(final String title) {
        this.title = title;
    }

    @Override
    protected void addSubTemplates(TemplateMap.SubTemplates subTemplates) {
        subTemplates.add("header", new Header(title));
        subTemplates.add("footer", new Footer());
    }

    @Override
    protected String getFilePath() {
        return "nested/master.html";
    }
}
