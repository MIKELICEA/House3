public class DiningRoom {
    private int windows;
    private boolean tv;
    private int width;
    private int height;
    private String color;
    private int chairsCapacity;

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public boolean getTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int geight) {
        this.height = geight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChairsCapacity() {
        return chairsCapacity;
    }

    public void setChairsCapacity(int chairsCapacity) {
        this.chairsCapacity = chairsCapacity;
    }
    DiningRoom(DiningRoomBuilder builder){
        this.windows = builder.build().getWindows();
        this.tv = builder.build().getTv();
        this.width = builder.build().getWidth();
        this.height = builder.build().getHeight();
        this.color = builder.build().getColor();
        this.chairsCapacity = builder.build().getChairsCapacity();
    }
    public static DiningRoomBuilder builder(){
        return new DiningRoomBuilder();
    }
}