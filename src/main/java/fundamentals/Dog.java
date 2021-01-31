package fundamentals;

import java.util.Scanner;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Dog dog) {
        return (this.name == dog.getName());
    }


    public static void latra() {
        System.out.println("Woof-Woof");
    }

    public static void mananca(int nrGraunte) {
        System.out.println("Mananca " + nrGraunte + " graunte");
        short x = 12;
        byte y = 60;
        System.out.println(x + y + nrGraunte);
        System.out.println(x--);
        int a = ++x + x-- + x++ - --x;
        System.out.println(a);
    }

    public static void varsta(int a) {
        if (a <= 2) {
            System.out.println("Dog este pui");
        } else if (a <= 7) {
            System.out.println("Dog este tanar");
        } else if (a <= 12) {
            System.out.println("Dog este adult");
        } else if (a <= 20) {
            System.out.println("Dog este batran");
        } else {
            System.out.println("Dog este mort");
        }
    }

    public static void rasa(int i) {
        switch (i) {
            case 1:
                System.out.println("Chiwawa");
            case 2:
                System.out.println("Dachshund");
                break;
            case 3:
                System.out.println("Labrador");
            case 4:
                System.out.println("Dalmata");
                break;
            case 5:
                System.out.println("Great Dane");
                break;
            case 6:
                System.out.println("Greyhound");
                break;
            case 7:
                System.out.println("Husky");
            case 8:
                System.out.println("German shepherd");
                break;
            case 9:
                System.out.println("Peetbull");
                break;
            case 10:
                System.out.println("Doberman");
                break;
            default:
                System.out.println("Nu cunosc rasa");
        }
    }

    public static void marime(int x) {
        while (x > 25) {
            System.out.println("Marimea este: " + x);
            x--;
        }
        for (int i = 10; i < 15; i++) {
            System.out.println("Marimea este " + i);
        }
    }
}

class Cat {
    static void toarce() {
        System.out.println("Miao");
    }
}

