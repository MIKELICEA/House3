public class TestBuilderPAtterns {
    public static void main(String [] args){
        DiningRoom diningRoom1 = new DiningRoom(1, true, 100, 10, "red", 8);

        House house = House.builder()
                .kitchen(Kitchen.builder()
                        .stove(true)
                        .sink(true)
                        .windows(1)
                        .refrigerator(true)
                        .oven(false)
                        .width(3)
                        .height(4)
                        .color("red")
                        .build())
                .diningRoom(DiningRoom.builder()
                        .windows(2)
                        .tv(false)
                        .width(5)
                        .height(5)
                        .color("white")
                        .chairsCapacity(8)
                        .build())
                .bedRooms(BedRoom.builder()
                        .bedSize(BedSize.queen)
                        .tv(false)
                        .width(5)
                        .height(5)
                        .color("blue")
                        .build())
                .build();
    }

}
