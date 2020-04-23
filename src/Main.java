import house.House;

public class Main {

    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roof")
                .buildWindows("windows")
                .buildDoors("doors")
                .buildGarage("garage")
                .build();

        System.out.println(house);
    }
}
