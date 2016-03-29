package checks.templates.pages;

import checks.templates.nested.Master;
import checks.templates.nested.Navigation;
import org.watertemplate.Template;

public class Home extends Template{
    private final Navigation navMenu;

    public Home(final Navigation navMenu) {
        this.navMenu = navMenu;
    }

    @Override
    protected Template getMasterTemplate() {
            return new Master("Home", navMenu);
        }

    @Override
    protected String getFilePath() {
            return "pages/home.html";
        }

}
