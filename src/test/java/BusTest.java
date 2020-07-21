import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        this.bus = new Bus("Edinburgh", 10);
        this.person = new Person();
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
}
