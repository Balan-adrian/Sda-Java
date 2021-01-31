package fundamentals;

import java.util.Scanner;

public class TasksExercices {
//    public static final float pi = (float) Math.PI;
//
//
//    int x = 10;
//    static int y = 1;
//    //Write an application that will read diameter of a circle (variable of type float) and
//    //calculate perimeter of given circle.
//    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class
//
//    public static void perimeters() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Diametru este: ");
//        float diametru = scanner.nextFloat();
//        System.out.println("Perimetrul este " + diametru * pi);
//    }

    //Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
    //Your application should read two variables: weight (in kilograms, type float) and height
    //(in centimeters, type int). BMI should be calculated given following formula:
    //The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal
    //values. Your program should write "BMI optimal" or "BMI not optimal", according to the
    //assumptions above.
//    public static void BMI() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert your height in cm:");
//        int height = scanner.nextInt();
//        System.out.println("Insert your weight in kg:");
//        float weight = scanner.nextFloat();
//        float bmi = weight / ((float) height / 100 * (float) height / 100);
//        if ((bmi > 18.5f) && (bmi < 24.9)){
//            System.out.println(bmi + "BMI optional");}
//        else {
//            System.out.println(bmi + "BMI not optional");
    //  }}
    //Write an application that takes a positive number from the user (type int) and
    //writes all numbers from 1 to the given number, each on the next line,
    //with the following changes:
    //● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
    // ● in place of numbers divisible by 7, instead of a number the program should write "Buzz"
    // ● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"

    public static void fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduc numarul:");
        int numar = scanner.nextInt();
        for (int i = 1; i <= numar; i++) {
            if ((i % 3) == 0 && (i % 7) == 0) {
                System.out.println("Fizz buzz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    //Write an application that takes a positive number from the user (type int)
    // and prints all prime numbers greater than 1 and less than the given number.
    public static void toateNumerelePositive() {
        System.out.println("Introduc numarul:");
        Scanner scanner = new Scanner(System.in);
        int Numar = scanner.nextInt();
        if (Numar <= 1) {
            System.out.println("Numarul nu e mai mare de 1");
            return;
        } else {//cu return, else este inutil si se scoate
            for (int i = 2; i <= Numar; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }

    }

    private static boolean isPrime(int nr) {
        for (int i = 2; i < nr; i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime1(int nr) {
        if (nr == 2) {
            return true;
        }
        if (nr == 0 || nr == 1 || nr % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= nr; i += 2) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

//Write an application that will read texts (variables of the String type) until the user
//gives the text "Enough!" and then writes the longest of the given texts
//(not including the text "Enough!"). If the user does not provide any text, write "No text provided".

    public static void longestWord() {
        System.out.println("Type your word: ");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestWord = "";
        do {
            word = scanner.next();
            if (!word.equals("Enough!") && longestWord.length() < word.length()) {
                longestWord = word;
            }
        } while (!word.equals("Enough!"));
        if (longestWord.length() == 0) {
            System.out.println("No text provided");
            return;
        }
        System.out.println("Longest word is: " + longestWord);
    }

    //Write an application that "stutters", that is, reads the user's text (type String),
    //and prints the given text, in which each word is printed twice.
    //For example, for the input: "This is my test" the application should print
    //"This This is is my my test test".

    public static void stutters() {
    System.out.println("Type your word: ");
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    String[] words = text.split(" ");
        System.out.print("Stutter: ");
    for (int i = 0; i < words.length - 1; i++) {
        System.out.print(words[i] + " " + words[i] + " ");
    }
        System.out.print(words[words.length - 1] + " " + words[words.length - 1]);
    }

    public static void testString () {
        String s1 = "abc", s2 = "abc", s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }

    public static void textObject() {
        Dog dog1 = new Dog("Azorel");
//        dog1.setName("Azorel");

        Dog dog2 = new Dog("Azorel");
//        dog2.setName("Azorel");

        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.getName().equals(dog2.getName()));
    }
}
