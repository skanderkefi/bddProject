package testProject.bddProject.calculatorTest;

import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = "src/test/ressources")

public class CalculatorTest {

}
