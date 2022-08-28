public class HouseBuilder{

    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom []restRooms;
    private BedRoom []bedRooms;
    private Yard yard;

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public RestRoom[] getRestRooms() {
        return restRooms;
    }

    public void setRestRooms(RestRoom[] restRooms) {
        this.restRooms = restRooms;
    }

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(BedRoom[] bedRooms) {
        this.bedRooms = bedRooms;
    }

    public Yard getYard() {
        return yard;
    }

    public void setYard(Yard yard) {
        this.yard = yard;
    }

    HouseBuilder(){
    }
    public House build(){
        House house = new House(this);
        return house;
    }
}