import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        this.busStop = new BusStop("George St");
        this.person = new Person();
    }

    @Test
    public void canAddToQueue() {
        busStop.addToQueue(person);
        assertEquals(1, busStop.countQueuers());
    }

    @Test
    public void canRemoveFromQueue() {
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(0, busStop.countQueuers());
    }
}
