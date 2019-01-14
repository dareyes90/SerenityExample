package suramericana.devops.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ClickOnLogin implements Task{
    private Target target;

    public ClickOnLogin(Target target) {
        this.target = target;
    }

    //Open.browserOn gets a page object
    @Override
    @Step("{0} click on login")
    public <T extends Actor> void performAs(T actor) {      //This method is default for the interface Task

        actor.attemptsTo(Click.on(target));
    }

    public static ClickOnLogin click(Target target) {
        return instrumented(ClickOnLogin.class, target);
    }
}
