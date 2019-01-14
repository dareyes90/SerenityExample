package suramericana.devops.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task{
    private PageObject page;

    public OpenTheBrowser(PageObject page) {
        this.page = page;
    }

    //Open.browserOn gets a page object
    @Override
    @Step("{0} opens the browser on Bbc Home Page")
    public <T extends Actor> void performAs(T actor) {      //This method is default for the interface Task

        actor.attemptsTo(Open.browserOn(page));
    }

    public static OpenTheBrowser on(PageObject page) {
        return instrumented(OpenTheBrowser.class, page);
    }
}
