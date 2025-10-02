package Z1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));

        System.out.println("В лесу лето!");
        Forest f1 = new Forest(hares);
        f1.setSeason("лето");
        // создайте объект "летний лес с зайцами"

        System.out.println("Список зайцев:");
        f1.printHares();
        // напечатайте список всех зайцев

        System.out.println("В лесу зима!");
        f1.setSeason("зима");
        // поменяйте время года на зиму

        System.out.println("Список зайцев:");
        f1.printHares();
        // напечатайте список всех зайцев
    }

}