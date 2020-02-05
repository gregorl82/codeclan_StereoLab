import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CDPlayerTest {

    private CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "3498349");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("3498349", cdPlayer.getModel());
    }

    @Test
    public void isNotPlayingAtStart(){
        assertFalse(cdPlayer.isPlaying());
    }

    @Test
    public void canPlay(){
        cdPlayer.play();
        assertTrue(cdPlayer.isPlaying());
    }

    @Test
    public void canPause(){
        cdPlayer.play();
        String output = cdPlayer.pause();
        assertEquals("Track paused", output);
        assertFalse(cdPlayer.isPlaying());
    }

    @Test
    public void canStop(){
        cdPlayer.play();
        cdPlayer.stop();
        assertFalse(cdPlayer.isPlaying());
    }

    @Test
    public void canEject(){
        assertEquals("CD Ejected", cdPlayer.eject());
    }

    @Test
    public void canSkip(){
        assertEquals("Track skipped", cdPlayer.skip());
    }

}
