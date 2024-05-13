package junit;

import container.Container;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import player.Player;

public class PlayerActionTest {

    Player player;
    Container container1;
    Container container2;

    @BeforeEach
    public void setUp(){
        player = null;
        container1 = null;
        container2 = null;
    }

    @Test
    @DisplayName("")
    public void movesFromPipeToPump(){
        Assert.assertTrue("wow", true);
    }
}
