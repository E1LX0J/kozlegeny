package stepdefinitions;

import container.Container;
import container.Pump;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import player.Mechanic;

public class mechanic_repairs_pump {

    private Mechanic mechanic;
    private Container position;

    @Given("a mechanic at a position that is pump")
    public void aMechanicAtAPositionPump() {
        position = new Pump(0);
        position.damageContainer();
        mechanic = new Mechanic(position);
    }

    @When("the mechanic repairs a pump")
    public void theMechanicRepairsAPump() {
        mechanic.RepairPump();
    }

    @Then("the pump should be mended")
    public void thePumpShouldBeMended() {
        Assert.assertFalse(position.isDamaged());
    }

}
