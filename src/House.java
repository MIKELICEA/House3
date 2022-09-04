public class House{
    private final Kitchen kitchen;
    private final DiningRoom diningRoom;
    private final LivingRoom livingRoom;

    private final RestRoom []restRooms;
    private final BedRoom []bedRooms;
    private final Yard yard;
    private static int houseCount;
    public static int houseCount(){

        return houseCount;
    }

    public House(Kitchen kitchen, DiningRoom diningRoom, LivingRoom livingRoom, RestRoom[] restRooms, BedRoom[] bedRooms, Yard yard) {
        this.kitchen = kitchen;
        this.diningRoom = diningRoom;
        this.livingRoom = livingRoom;
        this.restRooms = restRooms;
        this.bedRooms = bedRooms;
        this.yard = yard;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public RestRoom[] getRestRoom() {
        return restRooms;
    }

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public Yard getYard() {
        return yard;
    }

    public static HouseBuilder builder(){
        return new HouseBuilder();
    }

}