import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChandrayaanTest {

    @Test
    public void startingDirectionAndPosition() {
        GetDirectionAndPosition gdp= new GetDirectionAndPosition(0, 0, 0, "N");
        assertTrue((gdp.direction.equals("N" )) && (gdp.x==0)&& (gdp.y==0)&& (gdp.z==0) );
    }

    @Test
    public void moveForward() {
        GetDirectionAndPosition gdp = new GetDirectionAndPosition(0, 0, 0, "N");
        gdp.forward();

        assertEquals(0, gdp.x);
        assertEquals(1, gdp.y);
        assertEquals(0, gdp.z);
        assertEquals("N", gdp.direction);
    }

    @Test
    public void moveBackward() {
        GetDirectionAndPosition gdp = new GetDirectionAndPosition(0, 0, 0, "N");
        
        gdp.backward();

        assertEquals(0, gdp.x);
        assertEquals(-1, gdp.y);
        assertEquals(0, gdp.z);
        assertEquals("N", gdp.direction);
    }

    @Test
    public void turnLeft() {
        GetDirectionAndPosition gdp = new GetDirectionAndPosition(0, 0, 0, "N");

        gdp.left();

        assertEquals(0, gdp.x);
        assertEquals(0, gdp.y);
        assertEquals(0, gdp.z);
        assertEquals("W", gdp.direction);
    }

    @Test
    public void turnRight() {
        GetDirectionAndPosition gdp = new GetDirectionAndPosition(0, 0, 0, "N");
        gdp.right();

        assertEquals(0, gdp.x);
        assertEquals(0, gdp.y);
        assertEquals(0, gdp.z);
        assertEquals("E", gdp.direction);
 
    }

    @Test
    public void turnUp() {
        GetDirectionAndPosition gdp = new GetDirectionAndPosition(0, 0, 0, "N");
        gdp.turnUpSide();;

        assertEquals(0, gdp.x);
        assertEquals(0, gdp.y);
        assertEquals(0, gdp.z);
        assertEquals("Up", gdp.direction);
    }


    @Test
    public void turnDown() {
        GetDirectionAndPosition gdp = new GetDirectionAndPosition(0, 0, 0, "N");
        gdp.turnDownSide();

        assertEquals(0, gdp.x);
        assertEquals(0, gdp.y);
        assertEquals(0, gdp.z);
        assertEquals("Down", gdp.direction);
    }

    @Test
    public void turnUpchangeDirection() {
        GetDirectionAndPosition gdp = new GetDirectionAndPosition(0, 0, 0, "N");
        gdp.turnUpSide();

        assertEquals(0, gdp.x);
        assertEquals(0, gdp.y);
        assertEquals(0, gdp.z);
        assertEquals("Up", gdp.direction);
    }
    
    @Test
    public void turnDownchangeDirection() {
        GetDirectionAndPosition gdp = new GetDirectionAndPosition(0, 0, 0, "N");

        gdp.turnDownSide();

        assertEquals(0, gdp.x);
        assertEquals(0, gdp.y);
        assertEquals(0, gdp.z);
        assertEquals("Down", gdp.direction);
    }

    @Test
    public void testExecuteCommands() {
        
        String[] cmd = {"f", "r", "u", "b", "l"};

        Commands c = new Commands();
        c.giveCommands(cmd);

        
        assertEquals(0, c.finalX);
        assertEquals(1, c.finalY);
        assertEquals(-1, c.finalZ);
        assertEquals("N", c.finalDirection);
    }

    

}
