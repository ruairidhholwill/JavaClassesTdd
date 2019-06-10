import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void Before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void getVolume(){
        assertEquals(100.0, waterBottle.getVolume(), 0.01);
    }

    @Test
    public void drinkReducesVolumeBy10(){
        assertEquals(90.0, waterBottle.drink());
    }

    @Test
    public void volumeCanEmptyTo0(){
        assertEquals(0.0, waterBottle.emptyVolume());
    }

    @Test
    public void volumeCanFillTo100(){
        assertEquals(100.0, waterBottle.fillVolume());
    }

}
