package Task2;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Walls walls = new Walls();
        Room room1 = new Room(walls, 2, 4, 2);
        Room room2 = new Room(walls, 1, 12, 1);
        Room room3 = new Room(walls, 3,3,6);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms,1,4,false);
        building.getTotalLamps();
        if(building.getNumberOfFloors()>building.getRooms().size()){
            System.out.println("This is an odd building");
        }
    }
}
