package fundamentals;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Hello World");
//Write an application that will read diameter of a circle (variable of type float) and
//calculate perimeter of given circle.
//Firstly, assume π = 3.14. Later, use value of π from built-in Math class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diametru este: ");
        float diametru = scanner.nextFloat();
        float pi = 3.14f;
        System.out.println("Perimetrul este " + diametru * pi);
    }
}
