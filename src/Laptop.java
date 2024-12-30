import java.util.Scanner;

public class Laptop {

    public String name;
    public int ram;
    public int ssd;
    public String processor;
    public String resolution;

    public Laptop(String name, int ram, int ssd, String processor, String resolution) {
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.processor = processor;
        this.resolution = resolution;
    }

    public void printLaptopInfo() {
        System.out.printf("\nName: %s\nRAM: %d\nSSD volume: %d\nProcessor: %s\nScreen resolution: %s\n", name, ram, ssd, processor,
                resolution);
    }

    public String getLaptopInfo() {
        return String.format("\nName: %s\nRAM: %d\nSSD volume: %d\nProcessor: %s\nScreen resolution: %s\n", name, ram, ssd, processor,
                resolution);
    }

    public boolean areSpecsSufficient(int expectedRam) {
        return ram >= expectedRam;
    }

    public boolean areSpecsSufficient(int expectedRam, int expectedSsd) {
        return ram >= expectedRam && ssd >= expectedSsd;
    }

    public boolean areSpecsSufficient(String processor) {
        return processor.length() > 10;
    }



    public boolean isTheSameAs(Laptop anotherLaptop) {

        return processor.equals(anotherLaptop.processor) && ram == anotherLaptop.ram && resolution
                .equals(anotherLaptop.resolution) && ssd == anotherLaptop.ssd;
    }

}
