package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    public static Scenario currentScenario;

    @Before
    public static void before(Scenario scenario) {
        currentScenario = scenario;
    }

}