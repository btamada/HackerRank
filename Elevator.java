import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

/**
 * Created by Bryan Tamada on 12/8/15.
 */
public class Elevator extends Exception {

    final int MAX_CAPACITY = 3000;
    final int MAX_FLOOR = 30;
    int capacity;
    int floor;
    boolean doorOpen = false;

    public Elevator() {
        this.floor = 0;
        this.capacity = 0;
    }

    public void move(int floor, int capacity) {
        if(capacity > MAX_CAPACITY) throw new IllegalArgumentException("Capacity Exceeded!");
        if(floor < 0 || floor > MAX_FLOOR) throw new IllegalArgumentException("No such floor!");
        else this.capacity = capacity;
        if(this.doorOpen) closeDoorBtn();
        else openDoorBtn();
        if(floor < 0) {
            this.floor -= floor;
        }
        if(floor >= 0) {
            this.floor += floor;
        }
        if(this.doorOpen == false) openDoorBtn();
        else closeDoorBtn();
    }

    public void closeDoorBtn() {
        if(doorOpen == true) {
            this.doorOpen = false;
        }
    }

    public void openDoorBtn() {
        if(doorOpen == false) {
            this.doorOpen = true;
        }
    }

    public void getCurrentFloor() {
        System.out.println("You are now on floor: " + this.floor + ".  Have a nice day!");
    }

    public void callElevator(boolean btn, int floor, int capacity, boolean emergency) {
        if(capacity > MAX_CAPACITY) throw new IllegalArgumentException("Capacity Exceeded!");
        if(floor < 0 || floor > MAX_FLOOR) throw new IllegalArgumentException("No such floor!");
        if(emergency) throw new RuntimeException("EMERGENCY: Elevator Stopped!");
        if(btn == true) {
            move(floor, capacity);
            getCurrentFloor();
        }
    }
}
