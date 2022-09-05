public class House{
    private final Kitchen kitchen;
    private final DiningRoom diningRoom;
    private final LivingRoom livingRoom;

    private final RestRoom restRoom;
    private final BedRoom bedRoom;
    private final Yard yard;
    private static int houseCount;
    public static int houseCount(){

        return houseCount;
    }

    public House(Kitchen kitchen, DiningRoom diningRoom, LivingRoom livingRoom, RestRoom restRoom, BedRoom bedRoom, Yard yard) {
        this.kitchen = kitchen;
        this.diningRoom = diningRoom;
        this.livingRoom = livingRoom;
        this.restRoom = restRoom;
        this.bedRoom = bedRoom;
        this.yard = yard;

        houseCount++;
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

    public RestRoom getRestRoom() {
        return restRoom;
    }

    public BedRoom getBedRooms() {
        return bedRoom;
    }

    public Yard getYard() {
        return yard;
    }

    public static HouseBuilder builder(){
        return new HouseBuilder();
    }

}