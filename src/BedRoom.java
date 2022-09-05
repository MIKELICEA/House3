public class BedRoom {

    private final BedSize bedSize;
    private final boolean tv;
    private final int width;
    private final int height;
    private final String color;
    private static int bedRoomCount;
    public static int bedRoomCount(){
        return bedRoomCount;
    }
    public BedRoom(BedSize bedSize, boolean tv, int width, int height, String color) {
        this.bedSize = bedSize;
        this.tv = tv;
        this.width = width;
        this.height = height;
        this.color = color;

        bedRoomCount++;
    }

    public BedSize getBedSize() {
        return bedSize;
    }
    public boolean getTv() {
        return tv;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String toString(){
        return  "Bed Rooom: "+
                "\n  BedSize -> "+this.bedSize+
                "\n  TV -> "+this.tv+
                "\n  Width -> "+this.width+
                "\n  Height -> "+this.height+
                "\n  Color-> "+this.color;
    }

    public static BedRoomBuilder builder(){
        return new BedRoomBuilder();
    }
}
enum BedSize {
    individual, matrimonial, queen, king;
}