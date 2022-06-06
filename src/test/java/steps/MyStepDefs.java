package steps;

import io.cucumber.java.en.And;

import static steps.Hooks.currentScenario;

public class MyStepDefs {

    @And("test logging {int}")
    public void testLogging(int number) {
        currentScenario.log("Test message " + number);
        currentScenario.log("Test message " + number);
    }

}
