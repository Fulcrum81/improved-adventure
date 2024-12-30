//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Laptop honor = new Laptop("Honor Super-Turbo-Mega", 16, 512, "AMD Ryzen 7", "1920X1080");

        honor.printLaptopInfo();

        Laptop macbook = new Laptop("Macbook Pro-turbo-pro", 32, 256, "Intel M3", "retina");

        macbook.printLaptopInfo();

        macbook.isTheSameAs(honor);

        honor.isTheSameAs(macbook);

        System.out.println(macbook.getLaptopInfo());

        for (int i = 2; i <= 64; i*=2) {
            System.out.printf("The expected ram %d is %ssufficient\n", i, macbook.areSpecsSufficient(i) ? "" : "not ");
        }

        System.out.println(honor.isTheSameAs(macbook));

        macbook.areSpecsSufficient("dsjkvbd");

        System.out.println(sum(1));
    }

    public static int sum(int i, int... numbers) {
//        if (numbers.length == 0) {
//            return 0;
//        }
        int sum = i;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
}