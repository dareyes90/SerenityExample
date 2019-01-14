package suramericana.devops.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.thucydides.core.annotations.Managed;
import suramericana.devops.tasks.ClickOnLogin;
import suramericana.devops.tasks.OpenTheBrowser;
import suramericana.devops.userinterfaces.BbcHomePage;

public class BbcLogin {

	@Managed(driver = "chrome")
	private WebDriver herBrowser; // instance ok

	private Actor scarlet = Actor.named("Scarlet");

	private BbcHomePage bbcHomePage;
	
	@Before
	public void userCanBrowseTheWeb() {
		scarlet.can(BrowsingTheWeb.with(herBrowser));
	}

	@Given("^Charlie is on BBC login page$")
	public void charlieIsOnBBCLoginPage() {
		scarlet.attemptsTo(OpenTheBrowser.on(bbcHomePage),ClickOnLogin.click(BbcHomePage.BOTON_LOGIN));
	}

	@When("^Charlie sign in with correct credentials$")
	public void charlieSignInWithCorrectCredentials() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^He should see your account option$")
	public void heShouldSeeYourAccountOption() {
		// Write code here that turns the phrase above into concrete actions
	}

}
