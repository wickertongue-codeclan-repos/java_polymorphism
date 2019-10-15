import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {
    InternetRadio internetRadio;

    @Before
    public void before() {
        this.internetRadio = new InternetRadio();
    }

    @Test
    public void canConnect() {
        assertEquals("connecting to network: CodeClan", internetRadio.connect("CodeClan"));
    }

    @Test
    public void canTuneToStation() {
        assertEquals("Radio Six", internetRadio.tune());
    }

}
