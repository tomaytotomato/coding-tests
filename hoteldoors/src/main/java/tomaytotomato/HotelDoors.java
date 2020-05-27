package tomaytotomato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This challenge is similar to the the light bulb problem.
 * <p>
 * There are X rooms in a hotel, with X employees who all have keys to the rooms.
 * The first employee opened the doors to all the rooms, the second employee then closes the doors
 * of any room that is divisible by 2 i.e. (2,4,6,8,10)
 * <p>
 * The third employee then closes the doors of rooms if they are open, or opens them if they are closed for rooms
 * divisible by 3 (3,6,9,12,15) etc.
 * <p>
 * This pattern repeats until the last employee of x
 */
public class HotelDoors {
    public static void main(String[] args) {
        System.out.println("HotelDoors app!");
    }

    private static final String CLOSED = "C";
    private static final String OPEN = "O";

    public static int hotelDoors(int numberOfRooms) {

        if (numberOfRooms < 1) {
            return 0;
        }

        final List<String> rooms = new ArrayList<>(Collections.nCopies(numberOfRooms, CLOSED));
        int employee = 1;

        do {
            int roomNumberComputer = employee - 1;
            do {
                final String roomState = rooms.get(roomNumberComputer);

                if (roomState.equals(OPEN)) {
                    rooms.set(roomNumberComputer, CLOSED);
                } else if (roomState.equals(CLOSED)) {
                    rooms.set(roomNumberComputer, OPEN);
                }
                roomNumberComputer = roomNumberComputer + employee;
            } while (roomNumberComputer < numberOfRooms);
            employee++;
        } while (employee <= numberOfRooms);

        int openRooms = 0;
        for (String room : rooms) {
            if (room.equals(OPEN)) {
                openRooms++;
            }
        }
        return openRooms;
    }

    /**
     * Since each employee is only affecting doors that are divisible by their number then its a perfect square
     * <p>
     * Therefore if we square root the total number of rooms, this will give us all open rooms
     *
     * More info - https://math.stackexchange.com/questions/1173409/frogs-and-switches-problem-solving-strategies
     */
    public static int hotelDoorsOptimised(int numberOfRooms) {

        if (numberOfRooms < 1) {
            return 0;
        }

        return (int) (Math.sqrt(numberOfRooms));
    }

}
