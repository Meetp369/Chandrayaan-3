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
}
