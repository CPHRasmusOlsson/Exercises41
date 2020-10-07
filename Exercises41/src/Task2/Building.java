package Task2;

import java.util.ArrayList;

public class Building {
    private final ArrayList<Room> rooms;
    private final int numberOfBathrooms;
    private final int numberOfFloors;
    private final boolean isOfficeBuilding;

    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean getOfficeBuilding() {
        return isOfficeBuilding;
    }

    public void getTotalLamps() {
        int totalLamps = 0;
        for (Room room : rooms) {
            totalLamps += room.getNumberOfLamps();
        }
        System.out.println("the total amount of lamps in the building is: " + totalLamps);
    }
}
