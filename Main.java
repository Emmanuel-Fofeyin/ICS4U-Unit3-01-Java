/*
* This is the main code that runs with the Vehicle Class.
*
* @author  Emmanuel FN
* @version 1.0
* @since   2024-05-09
*/

/**
* This is the Main class.
*/
final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Reverses the given string using recursion.
    *
    * @param stringToReverse The string to reverse
    *
    * @return The reversed string
    */
    public static String reverseString(String stringToReverse) {
        // needs a single return value for the linter
        String returnValue = "";
        if (stringToReverse.isEmpty()) {
            returnValue = "";
        } else {
            final char firstCharacterOfString = stringToReverse.charAt(0);
            final String restOfString = stringToReverse.substring(1);

            returnValue = reverseString(restOfString) + firstCharacterOfString;
        }
        return returnValue;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        final String aString = "KFC";

        final String reversedString = reverseString(aString);
        System.out.println("The original string is: " + aString);
        System.out.println("The reversed string is: " + reversedString);

        System.out.println("\nDone.");
    }
}
