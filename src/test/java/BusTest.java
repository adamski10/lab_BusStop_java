import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        this.bus = new Bus("Edinburgh", 10);
        this.person = new Person();
        this.busStop = new BusStop("George Street");
        this.busStop.addToQueue(person);
        this.busStop.addToQueue(person);
    }

    @Test
    public void checkIfStartsEmpty() {
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void checkCanAddPassenger(){
        this.bus.addPassenger(this.person);
        assertEquals(1, bus.countPassengers());
    }

    @Test
    public void canRemovePassenger() {
        this.bus.addPassenger(person);
        this.bus.removePassenger();
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canPickupPerson(){
        this.bus.pickUp(busStop);
        assertEquals(1, this.bus.countPassengers());
    }
}
