public class HouseBuilder{

    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom []restRooms;
    private BedRoom []bedRooms;
    private Yard yard;

    public HouseBuilder kitchen(final Kitchen kitchen){
        this.kitchen = kitchen;
        return this;
    }

    public HouseBuilder diningRoom(final DiningRoom diningRoom){
        this.diningRoom = diningRoom;
        return this;
    }

    public HouseBuilder livingRoom(final LivingRoom livingRoom){
        this.livingRoom = livingRoom;
        return this;
    }

    public HouseBuilder restRooms(final RestRoom restRooms){
        this.restRooms = restRooms;
        return this;
    }

    public HouseBuilder bedRooms (final BedRoom bedRooms){
        this.bedRooms = bedRooms;
        return this;
    }

    public HouseBuilder yard (final Yard yard){
        this.yard = yard;
        return this;
    }

    public House build(){
        return new House(kitchen, diningRoom, livingRoom, restRooms, bedRooms, yard);
    }

}