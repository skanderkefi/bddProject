package testProject2.bddProject.OrderingsmoothiesTest;

import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = "src/test/ressources/features.loyalty_cards")

public class OrderingTest {

}
