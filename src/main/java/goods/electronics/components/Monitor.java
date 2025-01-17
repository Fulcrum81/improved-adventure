package goods.electronics.components;

public class Monitor {

    String resolution;
    String colorMap;
    int refreshRate;

    public Monitor(String resolution, String colorMap, int refreshRate) {
        this.resolution = resolution;
        this.colorMap = colorMap;
        this.refreshRate = refreshRate;
    }

    @Override
    public String toString() {
        return (resolution + "\ncolors: " + colorMap + "\nrefresh: " + refreshRate);
    }

}
