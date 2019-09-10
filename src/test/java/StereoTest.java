import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    ArrayList<Component> components;
    Radio radio;


    @Before
    public void setUp(){
        radio = new Radio("Sony", "M8", 5);
        components = new ArrayList<Component>();
        components.add(radio);
        stereo = new Stereo("Harry", components);
    }

    @Test
    public void canPowerOn(){
        assertEquals("Radio has been turned on.", this.components.get(0).PowerOn("Radio"));
    }

    @Test
    public void canTune(){
        assertEquals("Tuned in to station", radio.Tune());

    }

    @Test
    public void canConnect(){
        assertEquals("Harry", stereo.connect(stereo));
    }

}
