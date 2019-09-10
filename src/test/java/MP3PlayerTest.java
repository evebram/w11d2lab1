import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {

    MP3Player mp3Player;
    Stereo stereo;
    ArrayList<Component> components;

    @Before
    public void setUp(){
        mp3Player = new MP3Player("Creative Labs", "S1.2", 7);
        components = new ArrayList<Component>();
        stereo = new Stereo("Harriet", components);
    }

    @Test
    public void canConnect(){
        assertEquals("Harriet", mp3Player.connect(stereo));
    }

}
