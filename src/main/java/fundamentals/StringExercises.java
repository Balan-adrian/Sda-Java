package fundamentals;

public class StringExercises {

//Write a Java program to get the character at the given index within the String

    public static void findCharIndex(int index) {
        String a = "COMPUTER";
        char[] charArray = a.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (index == i) {
                System.out.println("The character getting by index is: " + charArray[i]);
            }
        }
    }

//Write a Java program to test if a given string contains the specified sequence of char values (another string).

    public static void valuesSpecificSequence(String a) {
        String b = "Dog is black";
        System.out.println(b.contains(a));
    }

//Write a Java program to replace a specified character with another character in a string.

    public static void replaceCharacter() {
        String a = "Dog isn't black";
        System.out.println("Before: " + a);
        a = a.replace("isn't", "is");
        System.out.println("After: " + a);
    }

//Write a Java program to uppercase first letter of every word in a text(string).

    public static void uppercaseFirstLetterOfEveryWorld() {
        String a = "cat is white";
        String result = a.substring(0, 1).toUpperCase() + a.substring(1, 4) + a.substring(4, 5).toUpperCase() + a.substring(5, 7) + a.substring(7, 8).toUpperCase() + a.substring(8, 12);
        System.out.println(result);
    }

//Write a Java program to compare 2 strings ignoring case consideration.  (e.g: “Dog” is equal to “dOG”)

    public static void compare2Strings(String a, String b) {
        if (a.equals(b)) {
            System.out.println(a + " is equals to " + b);
        } else {
            System.out.println(a + " isn't eqals to " + b);
        }
    }
}
