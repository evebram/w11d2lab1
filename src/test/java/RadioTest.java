import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio;

    @Before
    public void setUp(){
        radio = new Radio("Sony", "V8", 5);
    }

    @Test
    public void canTune(){
        assertEquals("Tuned in to station", radio.Tune());
    }

    @Test
    public void canTurnVolumeUp(){
        radio.volumeUp();
        assertEquals(6, radio.getVolume());
    }

    @Test
    public void canTurnVolumeDown(){
        radio.volumeDown();
        assertEquals(4, radio.getVolume());
    }

}
