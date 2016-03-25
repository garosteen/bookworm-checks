package checks.templates;

import checks.templates.nested.Master;
import org.watertemplate.Template;

public class TestPage extends Template {

    @Override
    protected Template getMasterTemplate() {
        return new Master("Test");
    }

    @Override
    protected String getFilePath() {
        return "testpage.html";
    }
}
