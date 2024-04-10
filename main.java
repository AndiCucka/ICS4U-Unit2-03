/*
* This is the standard Main.java starting point.
*
* @author  Andi Cucka
* @version 1.0
* @since   2024-03-27
*/

/**
* This is the Main program.
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
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // constants
        final String fruitsString = "fruits: ";
        final String poppedString = "popped: ";
        final String colorsString = "colors: ";
        final String carsString = "cars: ";
        final String lengthString = "length: ";
        final String isEmptyString = "is empty: ";

        final CarStack fruits = new CarStack();
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("cherry");
        System.out.println(fruitsString + fruits.showStack());
        System.out.println(poppedString + fruits.popItem());
        System.out.println(fruitsString + fruits.showStack());
        System.out.println(lengthString + fruits.size());
        System.out.println(isEmptyString + fruits.isEmpty());
        System.out.println("");

        final CarStack colors = new CarStack();
        colors.push("red");
        colors.push("green");
        colors.push("blue");
        System.out.println(colorsString + colors.showStack());
        System.out.println(poppedString + colors.popItem());
        System.out.println(poppedString + colors.popItem());
        System.out.println(colorsString + colors.showStack());
        System.out.println(lengthString + colors.size());
        System.out.println(isEmptyString + colors.isEmpty());
        System.out.println("");

        final CarStack cars = new CarStack();
        cars.push("BMW");
        cars.push("Ford");
        cars.push("Mazda");
        System.out.println(carsString + cars.showStack());
        System.out.println(poppedString + cars.popItem());
        System.out.println(poppedString + cars.popItem());
        System.out.println(poppedString + cars.popItem());
        System.out.println(poppedString + cars.popItem());
        System.out.println(carsString + cars.showStack());
        System.out.println(lengthString + cars.size());
        System.out.println(isEmptyString + cars.isEmpty());
        System.out.println("");

        System.out.println("\nDone.");
    }
}
