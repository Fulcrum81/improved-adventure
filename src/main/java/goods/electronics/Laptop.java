package goods.electronics;

import goods.Good;
import goods.electronics.components.Monitor;
import goods.electronics.components.Processor;

public class Laptop extends Good {

    private String name;
    private int ram;
    private int ssd;
    private Processor processor;
    private Monitor monitor;

    public Laptop(String name, int ram, int ssd, Processor processor, Monitor monitor, double price) {
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.processor = processor;
        this.monitor = monitor;
        this.price = price;
    }

    public Laptop(String name, int ram, int ssd, Processor processor, String resolution, String colors,
                  int refreshRate, double price) {
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.processor = processor;
        this.monitor = new Monitor(resolution, colors, refreshRate);
        this.price = price;
    }

    public Monitor getMonitor() {
        return monitor;
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

    public Processor getProcessor() {
        return processor;
    }

    public void printLaptopInfo() {
        System.out.printf("\nName: %s\nRAM: %d\nSSD volume: %d\nProcessor: %s\nScreen resolution: %s\n", name, ram, ssd, processor,
                monitor);
    }

    public String getLaptopInfo() {
        return String.format("\nName: %s\nRAM: %d\nSSD volume: %d\nProcessor: %s\nScreen resolution: %s\n", name, ram, ssd, processor,
                monitor);
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

        return processor.equals(anotherLaptop.processor) && ram == anotherLaptop.ram && monitor
                .equals(anotherLaptop.monitor) && ssd == anotherLaptop.ssd;
    }

    public static void printIAmALaptop() {
        System.out.println("I am a laptop");
    }

    @Override
    public double getPrice() {
        return price * 1.5;
    }

}
