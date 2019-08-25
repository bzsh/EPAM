package by.etc.oop.task_five;

import java.util.ArrayList;
import java.util.Random;

public class Present {
    private Package aPackage;
    private ArrayList<Sweet> sweets;

    public Present() {
    }

    public Present(Package aPackage, ArrayList<Sweet> sweets) {
        this.aPackage = aPackage;
        this.sweets = sweets;
    }

    void createRandomPresent(int weight, String packageColor) {
        aPackage = new Package(weight, packageColor);
        sweets = new ArrayList<Sweet>();
        Random random = new Random();
        SweetFactory sf = new SweetFactory();
        int weightCounter = 0;
        TypeOfSweet[] arr = TypeOfSweet.values();

        while (weightCounter < weight) {
            int value = random.nextInt(arr.length);
            int rnd = random.nextInt(weight / 10);
            sweets.add(sf.getSweet(arr[value], rnd));
            weightCounter += rnd;
        }
    }

    void printPresent() {
        System.out.println("Подарок, цвет: " + aPackage.getColor() + ", вес брутто: " + aPackage.getCapacity() + ".");
        System.out.println("Содержимое подарка : ");
        for (Sweet sweet : sweets) {
            System.out.println(sweet.toString());
        }
    }
}
