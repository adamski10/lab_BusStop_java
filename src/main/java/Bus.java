import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();

    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (countPassengers() < this.capacity) {
            this.passengers.add(person);
        }
    }


    public Person removePassenger() {
        return passengers.remove(0);
    }
}
