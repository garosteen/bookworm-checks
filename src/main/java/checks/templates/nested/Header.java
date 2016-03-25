package checks.templates.nested;

import org.watertemplate.Template;

public class Header extends Template {

    public Header(final String title) {
        add("title", title);
    }

    @Override
    protected String getFilePath() {
        return "nested/header.html";
    }
}
