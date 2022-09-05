public class RestRoom{
    private boolean showerCabin;
    private int width;
    private int height;
    private String color;
    private static int restRoomCount;
    public static int restRoomCount(){
        return restRoomCount;
    }

    public RestRoom(boolean showerCabin, int width, int height, String color) {
        this.showerCabin = showerCabin;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public boolean getShowerCabin() {
        return showerCabin;
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
}