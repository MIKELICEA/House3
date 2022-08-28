public class BedRoom {

    private BedSize bedSize;
    private boolean tv;
    private int width;
    private int height;
    private String color;

    public BedSize getBedSize() {
        return bedSize;
    }

    public void setBedSize(BedSize bedSize) {
        this.bedSize = bedSize;
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

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    BedRoom(BedRoomBuilder builder){
        this.bedSize = builder.build().getBedSize();
        this.tv = builder.build().getTv();
        this.width = builder.build().getWidth();
        this.height = builder.build().getHeight();
        this.color = builder.build().getColor();
    }
    public static BedRoomBuilder builder(){
        return new BedRoomBuilder();
    }
}


enum BedSize {
    individual, matrimonial, queen, king;
}