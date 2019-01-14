package suramericana.devops.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://www.bbc.co.uk/news")
public class BbcHomePage extends PageObject {
    public static final Target SIGIN_BUTTON = Target.the("Bbc_signin_button").located(By.id("idcta-link"));
    public static final Target YOUR_ACCOUNT_BUTTON = Target.the("Bbc_your_account_button").located(By.id("idcta-username"));
    public static final Target BOTON_LOGIN = Target.the("Bonton login").locatedBy("//*[@id='idcta-username']");
}
