class Kitchen {

    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;
    private int width;
    private int heiht;
    private String color;

    public void setStove(boolean stove) {
        this.stove = stove;
    }
    public boolean getStove() {
        return stove;
    }

    public void setSink(boolean sink){ //setter
        this.sink = sink;
    }

    public boolean getSink() {
        return sink;
    }

    public void setWindows(int windows){ //setter
        if(windows >= 0 && windows < 4){
            this.windows = windows;
        }
    }
    public int getWindows() {
        return windows;
    }

    public boolean getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(boolean refrigerator) {
        this.refrigerator = refrigerator;
    }

    public void setOven(boolean oven) {
        this.oven = oven;
    }

    public boolean getOven() {
        return oven;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeiht() {
        return heiht;
    }

    public void setHeiht(int heiht) {
        this.heiht = heiht;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
