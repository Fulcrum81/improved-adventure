package goods.electronics;

import goods.Good;

public class Laptop extends Good {

    private String name;
    private int ram;
    private int ssd;
    private String processor;
    private String resolution;

    public Laptop(String name, int ram, int ssd, String processor, String resolution, double price) {
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.processor = processor;
        this.resolution = resolution;
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int newRam) {
        if (newRam % 2 == 0) {
            ram = newRam;
        } else {
            System.out.println("Couldn't set ram because the value is incorrect");
        }
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
        printIAmALaptop();
        return processor.length() > 10;
    }



    public boolean isTheSameAs(Laptop anotherLaptop) {

        return processor.equals(anotherLaptop.processor) && ram == anotherLaptop.ram && resolution
                .equals(anotherLaptop.resolution) && ssd == anotherLaptop.ssd;
    }

    public static void printIAmALaptop() {
        System.out.println("I am a laptop");
    }

    @Override
    public double getPrice() {
        return price * 1.5;
    }

}
