public class DiningRoom {
    private final int  windows;
    private final boolean tv;
    private final int width;
    private final int height;
    private final String color;
    private final int chairsCapacity;

    private static int diningRoomCount;
    public static int getDiningRoomCount(){
        return diningRoomCount;
    }

    public DiningRoom(int windows, boolean tv, int width, int height, String color, int charisCapacity){
        this.windows = windows;
        this.tv = tv;
        this.width = width;
        this.height = height;
        this.color = color;
        this. chairsCapacity = charisCapacity;
        diningRoomCount++;
    }
    public int getWindows() {
        return windows;
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
    public int getChairsCapacity() {
        return chairsCapacity;
    }

    public String toString(){
        return  "Dining Rooom: "+
                "\n  Windows -> "+this.windows+
                "\n  TV -> "+this.tv+
                "\n  Width -> "+this.width+
                "\n  Height -> "+this.height+
                "\n  Color-> "+this.color+
                "\n  Chairs  -> "+this.chairsCapacity;
    }

    public static DiningRoomBuilder builder(){
        return new DiningRoomBuilder();
    }
}