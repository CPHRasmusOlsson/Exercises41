package Task2;

public class Room {

    private final Walls wall;
    private final int numberOfDoors;
    private final int numberOfLamps;
    private final int numberOfWindows;

    public Room(Walls wall, int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.wall = wall;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public Walls getWall() {
        return wall;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
