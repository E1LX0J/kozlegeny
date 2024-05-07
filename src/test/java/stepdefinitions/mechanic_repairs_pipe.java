package stepdefinitions;

import container.Container;
import container.Pipe;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import player.Mechanic;

public class mechanic_repairs_pipe {
    private Mechanic mechanic;
    private Container position;

    @Given("a mechanic at a position that is pipe")
    public void aMechanicAtAPositionPipe() {
        position = new Pipe();
        position.puncturePipe();
        mechanic = new Mechanic(position);
    }


    @When("the mechanic repairs a pipe")
    public void theMechanicRepairsAPipe() {
        mechanic.RepairPipe();
    }

    @Then("the pipe should be mended")
    public void thePipeShouldBeMended() {
        Assert.assertFalse(position.isDamaged());
    }

}
