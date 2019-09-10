import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio;

    @Before
    public void setUp(){
        radio = new Radio("Sony", "V8");
    }

    @Test
    public void canTune(){
        assertEquals("Tuned in to station", radio.Tune());
    }

}
