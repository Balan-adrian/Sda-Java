package fundamentals;

import java.util.Scanner;

public class TasksExercices {
    public static final float pi = (float) Math.PI;


    int x = 10;
    static int y = 1;
    //Write an application that will read diameter of a circle (variable of type float) and
    //calculate perimeter of given circle.
    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class

    public static void perimeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diametru este: ");
        float diametru = scanner.nextFloat();
        System.out.println("Perimetrul este " + diametru * pi);
    }
}
