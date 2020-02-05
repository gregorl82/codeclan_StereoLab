import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RadioTest {

    private Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sonos", "Model 1");
    }

    @Test
    public void hasMake(){
        assertEquals("Sonos", radio.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Model 1", radio.getModel());
    }

    @Test
    public void isNotTunedToStation(){
        assertNull(radio.getTunedStation());
    }

    @Test
    public void canTuneToAStation(){
        radio.tuneToStation("Radio 1");
        assertEquals("Radio 1", radio.getTunedStation());
    }

}
