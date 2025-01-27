import goods.Good;
import goods.electronics.Laptop;
import goods.electronics.MobilePhone;
import goods.electronics.components.Processor;
import goods.grocery.Fruit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final String myConstantString = "This is my constant string";
    public final int[] constantArray = { 10, 15, 20 };

    private static String filePath = "D:\\library.txt";

    public static void main(String[] args) {

        readProperties();

//        Book book1 = new Book("War & Peace p1", "Leo Tolstoy", 1999, 999);
//        Book book2 = new Book("Johnny got his gun", "Dalton Trumbo", 2005, 250);

//        ArrayList<Book> library = readFromFile();
//
//        library.stream().forEach(System.out::println);

//        library.add(book1);
//        library.add(book2);
//        library.add(new Book("Eugene Onegin", "Alexander Pushkin", 1879, 150));
//
//

//        collections();
//        writeToFile(library);
//        readFromFile();
//        divideTwoNumbers();
//
//        System.out.println("Bye");

//        Laptop honor = new Laptop("Honor Super-Turbo-Mega", 16, 512, Processor.amd,
//                "1920X1080", "16 million", 60, 1200);
//
//        System.out.println(honor.getLaptopInfo());
//
//        System.out.println(honor.getProcessor().getNameAndCode());

//
//        MobilePhone iPhone13 = new MobilePhone(700);
//
//        Laptop macbook = new goods.electronics.Laptop("Macbook Pro-turbo-pro", 32, 256,
//                "Intel M3", "retina", 2500);
//
//        printPriceOfLaptops(honor, macbook, iPhone13);

//
//        macbook.printLaptopInfo();
//
//        macbook.isTheSameAs(honor);
//
//        honor.isTheSameAs(macbook);
//
//        System.out.println(macbook.getLaptopInfo());
//
//        for (int i = 2; i <= 64; i *= 2) {
//            System.out.printf("The expected ram %d is %ssufficient\n", i, macbook.areSpecsSufficient(i) ? "" : "not ");
//        }
//
//        System.out.println(honor.isTheSameAs(macbook));
//
//        macbook.areSpecsSufficient("dsjkvbd");
//
//        System.out.println(sum(1));
    }

    public static void printPriceOfLaptops(Good... goods) {
        double finalPrice = 0;

        for (Good good : goods) {
            finalPrice += good.getPrice();
        }

        System.out.println(finalPrice);
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

    public static void divideTwoNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter divided number: ");
        int a = scanner.nextInt();
        System.out.println("Please enter divider: ");
        int b = scanner.nextInt();
        try {
            int[] array = new int[] {1, 2, 3};
            System.out.println("a / b = " + (a / b));

            System.out.println(array[10]);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by 0\nFull error message: " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds\nFull error message: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("You should enter a number! Idiot!\nFull error message: " + e.getMessage());
        }
    }

    public static int divideTwoNumbers(int a, int b) {
        return a / b;
    }

    public static void collections() {
        ArrayList<String> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String book;

        do {
            System.out.println("Please enter the name of your favorite book (Enter to exit): ");
            book = scanner.nextLine();
            books.add(book);
        } while (!book.isEmpty());

        for (String item : books) {
            System.out.println(item);
        }

        List<String> result = books.stream().filter(bookFromStream -> bookFromStream.equals("A")).toList();

        result.stream().forEach(System.out::println);
    }

    public static void writeToFile(ArrayList<Book> library) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);

            for (Book book : library) {
                fileWriter.write(book.name + "~" + book.author + "~" + book.year + "~" + book.numberOfPages + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }

    public static ArrayList<Book> readFromFile() {

        ArrayList<Book> libraryFromFile = new ArrayList<>();
        File file = new File(filePath);

        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()) {
                String bookString = scanner.nextLine();
                //War & Peace p1~Leo Tolstoy~1999~999
                String[] parsedBook = bookString.split("~");

                libraryFromFile.add(new Book(parsedBook[0], parsedBook[1], Integer.parseInt(parsedBook[2]),
                        Integer.valueOf(parsedBook[3])));
            }

        } catch (IOException e) {
            System.out.println("Sorry, cannot read from file");
        }
        return libraryFromFile;
    }

    public static void readProperties() {
        Properties props = new Properties();

        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            props.load(fis);
        } catch (IOException e) {
            System.out.println("Couldn't read from property file\n" + e.getMessage());
        }

        System.out.println(props.getProperty("test.user.1.username"));

    }


}